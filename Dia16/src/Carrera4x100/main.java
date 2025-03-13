package Carrera4x100;

public class main {
    public static void main(String[] args) {
        Thread t1 = new Carrera("Pepe");
        Thread t2 = new Carrera("Patroclo");
        Thread t3 = new Carrera("Candelario");
        Thread t4 = new Carrera("Sportacus");
        
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
