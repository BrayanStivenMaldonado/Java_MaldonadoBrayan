package dia5;

import java.time.LocalDate;
import java.util.List;


public class Doctor extends Empleados{
    boolean Asociado;
    EquipoMedico equipo;

    public Doctor(boolean Asociado, EquipoMedico equipo, LocalDate fechaVinculacion, float salario, Departamento departamento, int id, String titulo, String primerNombre, String segundoNombre, String apellido, String direccion, List<Hospital> hospitalesAsociados) {
        super(fechaVinculacion, salario, departamento, id, titulo, primerNombre, segundoNombre, apellido, direccion, hospitalesAsociados);
        this.Asociado = Asociado;
        this.equipo = equipo;
    }



    @Override
    public String toString() {
        return "Doctor = " + NombreCompleto() + ", Equipo Medico: " + (equipo != null ? equipo.equipoMedico : "Ninguno") ;
    }  

}
 
