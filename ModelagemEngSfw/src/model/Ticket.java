package model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import exceptions.UsuarioException;
import model.vo.TipoPrioridade;
import model.vo.TipoUsuario;



public class Ticket {
	
	private LocalDateTime dataHoraAbertura;
	private LocalDateTime dataHoraFechamento;
	private String descricao;
	private TipoPrioridade prioridade;
	private Usuario cliente;
	private List<Mensagem> mensagens;
		
	public Ticket(Usuario cliente, String descricao, TipoPrioridade prioridade) throws UsuarioException {
		if (cliente.getTipoUsuario().equals(TipoUsuario.CLIENTE)) {
			this.dataHoraAbertura = LocalDateTime.now();
			this.cliente = cliente;
			this.descricao = descricao;
			this.prioridade = prioridade;
			this.mensagens = new ArrayList<Mensagem>();
		}
		
		throw new UsuarioException("Usuarios do tipo "+cliente.getTipoUsuario()+" não podem abrir ticket");
	}
	
	public LocalDateTime getDataHoraAbertura() {
		return dataHoraAbertura;
	}

	public LocalDateTime getDataHoraFechamento() {
		return dataHoraFechamento;
	}

	public String getDescricao() {
		return descricao;
	}

	public TipoPrioridade getPrioridade() {
		return prioridade;
	}

	public Usuario getCliente() {
		return cliente;
	}

	public List<Mensagem> getMensagens() {
		return mensagens;
	}

	public void adicionaMensagem(Mensagem mensagem) {
		this.getMensagens().add(mensagem);
	}
	
	public boolean podeEscalonar() {
		LocalDateTime dataHoraAtual = LocalDateTime.now();
		LocalDateTime dataHoraFechamentoSLA = this.getDataHoraAbertura().plusHours(this.getPrioridade().obtemSLA());
		
		return dataHoraAtual.isBefore(dataHoraFechamentoSLA);
		
	
	
	}
	
}
