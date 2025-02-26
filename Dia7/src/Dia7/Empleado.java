package Dia7;

public class Empleado {
    private String nombre;
    private double salario;
    private String tipoEmpleado;

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public Empleado() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public String getTipoEmpleado() {
        return tipoEmpleado;
    }

    public void setTipoEmpleado(String tipoEmpleado) {
        this.tipoEmpleado = tipoEmpleado;
    }
    
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public void mostrarInformacion(){
        System.out.println("Nombre: "+nombre +"\nSalario: "+salario+"\nTipo de empleado: "+tipoEmpleado);
    }
    public void calcularBonificacion(){
        double bonificacion=(salario*10)/100;
        
        System.out.println("La bonificacion del empleado es de: "+bonificacion);
    }    
}
