package Dia7;

public class MainVehiculos {

    public static void main(String[] args) {
                 
        Coche c1=new Coche(4, "Toyota", "Land Cruiser Prado");
        Moto m1=new Moto("Manillar Riser", "Yamaha", "XTZ660");
        
        System.out.println("Carro");
        c1.mostrarDetalles();
        System.out.println("Moto");
        m1.mostrarDetalles();
    }
}
