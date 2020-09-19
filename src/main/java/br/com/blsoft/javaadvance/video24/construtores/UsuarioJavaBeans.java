package br.com.blsoft.javaadvance.video24.construtores;

import java.util.List;

public class UsuarioJavaBeans {

	private String nome;
	private String login; 
	private String senha; 
	private String email;
	private List<String> permissoes;
	
	public UsuarioJavaBeans() {}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<String> getPermissoes() {
		return permissoes;
	}

	public void setPermissoes(List<String> permissoes) {
		this.permissoes = permissoes;
	}
		
}
