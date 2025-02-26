package Dia7;

public class Coche extends Vehiculo{
    private int numeroPuertas;

    public Coche(int numeroPuertas, String marca, String modelo) {
        super(marca, modelo);
        this.numeroPuertas = numeroPuertas;
    }

    public Coche() {
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Numero de puertas: "+numeroPuertas);
        System.out.println();
    }
    
    
}
