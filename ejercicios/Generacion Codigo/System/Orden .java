import System.Cocina;
import System.Pago;

/**
 * @version 1.0
 * @created 10-nov.-2024 5:49:54 p. m.
 */
public class Orden  {

	private String estado;
	private Date fecha;
	private Time hora;
	private int idOrden;
	public Cocina m_Cocina;
	public Pago m_Pago;

	public Orden (){

	}

	public void finalize() throws Throwable {

	}

	public void actualizarEstado(nuevoEstado: String)(){

	}

	public void agregarPlato(plato: Plato):(){

	}

	public void eliminarPlato(idPlato: int): void(){

	}

}