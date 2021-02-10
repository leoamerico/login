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
public class Telefone implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="idTelefone")
	private int id;	
	private String ddd;	
	private String ramal;	
	private String numeroTelefone;
	private String numeroCelular;
	private String numeroComercial;
	
	@OneToMany(mappedBy = "telefone", fetch = FetchType.LAZY)
	@Cascade(CascadeType.SAVE_UPDATE)
	private List <PessoaFisica> pessoasFisicas = new ArrayList<PessoaFisica>(); 
		
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNumeroTelefone() {
		return numeroTelefone;
	}	 
	public void setNumeroTelefone(String numeroTelefone) {
		this.numeroTelefone = numeroTelefone;
	}
	public String getNumeroCelular() {
		return numeroCelular;
	}
	public void setNumeroCelular(String numeroCelular) {
		this.numeroCelular = numeroCelular;
	}
	public String getNumeroComercial() {
	    return numeroComercial;
	}
	public void setNumeroComercial(String numeroComercial) {
	    this.numeroComercial = numeroComercial;
	}
	public void setRamal(String ramal) {
		this.ramal = ramal;
	}
	public String getRamal() {
		return ramal;
	}	
	public String getDdd() {
		return ddd;
	}	 
	public void setDdd(String ddd) {
		this.ddd = ddd;
	}
	public List<PessoaFisica> getPessoasFisicas() {
		return pessoasFisicas;
	}
	public void addPessoasFisicas(PessoaFisica pessoaFisica) {
		this.pessoasFisicas.add(pessoaFisica);
	}
}