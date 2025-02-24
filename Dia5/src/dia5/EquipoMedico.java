package dia5;

import java.util.List;

public class EquipoMedico {
    int id; 
    String equipoMedico;
    Doctor lider;
    List<Doctor> doctoresJuniors;

    public EquipoMedico(int id, String equipoMedico, Doctor lider, List<Doctor> doctoresJuniors) {
        this.id = id;
        this.equipoMedico = equipoMedico;
        this.lider = lider;
        this.doctoresJuniors = doctoresJuniors;
    }
    
    public void agregarDoctor(Doctor doctor) {
        if (doctor != null) {
            doctoresJuniors.add(doctor);
        }
    }
    
    public void mostrarDoctoresJuniors() {
        System.out.println("Doctores Juniors del equipo " + equipoMedico + ":");
        for (Doctor doctor : doctoresJuniors) {
            System.out.println("- " + doctor);
        }
    }

    @Override
    public String toString() {
        return "Equipo Medico = " + "ID :" + id + ", Nombre :" + equipoMedico + ", Lider :" + lider + ", Doctores Juniors :" + doctoresJuniors ;
    }
    
}
