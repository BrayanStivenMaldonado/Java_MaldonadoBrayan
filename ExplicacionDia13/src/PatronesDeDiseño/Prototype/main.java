package PatronesDeDiseño.Prototype;

//Prototype
//Se usa para clonar objetos sin acoplar el código a sus clases concretas.
//Java proporciona Cloneable para esto.

public class main {
    static class Persona implements Cloneable{
        private String nombre;
        private int edad;

        public Persona(String nombre, int edad) {
            this.nombre = nombre;
            this.edad = edad;
        }
        
        public void mostrarInfo(){
            System.out.println("Persona: "+nombre+", Edad: "+edad);
        }
        
        @Override
        protected Object clone() throws CloneNotSupportedException{
            return super.clone();
        }
    }
    
    // Uso
    public static void main(String[] args) {
        try{
            Persona p1 = new Persona("Juan",25);
            Persona p2 = (Persona) p1.clone(); //Clonado del objeto
            
            p1.mostrarInfo();
            p2.mostrarInfo();
        }catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
    }
    
}
