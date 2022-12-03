package model.vo;

import exceptions.EmailInvalidoException;

public class Email {
	private String endereco;

	private Email () {
		super();
	}
	
	private Email(String endereco) {
		super();
		this.endereco = endereco;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public static Email parse(String string) throws EmailInvalidoException{
		// TODO Auto-generated method stub
		return new Email(string);
	}
	
	

}
