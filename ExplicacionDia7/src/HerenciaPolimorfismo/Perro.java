package HerenciaPolimorfismo;


public class Perro extends Animal{

    private String raza;
    private int edad;
    private String sexo;
    
    public Perro(String nombre) {
        super(nombre);
    }
    
    public Perro(String raza, int edad, String sexo, String nombre, String especie, String habitat, boolean tienePelo, int cantPatas) {
        super(nombre, especie, habitat, tienePelo, cantPatas);
    }    

    public Perro(String raza, int edad, String sexo) {
        this.raza = raza;
        this.edad = edad;
        this.sexo = sexo;
    }

    public Perro(String raza, int edad, String sexo, String nombre) {
        super(nombre);
        this.raza = raza;
        this.edad = edad;
        this.sexo = sexo;
    }
    

    @Override
    public void hacerSonido() {
        System.out.println("El perro "+nombre+" dice guauuuuu!!!!");
    }
    
    public void moverCola(){
        System.out.println("El perrito "+nombre+" mueve la colita");
    }
    
}
