package br.com.fiap.exception;

public class DBException extends Exception {

	private static final long serialVersionUID = 1L;

	public DBException() {
		super();
		// TODO Auto-generated constructor stub
	}


	public DBException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
		// TODO Auto-generated constructor stub
	}

	public DBException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 */
	public DBException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param cause
	 */
	public DBException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
	
}
