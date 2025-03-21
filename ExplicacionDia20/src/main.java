import Controlador.UsuarioControlador;
import Modelo.UsuarioDAO;
import Vista.UsuarioVista;

public class main {
    public static void main(String[] args) {
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        UsuarioVista usuarioVista = new UsuarioVista();
        UsuarioControlador usuarioControlador = new UsuarioControlador(usuarioDAO, usuarioVista);

        usuarioControlador.iniciar();

    }
}
