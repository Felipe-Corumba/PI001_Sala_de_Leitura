package com.api.biblio.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="TB_USUARIO")
public class CadUsuario implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private String login;
	private String senha;
	private String nome;
	private String sobrenome;
	private String email;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "dd-MM-yyyy" )
	private LocalDate data;
	
	private int telefone;
	private String endereco;
	
	private String tipouser;
	private String curso;
	private int registromatricula;
	private int anoescolar;
	private int serie;
	
	//String para validação de e-mail
	private String regex = "^[\\w!#$%&’*+/=?`{|}~^-]+(?:\\.[\\w!#$%&’*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
	//private Pattern pattern = Pattern.compile(regex);
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if(nome.matches("[a-zA-Z]")) {
			this.nome = nome;
		}else{
			System.out.println("Parâmetros inválidos para registro. Utilize apenas letras");
		}
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		if(sobrenome.matches("[a-zA-Z]")) {
			this.sobrenome = sobrenome;
		}else {
			System.out.println("Parâmetros inválidos para registro. Utilize apenas letras");
		}
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	public String getTipouser() {
		return tipouser;
	}
	public void setTipouser(String tipouser) {
		this.tipouser = tipouser;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public int getRegistromatricula() {
		return registromatricula;
	}
	public void setRegistromatricula(int registromatricula) {
		this.registromatricula = registromatricula;
	}
	public int getAnoescolar() {
		return anoescolar;
	}
	public void setAnoescolar(int anoescolar) {
		this.anoescolar = anoescolar;
	}
	public int getSerie() {
		return serie;
	}
	public void setSerie(int serie) {
		this.serie = serie;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}	
	
}
