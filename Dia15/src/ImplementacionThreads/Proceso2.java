package ImplementacionThreads;

//Implementación de hilo con "implements Runnable"
public class Proceso2 implements Runnable {
    
    public void run() {
        System.out.println("Executing thread " + Thread.currentThread().getName());
    }
     
     public static void main(String[] args) throws InterruptedException {
        Thread myThread = new Thread(new Proceso2(), "myRunnable");
        myThread.start();
    }
}