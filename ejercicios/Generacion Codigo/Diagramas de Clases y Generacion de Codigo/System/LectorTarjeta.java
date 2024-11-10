package System;


/**
 * @version 1.0
 * @created 10-nov.-2024 1:00:27 a. m.
 */
public class LectorTarjeta {

	private Boolean estado;
	private int id;
	private String tipo;
	public puerta m_puerta;
	public SistemaAlerta m_SistemaAlerta;

	public LectorTarjeta(){

	}

	public void finalize() throws Throwable {

	}

	public int enviarAlerta()(){
		return 0;
	}

	public int verificarAcceso()(){
		return 0;
	}

}