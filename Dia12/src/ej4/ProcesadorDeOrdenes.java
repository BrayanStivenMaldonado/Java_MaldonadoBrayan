package ej4;

//En este ejemplo se está violando el principio OCP (open/closed principle)
//ya que si se quiere agregar un nuevo tipo de mensaje, se debe modificar la clase de 
//procesadorDeOrdenes, por lo cual, se crea la interfaz "Notificacion" para no tener
//que hacer esto.

public class ProcesadorDeOrdenes {

	public void procesar(Orden orden, Notificacion notificacion) {
		if (orden.Isvalid() && new Repositorio().grabar(orden)) {
                    notificacion.enviarMensajeDeConfirmacion(orden);
		}
	}
}
