package Normalito;

import java.util.List;

public class main {
    public static void main(String[] args) {
        UsuarioDAO usuarioDAO = new UsuarioDAO();

        // Insertar un usuario
        usuarioDAO.InsertarUsuario("Brayan", "brayanmaldonado0805@gmail.com");
        usuarioDAO.InsertarUsuario("Pedro", "pedrogomez.campuslands@gmail.com");
        usuarioDAO.InsertarUsuario("Jose", "Joseperez@gmail.com");


        //Listar usuarios
        List<String> listaUsuarios = usuarioDAO.obtenerUsuarios();
        for (String usuario : listaUsuarios) {
            System.out.println(usuario);
        }

        //Actualizar usuario
        usuarioDAO.actualizarUsuario(3,"Pepe", "Pepe@campuslands.com");
        listaUsuarios = usuarioDAO.obtenerUsuarios();
        for (String usuario : listaUsuarios) {
            System.out.println(usuario);
        }

        //Eliminar usuario
        usuarioDAO.eliminarUsuario(3);
        listaUsuarios = usuarioDAO.obtenerUsuarios();
        for (String usuario : listaUsuarios) {
            System.out.println(usuario);
        }

        //Mostrar usuario por ID
        String MostrarPorID = usuarioDAO.mostrarUsuario(1);
        System.out.println(MostrarPorID);
    }
}
