package ej2;

public class NotificarTransferencia {
     private ConexionMail conexionMail;

    public NotificarTransferencia(ConexionMail conexionMail) {
        this.conexionMail = conexionMail;
    }


    public void EnviarEmail(String auditor,String mensaje){
        Mail mail=new Mail().to(auditor).withBody(mensaje);
        conexionMail.enviar(mail);
        conexionMail.cerrar();    }
}
