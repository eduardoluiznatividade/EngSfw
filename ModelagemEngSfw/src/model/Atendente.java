package model;

import model.vo.Email;
import model.vo.Telefone;
import model.vo.TipoUsuario;

public class Atendente extends Usuario{
	
	public Atendente(String nome, Telefone telefone, Email email, TipoUsuario tipoUsuario) {
		super(nome, telefone, email, TipoUsuario.ATENDENTE);
		
	}
	
}
