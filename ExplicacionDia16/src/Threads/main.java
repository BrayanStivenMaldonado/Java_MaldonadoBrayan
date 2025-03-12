package Threads;

public class main {
    public static void main(String[] args) {
        //Ejemplo de PingPong
        Thread t1 = new PingPong("S");
        Thread t2 = new PingPong("P");
        
        t1.start();
        t2.start();
    }
}
