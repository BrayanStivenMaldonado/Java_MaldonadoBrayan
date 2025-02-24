package dia5;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;


public class Paciente extends Persona {
    LocalDate fechaNaciemiento;
    LocalDate fechaIngreso;
    String diagnostico;
    Pabellon pabellon;

    public Paciente(LocalDate fechaNaciemiento, LocalDate fechaIngreso, String diagnostico, Pabellon pabellon, int id, String titulo, String primerNombre, String segundoNombre, String apellido, String direccion, List<Hospital> hospitalesAsociados) {
        super(id, titulo, primerNombre, segundoNombre, apellido, direccion, hospitalesAsociados);
        this.fechaNaciemiento = fechaNaciemiento;
        this.fechaIngreso = fechaIngreso;
        this.diagnostico = diagnostico;
        this.pabellon = pabellon;
    }

    
    public int Edad(){
    return Period.between(fechaNaciemiento, LocalDate.now()). getYears();
    }
    
    public void asignarPabellon(Pabellon pabellon) {
        if (pabellon != null && pabellon.disponibilidad > 0){
        }else {
            System.out.println("No hay disponibilidad en el pabellon seleccionado");
        }
    }

    @Override
    public String toString() {
        return "Paciente = " + NombreCompleto() + ", Edad: " + Edad() + ", Fecha Ingreso: " + fechaIngreso + ", Diagnostico: " + diagnostico + ", Pabellon: " + (pabellon != null ? pabellon.nombre : "No asignado");
    }  
}
