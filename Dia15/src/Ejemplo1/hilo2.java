package Ejemplo1;

public class hilo2 implements Runnable{
    
    public void run(){
        for(int i = 0; i<=500; i++){
            System.out.println("Ejecutando hilo 2");
        }
    }
}
