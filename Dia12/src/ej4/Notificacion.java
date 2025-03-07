package ej4;

import java.util.ArrayList;
import java.util.List;

interface Notificacion {
    public List<Orden> ordenes = new ArrayList<Orden>();
    
    
    void enviarMensajeDeConfirmacion(Orden orden);
}
