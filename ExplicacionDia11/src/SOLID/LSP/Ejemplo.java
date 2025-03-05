package SOLID.LSP;

class Forma {
    public void dibujar() {
        System.out.println("Dibujando forma genérica");
    }
}

// Subclase Circulo
class Circulo extends Forma {
    @Override
    public void dibujar() {
        System.out.println("Dibujando círculo");
    }
}

// Subclase Cuadrado (Corrigiendo la mayúscula)
class Cuadrado extends Forma {
    @Override
    public void dibujar() {
        System.out.println("Dibujando cuadrado");
    }
}

// Clase principal (Corrigiendo la mayúscula)
public class Ejemplo {
    public static void dibujarForma(Forma forma) {
        forma.dibujar();
    }

    public static void main(String[] args) {
        Forma circulo = new Circulo(); 
        Forma cuadrado = new Cuadrado();

        dibujarForma(circulo);
        dibujarForma(cuadrado);
    }
}