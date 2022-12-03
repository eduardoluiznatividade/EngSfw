package model;

import java.util.ArrayList;
import java.util.List;
import model.vo.Comentario;

public class Ticket {
	private Cliente cliente;
	private List<Atendente> atendentes;
	private List<Comentario> comentarios;
	
	public Ticket() {
		this.atendentes = new ArrayList<Atendente>();
		this.comentarios = new ArrayList<Comentario>();
	}
	
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public List<Atendente> getAtendentes() {
		return atendentes;
	}
	
	public List<Comentario> getComentarios() {
		return comentarios;
	}
		
	public void addComentario(Comentario comentario) {
		this.getComentarios().add(comentario);
	}
	
	public void addAtendente(Atendente atendente) {
		this.getAtendentes().add(atendente);
	}

}
