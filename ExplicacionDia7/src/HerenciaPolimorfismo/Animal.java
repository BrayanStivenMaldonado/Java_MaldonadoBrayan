package HerenciaPolimorfismo;

public class Animal {
    
    //Atributos
    protected String nombre;
    protected String especie;
    protected String habitat;
    protected boolean tienePelo;
    protected int cantPatas;

    
    //Constructores vacios y compuestos
    public Animal() {
    }
    
    public Animal(String nombre){
        this.nombre = nombre;
    }

    public Animal(String nombre, String especie, String habitat, boolean tienePelo, int cantPatas) {
        this.nombre = nombre;
        this.especie = especie;
        this.habitat = habitat;
        this.tienePelo = tienePelo;
        this.cantPatas = cantPatas;
    }
    
    //Método para todos los animales
    public void hacerSonido(){
        System.out.println("El animalito hace un sonido");
    }
    
    
}
