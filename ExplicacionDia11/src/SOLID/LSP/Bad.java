package SOLID.LSP;

public class Bad {
    //Liskov Substitution Principle (LSP) - Principio de sustitución de Liskov
    //Las clases derivadas deben poder sustituir a sus clases base sin alterar el comportamiento del programa.
    class Bird{
        public void fly(){
            System.out.println("Volando....");
        }
    }
    
    class Penguin extends Bird{
        @Override
        public void fly(){
            throw new UnsupportedOperationException("¡Los pingüinos no pueden vuelan!");
        }
    }
}
