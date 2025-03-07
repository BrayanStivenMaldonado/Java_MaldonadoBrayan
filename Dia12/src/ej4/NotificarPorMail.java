package ej4;

import java.util.ArrayList;
import java.util.List;

public class NotificarPorMail implements Notificacion {
    private static NotificarPorMail instance;

    private NotificarPorMail(){}

    @Override
    public void enviarMensajeDeConfirmacion(Orden orden) {
        ordenes.add(orden);
        System.out.println("Email enviado");
    }   
}
