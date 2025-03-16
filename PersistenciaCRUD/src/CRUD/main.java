package CRUD;

import java.util.Scanner;

import static CRUD.CrudTXT.*;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        cargarDatos();
        int opcion;

        do {
            System.out.println("CRUD persistencia de datos Java \n1. Crear Persona\n2. Crear Producto\n3. Listar Personas.\n4. Listar Productos.\n5. Actualizar Persona.\n6. Actualizar Producto.\n7. Eliminar Persona.\n8. Eliminar Producto. \n0. Salir");
            opcion = scan.nextInt();
            cargarDatos();
            switch(opcion){
                case 1:
                    System.out.println("###### Crear Persona ######\n");
                    System.out.println("id: ");
                    int id = scan.nextInt();
                    System.out.println("nombre: ");
                    String nombre = scan.next();
                    System.out.println("edad: ");
                    int edad = scan.nextInt();
                    crearPersona(id, nombre, edad);
                    guardarDatos();
                    break;
                case 2:
                    System.out.println("###### Crear Producto ######\n");
                    System.out.println("id: ");
                    int idProducto = scan.nextInt();
                    System.out.println("nombre: ");
                    scan.nextLine();
                    String nombreProducto = scan.nextLine();
                    System.out.println("precio: ");
                    double precioProducto = scan.nextDouble();
                    crearProducto(idProducto, nombreProducto, precioProducto);
                    guardarDatos();
                    break;

                case 3:
                    System.out.println("###### Listar Personas ######\n");
                    listarPersonas();
                    break;

                case 4:
                    System.out.println("###### Listar Productos ######\n");
                    listarProductos();
                    break;

                case 5:
                    System.out.println("###### Actualizar Persona ######\n");
                    System.out.println("id de la persona a actualizar: ");
                    int idActualizar = scan.nextInt();
                    System.out.println("nuevo nombre para la persona: ");
                    String nombreActualizar = scan.next();
                    System.out.println("nueva edad para la persona: ");
                    int edadActualizar = scan.nextInt();
                    actualizarPersona(idActualizar, nombreActualizar, edadActualizar);
                    guardarDatos();
                    break;

                case 6:
                    System.out.println("###### Actualizar Producto ######\n");
                    System.out.println("id del producto a actualizar: ");
                    int idProductoActualizar = scan.nextInt();
                    System.out.println("nuevo nombre para el producto: ");
                    String nombreProductoActualizar = scan.next();
                    System.out.println("nuevo precio para el producto: ");
                    double precioProductoActualizar = scan.nextDouble();
                    actualizarProducto(idProductoActualizar, nombreProductoActualizar, precioProductoActualizar);
                    guardarDatos();
                    break;

                case 7:
                    System.out.println("###### Eliminar Persona ######\n");
                    System.out.println("id de la persona a eliminar: ");
                    int idEliminar = scan.nextInt();
                    eliminarPersona(idEliminar);
                    guardarDatos();
                    break;

                case 8:
                    System.out.println("###### Eliminar Producto ######\n");
                    System.out.println("id del producto a eliminar: ");
                    int idProductoEliminar = scan.nextInt();
                    eliminarProducto(idProductoEliminar);
                    guardarDatos();
                    break;

                case 0:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opcion no valida.");
            }
        }while (opcion != 0);
        scan.close();
    }
}
