package br.com.login.beans.comum;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table
public class Acesso implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="idAcesso")
	private int id;
	private String loginAcesso;
	private String senha;
	private String perfil;
	@Transient
	private boolean logado = false;
	
	@OneToOne
	@JoinColumn(name="idPessoa", nullable = false)
	private PessoaFisica usuario;
	
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}	
	public void setLoginAcesso(String loginAcesso) {
		this.loginAcesso = loginAcesso;
	}
	public String getLoginAcesso() {
		return loginAcesso;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getPerfil() {
		return perfil;
	}
	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}
	public void setUsuario(PessoaFisica usuario) {
		this.usuario = usuario;
	}
	public PessoaFisica getUsuario() {
		return usuario;
	}
	public void setLogado(boolean logado) {
		this.logado = logado;
	}
	public boolean isLogado() {
		return logado;
	}	
}