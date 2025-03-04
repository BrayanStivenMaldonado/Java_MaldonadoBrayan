package explicaciondia10;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeSet;

public class ExplicacionDia10 {
    //Conjuntos, mapas, enumeraciones y excepciones
    public static void main(String[] args) {
        System.out.println("SETS:\n");
        //SETS: 
        //Los sets son una colección desordenada de objetos en la que no se pueden
        //almacenar valores duplicados.
        TreeSet<String> treeSet = new TreeSet<>();
        
        //Agregar elementos al TreeSet
        treeSet.add("Manzana");
        treeSet.add("Banana");
        treeSet.add("Naranja");
        treeSet.add("Pera");
        
        //Mostrar los elementos del TreeSet
        System.out.println("Elementos en TreeSet: " + treeSet + "\n");
        
        //Iteración en un Árbol
        //1. Importar el "Iterator" y navegar con este iterador        
        Iterator<String> iterator = treeSet.iterator();
        
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("\n$$$$$$$$$$$$$$$$$$$$$$$$\n");
        //2. Con un for-each
        for (String elemento:treeSet){
            System.out.println(elemento);
        }
        
        //Obtener el tamaño del conjunto
        int tamanio = treeSet.size(); //Esto almacena el número de elementos del conjunto en la variable tamanio
        System.out.println("\nTamaño del conjunto: "+tamanio+"\n");
        
        //Convertir el set en un String
        String resultado = treeSet.toString(); //Esto almacena una representación en cadena del conjunto en la variable resultado
        System.out.println(resultado);
        
        System.out.println("\nMAPAS:\n");
        //MAPAS
        //Los mapas son una estructura de datos que me permite guardar información en manera de 
        //asociación de clave/valor, muy parecido a los diccionarios
        
        Map<String, Integer> hashMap = new HashMap<>();
        
        // Asignar valores al mapa usando el método put()
        hashMap.put("Juan", 25);
        hashMap.put("María", 30);
        hashMap.put("Luis", 28);
        hashMap.put("Ana", 35);

        // Acceder y mostrar los valores del HashMap
        System.out.println("Edad de Juan: " + hashMap.get("Juan"));
        System.out.println("Edad de María: " + hashMap.get("María"));
        System.out.println("Edad de Luis: " + hashMap.get("Luis"));
        System.out.println("Edad de Ana: " + hashMap.get("Ana"));
        
        //Iterar entre un mapa
        //1. Importando el iterator
        
        Iterator<Map.Entry<String, Integer>> iterator2 = hashMap.entrySet().iterator();
        while (iterator.hasNext()) {
           Map.Entry<String, Integer> entry = iterator2.next();
           String clave = entry.getKey();
           Integer valor = entry.getValue();
           System.out.println("Nombre: " + clave + ", Edad: " + valor);
        }
        System.out.println("\n$$$$$$$$$$$$$$$$$$$$$$$$\n");
        
        //2. Bucle for-each
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
        String clave = entry.getKey();
        Integer valor = entry.getValue();
        System.out.println("Nombre: " + clave + ", Edad: " + valor);
        }
        System.out.println("\n$$$$$$$$$$$$$$$$\n");
        //Instanciar un enumerador
        Pais francia = Pais.FRANCIA; 
        String nombre = francia.name(); //Devuelve un String con el nombre de la constante (FRANCIA).
        System.out.println(nombre);
        System.out.println(francia.toString()); //Devuelve un String con el nombre de la constante (FRANCIA).
        System.out.println(francia.ordinal()); //Devuelve un entero con la posición del enum según está declarada (1).
        System.out.println(francia.values()); //Devuelve un array que contiene todos los valores del enum.
    
        //Acceder a las constantes de la enumeración
        Pais miPais = Pais.ESPANA;
        
        //Obtener información del País
        String nombrePais = miPais.getNombre();
        String capitalPais = miPais.getCapital();
                
       //Imprimir información del país
        System.out.println("Pais: " + nombrePais);
        System.out.println("Capital: " + capitalPais);        
    }
}
