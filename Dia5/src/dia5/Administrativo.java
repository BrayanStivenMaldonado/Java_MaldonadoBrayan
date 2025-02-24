package dia5;

import java.time.LocalDate;
import java.util.List;

public class Administrativo extends Empleados{
    String cargo;

    public Administrativo(String cargo, LocalDate fechaVinculacion, float salario, Departamento departamento, int id, String titulo, String primerNombre, String segundoNombre, String apellido, String direccion, List<Hospital> hospitalesAsociados) {
        super(fechaVinculacion, salario, departamento, id, titulo, primerNombre, segundoNombre, apellido, direccion, hospitalesAsociados);
        this.cargo = cargo;
    }

    
    @Override
    public String toString() {
        return "Administrativo = " + NombreCompleto() + ", Cargo: " + cargo + ", Salario: $" + this.salario + ", Departamento: " + departamento.nombre;
    }
}
