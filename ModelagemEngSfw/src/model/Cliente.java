package model;

import model.vo.Email;
import model.vo.Telefone;
import model.vo.TipoUsuario;

public class Cliente extends Usuario{

		public Cliente(String nome, Telefone telefone, Email email, TipoUsuario tipoUsuario) {
			super(nome, telefone, email, TipoUsuario.CLIENTE);
		}

}
