package System;


/**
 * @version 1.0
 * @created 10-nov.-2024 1:00:27 a. m.
 */
public class Credencial {

	private Boolean estado;
	private Date fechaExpiracion;
	private int id;
	private String tipo;
	public Administrador m_Administrador;

	public Credencial(){

	}

	public void finalize() throws Throwable {

	}

	public int activar()(){
		return 0;
	}

	public int actualizarTipo(tipo: String)(){
		return 0;
	}

	public int desactivar()(){
		return 0;
	}

}