package explicaciondia10;

public class trycatch {
    //Manejo de excepciones (try-catch)
    //En Java, el bloque try-catch se usa para manejar excepciones, con el 
    //fin de evitar que un error detenga abruptamente la ejecución
    //del programa
    public static void main(String[] args) {
        try{
           int numero1 = 10;
           int numero2 = 0;
           int resultado = numero1 /numero2;
           System.out.println("El resultado es: " + resultado);
        }
        catch (Exception e){
           System.out.println("Error: No se te olvide que no puedes dividir por cero: " + e.getMessage());
        }finally{
           System.out.println("Fin del programa");
        }
    }
}
