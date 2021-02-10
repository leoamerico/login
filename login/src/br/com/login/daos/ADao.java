package br.com.login.daos;

import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import br.com.login.beans.comum.Acesso;
import br.com.login.hibernate.HibernateUtil;

public class ADao {

	 Session session;
	 String msn = "Login existente, escolha outro!";
	 
	 public ADao(){
	        this.session = HibernateUtil.getSession();
	 }

	public Acesso buscarLogin(Acesso obj) {
		try {
			
		    Acesso aux = new Acesso(); 
		    this.session.beginTransaction();
			aux  =	(Acesso) this.session.createCriteria(obj.getClass())
					.add(Restrictions
						.and(Restrictions
							.like("loginAcesso",obj
								.getLoginAcesso()),Restrictions
							.like("senha", obj.getSenha())))
							.uniqueResult();
			
			this.session.getTransaction().commit();
			return aux;
		}catch(Exception e){		
		return null;
		}		
	}
	
	public Acesso validaLogin(Acesso obj) {
		try {
		    Acesso aux = new Acesso(); 
			aux  =	(Acesso) 
			this.session.createCriteria(obj.getClass())
			.add(Restrictions
				.eq("loginAcesso", obj.getLoginAcesso()))
				.uniqueResult();
			return aux;
		}catch(Exception e){		
		return null;
		}		
	}
}