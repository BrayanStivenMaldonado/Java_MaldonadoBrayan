package ej4;

public class NotificarPorSMS implements Notificacion {
    public static NotificarPorSMS instance=null;
    
    public NotificarPorSMS(){}
    
    @Override
    public void enviarMensajeDeConfirmacion(Orden orden){
        ordenes.add(orden);
        System.out.println("SMS enviado");
    }
}
