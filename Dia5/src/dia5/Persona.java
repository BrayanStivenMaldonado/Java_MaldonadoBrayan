package dia5;

import java.util.List;

public class Persona {
    int id;
    String titulo;
    String primerNombre;
    String segundoNombre;
    String apellido;
    String direccion;
    List<Hospital> hospitalesAsociados;

    public Persona(int id, String titulo, String primerNombre, String segundoNombre, String apellido, String direccion, List<Hospital> hospitalesAsociados) {
        this.id = id;
        this.titulo = titulo;
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.hospitalesAsociados = hospitalesAsociados;
    }

    public String NombreCompleto(){
        return titulo + " " + primerNombre + " " + (segundoNombre != null ? segundoNombre + " " : "") + apellido;
    }

    @Override
    public String toString() {
        return "Persona = " + "ID: " + id + ", Nombre :" + NombreCompleto() + ", Direccion :" + direccion ;
    }   
}
