package Ejercicio3;

public class CuentaAhorro extends CuentaBancaria {
    private double tasaInteres;

    public CuentaAhorro(double tasaInteres, String numeroCuenta, double saldo) {
        super(numeroCuenta, saldo);
        this.tasaInteres = tasaInteres;
    }
    
    public void aplicarIntereses(){
        saldo = saldo + (saldo*tasaInteres / 100);
        System.out.println("El saldo con intereses es: "+ saldo);
    }
    
    public void estadoFinal(){
        System.out.println("# Cuenta: "+numeroCuenta+" --- saldo: "+saldo);
    }
}
