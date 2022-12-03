package model.vo;

import exceptions.TelefoneInvalidoException;

public class Telefone {
	private String numero;
		

	private Telefone(String numero) {
		super();
		this.numero = numero;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public static Telefone parse(String string) throws TelefoneInvalidoException{
		return new Telefone(string);
	}
	
	

}
