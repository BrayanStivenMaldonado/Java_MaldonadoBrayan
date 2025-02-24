package dia5;

public class Pabellon {
    int id;
    String nombre;
    int capacidad;
    int disponibilidad;
    Hospital hospital;

    public Pabellon(int id, String nombre, int capacidad, int disponibilidad, Hospital hospital) {
        this.id = id;
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.disponibilidad = disponibilidad;
        this.hospital = hospital;
    }

    @Override
    public String toString() {
        return "Pabellon = " + "ID :" + id + ", Nombre Pabellon :" + nombre +", Capacidad :" + capacidad + ", Disponibilidad :" + disponibilidad + ", Hospital :" + hospital.nombre ;
    }
    
}