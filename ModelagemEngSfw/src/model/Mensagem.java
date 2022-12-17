package model;

import java.time.LocalDateTime;

public class Mensagem {
	private LocalDateTime dataHoraCriacao;
	private Usuario usuario;
	private String texto;
	
	public Mensagem(Usuario usuario, String texto){
		this.dataHoraCriacao = LocalDateTime.now();
		this.usuario = usuario;
		this.texto = texto;
	}

	public LocalDateTime getDataHoraCriacao() {
		return dataHoraCriacao;
	}
	
	public Usuario getUsuario() {
		return usuario;
	}

	public String getTexto() {
		return texto;
	}
	
		
}
