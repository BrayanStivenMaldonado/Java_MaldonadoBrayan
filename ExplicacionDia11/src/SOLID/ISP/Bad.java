package SOLID.ISP;

public class Bad {
    //Interface Segregation Principle (ISP) - Principio de Segregación de Interfaces
    //Las interfaces deben ser específicas y no forzar a una clase a 
    //implementar métodos que no necesita.
    
    interface Worker{
    void work();
    void eat();
    }
    
    class Robot implements Worker{
        public void work(){
            System.out.println("Trabajando...");
        }
        
        public void eat(){
            throw new UnsupportedOperationException("¡Un robot no come!");
        }
    }
    //Robot no necesita el método eat();
    //Pero la interfaz lo obliga a implementarlo.
}
