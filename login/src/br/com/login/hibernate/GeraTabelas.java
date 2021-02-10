package br.com.login.hibernate;

import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

import br.com.login.beans.comum.Acesso;
import br.com.login.beans.comum.Email;
import br.com.login.beans.comum.Endereco;
import br.com.login.beans.comum.Pessoa;
import br.com.login.beans.comum.PessoaFisica;
import br.com.login.beans.comum.Telefone;

public class GeraTabelas {
	public static void main(String[] args) {
		
		 AnnotationConfiguration cfg = new AnnotationConfiguration(); 

		 cfg.addAnnotatedClass(Acesso.class);
		 cfg.addAnnotatedClass(Email.class);
		 cfg.addAnnotatedClass(Endereco.class);
		 cfg.addAnnotatedClass(Pessoa.class);
		 cfg.addAnnotatedClass(PessoaFisica.class);
		 cfg.addAnnotatedClass(Telefone.class);	
		 
		 new SchemaExport(cfg).create(true, true);
		}	
}