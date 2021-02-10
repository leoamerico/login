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
public class Endereco implements Serializable{
 
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="idEndereco")
	private int id;	
	private String logradouro;	
	private String complemento;	
	private String numeroEndereco;	
	private String bairro;	
	private String cidade;	
	private String cep;
	
	@OneToMany(mappedBy = "endereco", fetch = FetchType.LAZY)
	@Cascade(CascadeType.SAVE_UPDATE)
	private List <PessoaFisica> pessoasFisicas = new ArrayList<PessoaFisica>(); 

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLogradouro() {
		return logradouro;
	}	
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}	
	public String getComplemento() {
		return complemento;
	}	
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}	
	public String getBairro() {
		return bairro;
	}	
	public String getNumeroEndereco() {
		return numeroEndereco;
	}
	public void setNumeroEndereco(String numeroEndereco) {
		this.numeroEndereco = numeroEndereco;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}	
	public String getCidade() {
		return cidade;
	}	
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}	
	public String getCep() {
		return cep;
	}	
	public void setCep(String cep) {
		this.cep = cep;
	}
	public List<PessoaFisica> getPessoasFisicas() {
		return pessoasFisicas;
	}
	public void addPessoasFisicas(PessoaFisica pessoaFisica) {
		this.pessoasFisicas.add(pessoaFisica);
	}
}