package CRUD;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CrudTXT {
    private static String archivo = "./src/CRUD/data.txt";
    private static List<Persona> personas = new ArrayList<>();
    private static List<Producto> productos = new ArrayList<>();
    
    //Cargar los datos persistentes
    public static  void cargarDatos(){
        personas.clear();
        productos.clear();
        try(BufferedReader reader = new BufferedReader(new FileReader(archivo))){
            String linea;
            while((linea = reader.readLine()) != null){
                if(linea.startsWith("P,")){
                    personas.add(Persona.fromString(linea));
                }else if(linea.startsWith("PR")){
                    productos.add(Producto.fromString(linea));
                }
            }
        }
        catch(Exception e){
            System.out.println("No se puede cargar el archivo." + e.getMessage());
        }
    }

    //Guardar datos en el archivo
    public static void guardarDatos(){
        try (FileWriter writer = new FileWriter(archivo)) {
            for (Persona p : personas) {
                writer.write(p.toString() + "\n");
            }
            for (Producto p : productos) {
                writer.write(p.toString() + "\n");
            }
        } catch (IOException e) {
            System.err.println("Error al guardar datos: " + e.getMessage());
        }
    }

    //Crear Persona
    public static void crearPersona(int id, String nombre, int edad){
        personas.add(new Persona(id,nombre,edad));
        guardarDatos();
    }

    //Crear Producto
    public static void crearProducto(int id,String nombre,double precio){
        productos.add(new Producto(id, nombre, precio));
        guardarDatos();
    }


    //Leer Personas
    public static void listarPersonas(){
        cargarDatos();
        if(personas.isEmpty()){
            System.out.println("No se pueden listar las personas porque no hay");
        }else{
            for (Persona persona : personas) {
                System.out.println(persona);
            }
        }
    }

    //Leer Productos
    public static void listarProductos(){
        cargarDatos();
        if(productos.isEmpty()){
            System.out.println("No se pueden listar los productos porque no hay");
        }else{
            for (Producto producto : productos) {
                System.out.println(producto);
            }
        }
    }

    //Actualizar Persona
    public static void actualizarPersona(int id, String nombre, int edad){
        for(Persona persona : personas){
            if(persona.getId() == id){
                persona.setNombre(nombre);
                persona.setEdad(edad);
                guardarDatos();
                return;
            }
        }
        System.out.println("Persona no existe");
    }

    //Actualizar Producto
    public static void actualizarProducto(int id, String nombre, double precio){
        for(Producto producto : productos){
            if(producto.getId() == id){
                producto.setNombre(nombre);
                producto.setPrecio(precio);
                guardarDatos();
                return;
            }
        }
        System.out.println("Producto no existe");
    }

    //Eliminar Persona
    public static void eliminarPersona(int id){
        personas.removeIf(persona -> persona.getId() == id);
        System.out.println("Persona no existe");
    }

    //Eliminar Producto
    public static void eliminarProducto(int id){
        productos.removeIf(producto -> producto.getId() == id);
        guardarDatos();
    }
}