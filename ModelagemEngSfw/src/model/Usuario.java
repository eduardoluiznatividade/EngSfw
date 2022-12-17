package model;

import model.vo.Email;
import model.vo.Telefone;
import model.vo.TipoUsuario;

public class Usuario {
	private String nome;
	private Telefone telefone;
	private Email email;
	private TipoUsuario tipoUsuario;
	
	public Usuario(String nome, Telefone telefone, Email email, TipoUsuario tipoUsuario) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.tipoUsuario = tipoUsuario;
	}

	public String getNome() {
		return nome;
	}

	public Telefone getTelefone() {
		return telefone;
	}

	public Email getEmail() {
		return email;
	}

	public TipoUsuario getTipoUsuario() {
		return tipoUsuario;
	}
	
		
}
