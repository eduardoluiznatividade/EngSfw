package model;

import java.util.ArrayList;
import java.util.List;
import model.vo.ComentarioN1;

public class Ticket {
	private Cliente cliente;
	private List<AtendenteN1> atendentes;
	private List<ComentarioN1> comentarios;
	
	public Ticket() {
		this.atendentes = new ArrayList<AtendenteN1>();
		this.comentarios = new ArrayList<ComentarioN1>();
	}
	
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public List<AtendenteN1> getAtendentes() {
		return atendentes;
	}
	public void setAtendentes(List<AtendenteN1> atendentes) {
		this.atendentes = atendentes;
	}
	public List<ComentarioN1> getComentarios() {
		return comentarios;
	}
	public void setComentarios(List<ComentarioN1> comentarios) {
		this.comentarios = comentarios;
	}
	
	public void addComentario(ComentarioN1 comentario) {
		this.getComentarios().add(comentario);
	}
	
	public void addAtendente(AtendenteN1 atendente) {
		this.getAtendentes().add(atendente);
	}

}
