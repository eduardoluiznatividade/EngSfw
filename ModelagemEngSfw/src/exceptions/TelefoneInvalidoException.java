package exceptions;

public class TelefoneInvalidoException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public TelefoneInvalidoException(String mensagemErro) {
		super(mensagemErro);
	}
}
