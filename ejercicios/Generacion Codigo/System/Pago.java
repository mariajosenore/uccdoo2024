package System;


/**
 * @version 1.0
 * @created 10-nov.-2024 5:49:54 p. m.
 */
public class Pago {

	private Date fecha;
	private int idPago;
	private String metodoPago;
	private Float monto;

	public Pago(){

	}

	public void finalize() throws Throwable {

	}

	public boolean procesarPago()(){
		return false;
	}

}