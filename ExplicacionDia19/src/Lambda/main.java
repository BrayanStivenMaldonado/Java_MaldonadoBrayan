package Lambda;

import java.util.Random;
import java.util.function.*;

public class main {
    public static void main(String[] args) {
        //Funciones lambda
        //Las funciones lambda son funciones o métodos en Java que se representarán de manera anónima,
        //pues se definen en la lína donde se vayan a utilizar. Dichas funciones pueden recibir cero
        // o más argumentos y devolver uno o ningún valor de retorno.

        //Sintáxis
        // (parametros) -> { cuerpo de la función }
        /*/
        Parámetros: Son los valores de entrada de la función.
        Operador ->: Separa los parámetros de la implementación.
        Cuerpo de la función: Es el código que se ejecutará.

        Las expresiones lambda solo funcionan con interfaces funcionales, es decir,
        interfaces que tienen un único metodo abstracto. ALgunas interfaces funcionales predefinidas en java.util.function. incluyen:

        Function<T, R> -> Recibe un argumento y devuleve un resultado.
        Consumer<T> -> Recibe un argumento y no devuelve nada.
        Supplier<T> -> No recibe argumentos pero devuelve un resultado.
        Predicate<T> -> Recibe un argumento y devuelve true o false.


        Consumer es una interfaz funcional que representa una operación que acepta un solo argumento de entrada y no devuelve ningún resultado.
        La interfaz Consumer se utiliza comúnmente para realizar acciones o efectos secundarios sobre un objeto, como imprimirlo en consola,
        agregarlo a una colección, o cualquier otra operación que no requiera devolver un valor.
         */

        //Creación de un Consumer<String> usando una expresión lambda
        Consumer<String> consumidor = saludo ->{
            //Se declara una variable local llamada lenguaje
            String lenguaje = "Java";

            //Se imprime el saludo concatenando con una cadena adicional
            System.out.println(saludo + " Bienvenid@ a " + lenguaje + "!") ;
        };

        //Se invoca el metodo accept del consumer con un argumento "Hola pepe"
        consumidor.accept("Hola Pepe");

        //Creación de un BiConsumer<String, String> usando una expresión lambda
        BiConsumer<String, String> consumidor2 = (nombre, saludo) ->{
            //Se declara una variable local llamada lenguaje
            String lenguaje = "Java";

            //Se imprime el saludo, nombre y una cadena adicional
            System.out.println(saludo + " " + nombre + " Bienvenid@ a " + lenguaje + "!");
        };

        //Se invoca el metodo accept del BiConsumer cons dos argumentos "Pepe" y "hola"
        consumidor2.accept("Pepe","hola");

        /*/
        La interfaz funcional Supplier<T> pertenece al paquete java.util.function y se utiliza para representar un proveedor de resultados. Esta interfaz no
        toma ningún argumento y produce un resultado de tipo T. Es decir, se utiliza cuando se necesita generar o proporcionar un valor, pero no se tiene
        ningún argumento para hacerlo. Se puede pensar en ellos como una fábrica que suministra datos.
         */
        //Supplier que suministra un número aleatorio entre 1 y 100
        Supplier<Integer> generadorAleatorio = () -> new Random().nextInt(100) + 1;

        //Obtener el resultado del Supplier
        int numeroAleatorio = generadorAleatorio.get();
        System.out.println("Número aleatorio: "+numeroAleatorio);


        /*/
        La interfaz funcional Function<T, Q> pertenece al paquete java.util.function
        y se utliza para crear un metodo no explícito, que reciba parámetros y retorne un valor.
         */
        Function<String, Integer> sizeof = (String s) ->{
            return s.length();
        };
        String mensaje = "Holaaaaaaaaaa";
        int longitud = sizeof.apply(mensaje);
        System.out.println("Longitud del mensaje: "+longitud);


        /*/
        La interfaz funcional Predicate<T> perteneces al paquete java.util.function
        para retornar un valor booleano : True or false.
         */
        Predicate<Integer> esPar = numero -> numero % 2 == 0;

        System.out.println("¿4 es par? : " + esPar.test(4));
        System.out.println("¿7 es par? : " + esPar.test(7));
    }
}
