package br.com.login.beans.comum;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table
@Inheritance(strategy=InheritanceType.JOINED)
public class PessoaFisica extends Pessoa implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Column
	private String nome;	
	private String cpf;
	private String estadoCivil;
	private String registroGeral;
	@Temporal(javax.persistence.TemporalType.DATE)
	private Date dataNascimento;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "idEndereco",insertable=true, updatable=true)
	@Fetch(FetchMode.JOIN)
	@Cascade(CascadeType.SAVE_UPDATE)
	private Endereco endereco;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "idTelefone",insertable=true, updatable=true)
	@Fetch(FetchMode.JOIN)
	@Cascade(CascadeType.SAVE_UPDATE)
	private Telefone telefone;
	
	@OneToOne(mappedBy="usuario")
	@JoinColumn(name="idPessoaFisica")
	@Cascade(CascadeType.ALL)
	private Acesso acesso;

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	public String getEstadoCivil() {
		return estadoCivil;
	}
	public String getRegistroGeral() {
		return registroGeral;
	}
	public void setRegistroGeral(String registroGeral) {
		this.registroGeral = registroGeral;
	}
	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}
	public Telefone getTelefone() {
		return telefone;
	}
	public Acesso getAcesso() {
		return acesso;
	}
	public void setAcesso(Acesso acesso) {
		this.acesso = acesso;
	}
}