package Ejemplo1;

public class hilo1 extends Thread { 
    @Override
    public void run(){
        for(int i = 0; i<=500; i++){
            System.out.println("Ejecutando hilo 1");
        }
    }
}
