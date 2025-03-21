package Vista;

import Modelo.Usuario;
import java.util.List;
import java.util.Scanner;

//Vista
//La vista maneja la interacción con el usuario.
public class UsuarioVista {
    Scanner sc = new Scanner(System.in);

    public void mostrarUsuarios(List<Usuario> usuarios) {
        System.out.println("Lista de usuarios");
        for (Usuario usuario : usuarios) {
            System.out.println(usuario);
        }
    }

    public Usuario agregarUsuario() {
        System.out.println("Datos para nuevo usuario ");
        System.out.println("Nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Correo: ");
        String correo = sc.nextLine();
        return new Usuario(nombre, correo);
    }

    public Usuario actualizarUsuario() {
        System.out.println("Datos para nuevo usuario ");
        System.out.println("ID del usuario a actualizar: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Correo: ");
        String correo = sc.nextLine();
        return new Usuario(id, nombre, correo);
    }

    public Usuario eliminarUsuario(){
        System.out.println("Datos para eliminar usuario ");
        System.out.println("ID del usuario a eliminar: ");
        int id = sc.nextInt();
        sc.nextLine();
        return new Usuario(id);
    }

    public Usuario buscarUsuario() {
        System.out.println("ID del usuario a buscar: ");
        int id = sc.nextInt();
        sc.nextLine();
        return new Usuario(id);
    }
}