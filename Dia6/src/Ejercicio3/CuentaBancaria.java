package Ejercicio3;

public class CuentaBancaria {
    
    //Atributos
    protected String numeroCuenta;
    protected double saldo;
    
    //Constructores vacios y compuestos

    public CuentaBancaria() {
    }

    public CuentaBancaria(String numeroCuenta, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }
    
    //No voy a crear un setter para el numero de cuenta
    //Razón: Para que no se modifique después de haberse creado
    
    //Getter para el saldo
    
    public double getSaldo(){
        return saldo;
    }
    
    public void depositar(double cantidad){
    if(cantidad>0){
        saldo = saldo + cantidad;
        System.out.println("El depósito fue realizado");
    }else{
        System.out.println("La cantidad a depostiar debe ser positiva. :(");
    }
    }
    
    //Método para retirar platica con validación
    
    public void retirar(double cantidad){
        if (cantidad>0 && cantidad <=saldo){
            saldo = saldo - cantidad;
            System.out.println("Su retiro fue realizado");
        }else if (cantidad>saldo){
            System.out.println("No tiene suficientes fondos");
        }else{
            System.out.println("Por favor debes ingresar una canidad positiva");
        }
    }
    
}