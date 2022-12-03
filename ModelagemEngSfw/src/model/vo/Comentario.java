package model.vo;

import java.time.LocalDateTime;

public class Comentario {
	private LocalDateTime dataHora;
	private String mensagem;
	
	public Comentario(String mensagem) {
		this.dataHora = LocalDateTime.now();
		this.mensagem = mensagem;
	}

	public LocalDateTime getDataHora() {
		return dataHora;
	}

	public void setDataHora(LocalDateTime dataHora) {
		this.dataHora = dataHora;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	
}
