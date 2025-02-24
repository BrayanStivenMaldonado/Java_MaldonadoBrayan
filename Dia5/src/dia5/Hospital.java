package dia5;

import java.util.List;

public class Hospital {
    int id;
    String nombre;
    String ubicacion;
    List<Paciente> pacientes;
    List<Departamento> departamentos;

    public Hospital(int id, String nombre, String ubicacion, List<Paciente> pacientes, List<Departamento> departamentos) {
        this.id = id;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.pacientes = pacientes;
        this.departamentos = departamentos;
    }

    @Override
    public String toString() {
        return "Hospital = " + "ID :" + id + ", Nombre :" + nombre + ", Ubicacion :" + ubicacion ;
    }
    
    
}
