package app;

import java.util.Arrays;

import exceptions.EmailInvalidoException;
import exceptions.TelefoneInvalidoException;
import model.Atendente;
import model.Cliente;
import model.Ticket;
import model.vo.Comentario;
import model.vo.Email;
import model.vo.Telefone;

public class TicketManager {

	public static void main(String[] args) {
		Email emailPessoal = null;
		Telefone telefoneResidencial = null;
		Telefone telefoneProfissional = null;
		Comentario comentarioN1 = null;
				
		Cliente cliente = null;
		Atendente atendenteN1 = null;
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
		
		atendenteN1 = new Atendente("12345", "Mario Jorge");
		comentarioN1 = new Comentario("Analisando a ocorrência");
		
		ticket = new Ticket();
		ticket.setCliente(cliente);
		ticket.addAtendente(atendenteN1);
		ticket.addComentario(comentarioN1);
			
		
	}

}
