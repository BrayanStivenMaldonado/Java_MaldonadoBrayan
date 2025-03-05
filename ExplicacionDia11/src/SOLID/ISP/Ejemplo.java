package SOLID.ISP;

interface Animal{
    public abstract void Correr();
    public abstract void Sonido();
    public abstract void Nadar();
}

// Implementamos las clases segun puedan
class Leon implements Animal {
    @Override
    public void Correr() {
        System.out.println("Corriendo");
    }
    
    @Override
    public void Sonido() {
        System.out.println("Roarrrr");
    }
    
    @Override
    public void Nadar() {
        System.out.println("Nadando");
    }
}

class Perro implements Animal {
    @Override
    public void Correr() {
        System.out.println("Corriendo");
    }
    
    @Override
    public void Sonido() {
        System.out.println("Guau");
    }
    
    @Override
    public void Nadar() {
        System.out.println("Nadando");
    }
}

class Gato implements Animal {
    @Override
    public void Correr() {
        System.out.println("Corriendo");
    }
    
    @Override
    public void Sonido() {
        System.out.println("Miau");
    }
    
    @Override
    public void Nadar() {
        System.out.println("No le gusta el agua");
    }
}

// Los peces solo nadan
class Pescado implements Animal {
    @Override
    public void Correr() {
        System.out.println("No puede correr");
    }
    
    @Override
    public void Sonido() {
        System.out.println("No hace sonido");
    }
    
    @Override
    public void Nadar() {
        System.out.println("El mejor nadador");
    }
}

// Clase principal para ejecutar el programa
public class Ejemplo {
    public static void main(String[] args) {
        Leon leon = new Leon();
        Perro perro = new Perro();
        Gato gato = new Gato();
        Pescado pescado = new Pescado();

        System.out.println("--- LEON ---");
        leon.Correr();
        leon.Sonido();
        leon.Nadar();
        System.out.println("--- PERRO ---");
        perro.Correr();
        perro.Sonido();
        perro.Nadar();
        System.out.println("--- GATO ---");
        gato.Correr();
        gato.Sonido();
        gato.Nadar();
        System.out.println("--- PESCADO ---");
        pescado.Correr();
        pescado.Sonido();
        pescado.Nadar();
    }
}
