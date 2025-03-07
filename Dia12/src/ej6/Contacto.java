package ej6;

//En este ejemplo se está violando el principio ISP (interface segregation principle)
//Se eliminar la cuenta bancaria ya que no es algo que sea relevante al 
//momento de enviar.

public class Contacto {
    public String Nombre;
    // public String CuentaBancaria; 
    public String Email;
}