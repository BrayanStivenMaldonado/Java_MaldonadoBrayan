package Dia7;

public class Moto extends Vehiculo{
    private String tipoManubrio;

    public Moto(String tipoManubrio, String marca, String modelo) {
        super(marca, modelo);
        this.tipoManubrio = tipoManubrio;
    }

    public Moto() {
    }

    public String getTipoManubrio() {
        return tipoManubrio;
    }

    public void setTipoManubrio(String tipoManubrio) {
        this.tipoManubrio = tipoManubrio;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Tipo de manubrio: "+tipoManubrio);
        System.out.println();
    }
    
    
    
}
