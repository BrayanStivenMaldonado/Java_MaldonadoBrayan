package dia5;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        // Crear departamentos
        Departamento administracion = new Departamento(1, "Administracion", new ArrayList<>());
        Departamento tecnologia = new Departamento(2, "Tecnologia", new ArrayList<>());
        Departamento operaciones = new Departamento(3, "Operaciones", new ArrayList<>());

        // Crear hospital
        List<Departamento> departamentos = new ArrayList<>();
        departamentos.add(administracion);
        departamentos.add(tecnologia);
        departamentos.add(operaciones);

        Hospital hospital = new Hospital(1, "Hospital Central", "Calle 123, Bogota", new ArrayList<>(), departamentos);

        // Crear empleados administrativos
        Administrativo admin1 = new Administrativo("Gerente", LocalDate.of(2015, 6, 1), 5000, administracion,  1, "Sr.", "Carlos", "Antonio", "Gómez", "Calle 45", new ArrayList<>());
        operaciones.agregarEmpleado(admin1);
        
        // Crear empleados tecnicos
        Tecnico tecnico1 = new Tecnico(true, LocalDate.of(2018, 3, 15), 4500, tecnologia, 2, "Ing.", "Laura", "Marcela", "Rodríguez", "Avenida 90", new ArrayList<>());
        operaciones.agregarEmpleado(tecnico1);
        
        // Crear empleados de operaciones
        Operaciones doctor1 = new Operaciones(true, LocalDate.of(2017, 8, 10), 7000, operaciones, 3, "Dr.", "Fernando", "José", "Martínez", "Carrera 12", new ArrayList<>());
        operaciones.agregarEmpleado(doctor1);

        Operaciones enfermera1 = new Operaciones(false, LocalDate.of(2019, 11, 20), 4200, operaciones, 4, "Enf.", "María", "Elena", "López", "Calle 77", new ArrayList<>());
        operaciones.agregarEmpleado(enfermera1);

        // Crear pabellon
        Pabellon pabellon1 = new Pabellon(1, "Pediatría", 10, 5, hospital);

        // Crear paciente y asignarlo a un pabellón
        Paciente paciente1 = new Paciente(LocalDate.of(2000, 5, 25), LocalDate.now(), "Neumonía", pabellon1, 5, "Sr.", "Juan", "Carlos", "Pérez", "Calle 100", new ArrayList<>());
        hospital.pacientes.add(paciente1);
        
        // CREAR EQUIPO MEDICO
        
        // Crear un equipo medico vacio
        EquipoMedico equipoCirugia = new EquipoMedico(1, "Equipo de Cirugía", null, new ArrayList<>());
        
        // Crear doctor lider
        Doctor lider = new Doctor(true, equipoCirugia, LocalDate.of(2015, 5, 20), 9000, operaciones, 6, "Dr.", "Luis", "Fernando", "Ramírez", "Calle 50", new ArrayList<>());

        // Crear doctores juniors
        Doctor doctorJunior1 = new Doctor(true, equipoCirugia, LocalDate.of(2020, 3, 15), 6000, operaciones, 7, "Dr.", "Andrés", "José", "Fernández", "Avenida 23", new ArrayList<>());
        Doctor doctorJunior2 = new Doctor(true, equipoCirugia, LocalDate.of(2021, 8, 10), 5800, operaciones, 8, "Dr.", "Camilo", "David", "Gómez", "Calle 78", new ArrayList<>());

        // Agregar doctores juniors al equipo
        equipoCirugia.doctoresJuniors.add(doctorJunior1);
        equipoCirugia.doctoresJuniors.add(doctorJunior2);

        // Asignar el lder del equipo
        equipoCirugia.lider = lider;

        
        
        // Mostrar información
        System.out.println(hospital);
        System.out.println(administracion);
        System.out.println(tecnologia);
        System.out.println(operaciones);
        System.out.println(admin1);
        System.out.println(tecnico1);
        System.out.println(doctor1);
        System.out.println(enfermera1);
        System.out.println(pabellon1);
        System.out.println(paciente1);
        System.out.println(equipoCirugia);
    }
        
}