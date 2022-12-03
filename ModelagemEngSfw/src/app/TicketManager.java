package app;

import java.util.Arrays;

import exceptions.EmailInvalidoException;
import exceptions.TelefoneInvalidoException;
import model.AtendenteN1;
import model.Cliente;
import model.Ticket;
import model.vo.ComentarioN1;
import model.vo.Email;
import model.vo.Telefone;

public class TicketManager {

	public static void main(String[] args) {
		Email emailPessoal = null;
		Telefone telefoneResidencial = null;
		Telefone telefoneProfissional = null;
		ComentarioN1 comentario = null;
				
		Cliente cliente = null;
		AtendenteN1 atendente = null;
		Ticket ticket = null;
				
		try {
			emailPessoal = Email.parse("");
			telefoneResidencial = Telefone.parse("");
			telefoneProfissional = Telefone.parse("");
		
		} catch (EmailInvalidoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} catch (TelefoneInvalidoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		cliente = new Cliente();
		cliente.setNome("");
		cliente.setTelefones(Arrays.asList(telefoneProfissional, telefoneResidencial));
		cliente.setEmail(emailPessoal);
		
		atendente = new AtendenteN1("12345", "Mario Jorge");
		comentario = new ComentarioN1("Analisando a ocorrência");
		
		ticket = new Ticket();
		ticket.setCliente(cliente);
		ticket.addAtendente(atendente);
		ticket.addComentario(comentario);
			
		
	}

}
