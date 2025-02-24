package dia5;

import java.time.LocalDate;
import java.util.List;

public class Tecnico extends Empleados {
    boolean esTecnologia;

    public Tecnico(boolean esTecnologia, LocalDate fechaVinculacion, float salario, Departamento departamento, int id, String titulo, String primerNombre, String segundoNombre, String apellido, String direccion, List<Hospital> hospitalesAsociados) {
        super(fechaVinculacion, salario, departamento, id, titulo, primerNombre, segundoNombre, apellido, direccion, hospitalesAsociados);
        this.esTecnologia = esTecnologia;
    }

    

    @Override
    public String toString() {
        return "Técnico = " + NombreCompleto() + ", Área: " + (esTecnologia ? "Tecnologia" : "Tecnico") + ", Departamento: " + departamento.nombre;
    }
}
