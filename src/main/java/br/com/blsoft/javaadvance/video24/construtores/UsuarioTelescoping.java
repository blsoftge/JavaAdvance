package br.com.blsoft.javaadvance.video24.construtores;

import java.util.List;

public class UsuarioTelescoping {

	private String nome;
	private String login; 
	private String senha; 
	private String email;
	private List<String> permissoes;
	
	public UsuarioTelescoping(String login, String senha, String email) {
		super();
		this.login = login;
		this.senha = senha;
		this.email = email;
	}
	
	public UsuarioTelescoping(String login, String senha, String email, List<String> permissoes) {
		super();
		this.login = login;
		this.senha = senha;
		this.email = email;
		this.permissoes = permissoes;
	}
	
	public UsuarioTelescoping(String nome, String login, String senha, String email, List<String> permissoes) {
		super();
		this.nome = nome;
		this.login = login;
		this.senha = senha;
		this.email = email;
		this.permissoes = permissoes;
	}
	

		
}
