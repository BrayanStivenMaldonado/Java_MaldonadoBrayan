package ImplementacionThreads;

//Implementacion de hilo con "extends Thread"
public class Proceso1 extends Thread{

    public Proceso1(String name) {
        super(name);
    }
    
    @Override
    public void run() {
        System.out.println("Executing thread " + Thread.currentThread().getName());
    }
    
    public static void main(String[] args) throws InterruptedException {
        Proceso1 myThread1 = new Proceso1("myThread");
        myThread1.start();
    }  
}