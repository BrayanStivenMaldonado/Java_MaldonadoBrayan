package dia6;

public class Persona {
    
    //Atributos 
    private String nombre;
    private int edad;
    
    //Constructores  
    public Persona(){}

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    //Getters y Setters
    //Son métodos que permiten obtener o modificar atributos privados
    //de una clase
    
    public String getNombre(){
        return "Tu nombre es: "+nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
   
    public int getEdad(){
        return edad;
    }
    
    public void setEdad(int edad){
    if(edad>0){
        this.edad = edad;
    }else{
        System.out.println("La edad no es válida, pues debe ser mayor a '0'");
    }
    }
 
}
