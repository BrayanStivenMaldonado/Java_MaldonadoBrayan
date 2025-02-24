package dia6;

public class Dia6 {
    // ENCAPSULAMIENTO
    //Se refiere a la restricción del acceso a algunos
    //de los componentes de un objeto, especialmente los atributos, con el fin
    //de prevenir modificaciones no autorizadas
    
    public static void main(String[] args) {
        Persona p1 = new Persona("Zully",19);
        p1.setNombre("Alejandra");
        p1.setEdad(0);
        System.out.println(p1.getNombre());
        
        CuentaBancaria c1 = new CuentaBancaria("SAJDA423JSA",10);
        System.out.println(c1.getSaldo());
       
        c1.depositar(25);
        System.out.println(c1.getSaldo());
        
        c1.retirar(36);
        System.out.println(c1.getSaldo());
        
        c1.retirar(30);
        System.out.println(c1.getSaldo());
    }
    
}
