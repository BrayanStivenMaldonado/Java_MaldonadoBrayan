package Ejercicio2;

public class Main {

    public static void main(String[] args) {
        
       // Instanciar varios objetos de Producto. 
       Producto p1 = new Producto("a1","arroz",10,2000);
       Producto p2 = new Producto("a2","lentejas",5,2500);
       Producto p3 = new Producto("a3","pastas",7,3000);
       Producto p4 = new Producto("a4","sal",2,1200);
       
       
       System.out.println(p1.getCantidad());
       p1.actualizarStock(-12);
       System.out.println(p1.getCantidad());
       p1.actualizarStock(-8);
       System.out.println(p1.getCantidad());
       p1.actualizarStock(3);
       System.out.println(p1.getCantidad());     
    }   
}
