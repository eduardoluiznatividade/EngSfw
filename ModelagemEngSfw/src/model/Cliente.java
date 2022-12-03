package model;

import java.util.List;

import model.vo.Email;
import model.vo.Telefone;

public class Cliente {
	
	private String nome;
	private List<Telefone> telefones;
	private Email email;
	private List<Ticket> tikets;
	
	
	public Cliente() {
		super();
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public List<Telefone> getTelefones() {
		return telefones;
	}
	
	public void setTelefones(List<Telefone> telefone) {
		this.telefones = telefone;
	}
	
	public Email getEmail() {
		return email;
	}
	
	public void setEmail(Email email) {
		this.email = email;
	}
	
	public List<Ticket> getTikets() {
		return tikets;
	}
	
	public void setTikets(List<Ticket> tikets) {
		this.tikets = tikets;
	}
	
	

}
