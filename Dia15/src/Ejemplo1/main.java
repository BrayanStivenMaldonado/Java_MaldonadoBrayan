package Ejemplo1;

//Se demuestra que se están ejecutando al mismo tiempo ya que
//en consola se cruzan los mensajes de ambos hilos.
public class main {

    public static void main(String[] args) {
        hilo1 h1 = new hilo1();
        Thread h2 = new Thread(new hilo2());
        
        h1.start();
        h2.start();
    }
    
}
