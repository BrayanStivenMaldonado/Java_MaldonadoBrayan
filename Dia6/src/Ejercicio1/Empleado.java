package Ejercicio1;

public class Empleado {
    //Atributos
    private String nombre;
    private int id;
    private double salario;
    
    //Constructores

    public Empleado() {}

    public Empleado(String nombre, int id, double salario) {
        this.nombre = nombre;
        this.id = id;
        this.salario = salario;
    }
    
    //Getter y Setter para el atributo "nombre"
    public String getNombre(){
        return "Tu nombre es: "+nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    //Getter para el atributo "id"
    //No le incluyo el setter a este atributo ya que no hay necesidad de cambiarlo 
    //después de que ingresa al sistema
    public int getId(){
        return id;
    }
    
    //Getter y Setter para el atributo "salario"
    public double getSalario(){
        return salario;
    }
    
    public void setSalario(double salario){
        if(salario>0){
            this.salario = salario;
            System.out.println("Cambio realizado exitosamente");
        }else{
            System.out.println("Debes ingresar un valor positivo");
        }
    }   
    
    public void mostrarInformacion(){
        System.out.println("nombre: "+nombre+", id: "+id+", salario: "+salario);
    }
    
}
