package Service;

import exceptions.UsuarioException;
import model.Mensagem;
import model.Ticket;
import model.Usuario;
import model.vo.TipoPrioridade;


public class TicketService {
	
	public Ticket abreTicket(Usuario cliente, String descricao, TipoPrioridade prioridade) throws UsuarioException {
		return new Ticket(cliente, descricao, prioridade);
		
	}
	
	public void adicionaMensagem(Ticket ticket, Mensagem mensagem) {
		ticket.adicionaMensagem(mensagem);
	}
	
	public Ticket escalarTicket(Ticket ticket) {
		return ticket;
		
	}

}
