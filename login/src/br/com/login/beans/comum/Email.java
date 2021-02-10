package br.com.login.beans.comum;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
@Table
public class Email implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="idEmail")
	private int id;	
	public String loginEmail;	
	public String contato;
	
	@OneToMany(mappedBy = "email", fetch = FetchType.LAZY)
	@Cascade(CascadeType.SAVE_UPDATE)
	private List <Pessoa> pessoas = new ArrayList<Pessoa>();

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLoginEmail() {
		return loginEmail;
	}	
	public void setLoginEmail(String loginEmail) {
		this.loginEmail = loginEmail;
	}
	public String getContato() {
		return contato;
	}
	public void setContato(String contato) {
		this.contato = contato;
	}
	public void setPessoas(Pessoa pessoa) {
		this.pessoas.add(pessoa);
	}
	public List <Pessoa> getPessoas() {
		return pessoas;
	}

}