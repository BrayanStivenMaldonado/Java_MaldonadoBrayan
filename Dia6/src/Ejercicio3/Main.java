package Ejercicio3;

public class Main {

    public static void main(String[] args) {
        CuentaAhorro c1 = new CuentaAhorro(19,"SAJDA423JSA",100000);
        System.out.println(c1.getSaldo());
       
        c1.depositar(25000);
        System.out.println(c1.getSaldo());
        
        c1.retirar(36000);
        System.out.println(c1.getSaldo());
        
        c1.retirar(30000);
        System.out.println(c1.getSaldo());
        
        c1.depositar(400000);
        System.out.println(c1.getSaldo());
        
        c1.aplicarIntereses();
        
        c1.estadoFinal();
        
    }
    
}
