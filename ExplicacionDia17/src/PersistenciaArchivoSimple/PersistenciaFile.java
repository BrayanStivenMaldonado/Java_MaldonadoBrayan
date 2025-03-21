package PersistenciaArchivoSimple;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class PersistenciaFile {
    private static final String nombre_archivo = "./src/PersistenciaArchivoSimple/data.txt";
    
    //Método para guardar
    public static void guardarDatos(String contenido){
        try(FileWriter guardar = new FileWriter(nombre_archivo)){
            guardar.write(contenido);
            
        }
        catch(IOException e){
            System.out.println("Error al momento de guardar: " + e.getMessage());
        }
    }
    
    //Método para leer
    public static void leerDatos(){
        try(BufferedReader lector = new BufferedReader(new FileReader(nombre_archivo))){
            String linea;
            System.out.println("Contenido del archivo: ");
            while((linea = lector.readLine()) != null){
                System.out.println(linea);
            }
        }
        catch(IOException e){
            System.out.println("Error al momento de leer: " + e.getMessage());
        }
    }
}
