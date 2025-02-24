package dia5;

import java.time.LocalDate;
import java.util.List;

public class Empleados extends Persona{
    LocalDate fechaVinculacion;
    float salario;
    Departamento departamento;

    public Empleados(LocalDate fechaVinculacion, float salario, Departamento departamento, int id, String titulo, String primerNombre, String segundoNombre, String apellido, String direccion, List<Hospital> hospitalesAsociados) {
        super(id, titulo, primerNombre, segundoNombre, apellido, direccion, hospitalesAsociados);
        this.fechaVinculacion = fechaVinculacion;
        this.salario = salario;
        this.departamento = departamento;
    }

    

    @Override
    public String toString() {
        return "Empleado = " + NombreCompleto() + ", Departamento: " + departamento.nombre + ", Salario: $" + salario;
    }   
}
