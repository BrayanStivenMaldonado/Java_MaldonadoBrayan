package Controlador;

//Controlador
//Permite manejar los datos
//entre el modelo y la vista

import Modelo.Usuario;
import Modelo.UsuarioDAO;
import Vista.UsuarioVista;
import java.util.Scanner;

public class UsuarioControlador {
    private UsuarioDAO usuarioDAO;
    private UsuarioVista usuarioVista;
    private Scanner scanner;

    public UsuarioControlador(UsuarioDAO usuarioDAO, UsuarioVista usuarioVista) {
        this.usuarioDAO = usuarioDAO;
        this.usuarioVista = usuarioVista;
        this.scanner = new Scanner(System.in);
    }

    public void iniciar(){
        boolean booleanito = true;
        while (booleanito == true){
            System.out.println("Menu Principal ");
            System.out.println("1. Crear Usuario\n2. Listar Usuarios\n3. Actualizar Usuario\n4. Eliminar Usuario\n5. Buscar Usuario con ID\n6. Salir");
            System.out.println(":");
            int opcion = scanner.nextInt();

            switch (opcion){
                case 1:
                    Usuario nuevoUsuario = usuarioVista.agregarUsuario();
                    usuarioDAO.InsertarUsuario(nuevoUsuario);
                    System.out.println("Usuario agregado");
                    break;
                case 2:
                    usuarioVista.mostrarUsuarios(usuarioDAO.obtenerUsuarios());
                    break;

                case 3:
                    UsuarioDAO.actualizarUsuario(usuarioVista.actualizarUsuario());
                    break;

                case 4:
                    UsuarioDAO.eliminarUsuario(usuarioVista.eliminarUsuario());
                    break;

                case 5:
                    UsuarioDAO.mostrarUsuarioID(usuarioVista.buscarUsuario());
                    break;

                case 6:
                    booleanito = false;
                    break;

            }
        }
    }
}
