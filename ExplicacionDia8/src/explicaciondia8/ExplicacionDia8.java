package explicaciondia8;

import java.util.ArrayList;

public class ExplicacionDia8 {
    //Estructuras de datos
    //Una estructura de datos es una forma organizada de almacenar, gestionar
    //y manipular datos para que puedan ser utilizados de manera eficiente
    public static void main(String[] args) {
        //Arreglos
        //Un arreglo es una estructura de datos que posibilita la agrupación de 
        //elementos del mismo tipo en una sola variable
        int[] arreglito;
        //Un arreglo debe inicializar para que tenga un espacio de memoria
        int[] arreglito2 = new int[5];
        arreglito2[0] = 8;
        System.out.println(arreglito2[0]);
        System.out.println(arreglito2.length);
        
        for(int i=0; i<arreglito2.length;i++){
            System.out.println(arreglito2[i]);
        }
        
        //Matrices
        //Las matrices son arreglos multidimensionales, donde en Java se
        //crea comúnmente las de dos dimensiones
        System.out.println(" \n----Matrices----");
        int cantFilas = 3;
        int cantCol = 2;
        int[][] matriz = new int[cantFilas][cantCol];
        matriz[0][0] = 1;
        matriz[0][1] = 2;
        matriz[1][0] = 3;
        matriz[1][1] = 4;
        matriz[2][0] = 5;
        matriz[2][1] = 6; 
        
        for(int f = 0; f<cantFilas; f++){
            for(int c = 0; c<cantCol; c++){
                System.out.println(matriz[f][c]);
            }
        }
        
        //ArrayList 
        // Declaración de un ArrayList de "String". Puede ser de cualquier otro Elemento u Objeto (float, Boolean, Object, ...)
        ArrayList<String> nombreArrayList = new ArrayList<String>();

        // Añade el elemento al ArrayList
        nombreArrayList.add("Elemento");

        // Añade el elemento al ArrayList en la posición 'n'
        nombreArrayList.add(1, "Elemento 2");

        // Devuelve el numero de elementos del ArrayList
        nombreArrayList.size();

        // Devuelve el elemento que esta en la posición '2' del ArrayList
        nombreArrayList.get(1);

        // Comprueba se existe del elemento ('Elemento') que se le pasa como parametro
        nombreArrayList.contains("Elemento");

        // Devuelve la posición de la primera ocurrencia ('Elemento') en el ArrayList  
        nombreArrayList.indexOf("Elemento");

        // Devuelve la posición de la última ocurrencia ('Elemento') en el ArrayList   
        nombreArrayList.lastIndexOf("Elemento");

        // Borra el elemento de la posición '5' del ArrayList   
        nombreArrayList.remove(1); 

        // Borra la primera ocurrencia del 'Elemento' que se le pasa como parametro.  
        nombreArrayList.remove("Elemento");

        //Borra todos los elementos de ArrayList   
        nombreArrayList.clear();

        // Devuelve True si el ArrayList esta vacio. Sino Devuelve False   
        nombreArrayList.isEmpty();

        // Copiar un ArrayList 
        ArrayList arrayListCopia = (ArrayList) nombreArrayList.clone();

        // Pasa el ArrayList a un Array 
        Object[] array = nombreArrayList.toArray();
    } 
}
