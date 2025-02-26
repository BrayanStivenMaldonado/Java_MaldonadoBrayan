package Dia7;

public class EmpleadoFijo extends Empleado{

    public EmpleadoFijo(String nombre, double salario) {
        super(nombre, salario);
        super.setTipoEmpleado("Empleado fijo");
    }

    @Override
    public void calcularBonificacion() {
        double bonificacion=(super.getSalario()*20)/100;
        
        System.out.println("La bonificacion del empleado es de: "+bonificacion);
    }       
}
