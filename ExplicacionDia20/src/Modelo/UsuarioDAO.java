package Modelo;

import  java.sql.*;
import java.util.ArrayList;
import  java.util.List;

public class UsuarioDAO {
    //ATRIBUTOS DE CONEXIÓN A LA BBDD
    private static String URL  = "jdbc:mysql://bcsq8lqnsgdwsndmv4yc-mysql.services.clever-cloud.com:3306/bcsq8lqnsgdwsndmv4yc";
    private static String USER = "utgpz2kmvnt30uth";
    private static String PASSWORD = "KZGYeMOKKJbQy5E28mYO";

    //Metodo para conectarnos a la BBDD
    static Connection conectar() throws SQLException{
        return DriverManager.getConnection(URL, USER, PASSWORD);
    };

    //Crear (CREATE)
    public void InsertarUsuario(Usuario usuario){
        String sql = "INSERT INTO Usuarios(nombre,email) VALUES(?,?)";
        try(
                Connection conexionInterna = conectar();
                PreparedStatement solicitud = conexionInterna.prepareStatement(sql)){
            //Asignar valores a las incógnitas
            solicitud.setString(1, usuario.getNombre());
            solicitud.setString(2, usuario.getEmail());

            //Ejecución de la solicitud
            solicitud.executeUpdate();
            System.out.println("Usuario ingresado de manera exitosa!");
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }

    //Leer (READ)
    //select * from usuarios;
    public List<Usuario> obtenerUsuarios(){
        String sql = "SELECT * FROM Usuarios";
        List<Usuario> listaUsuarios = new ArrayList<>();
        try(
                Connection conexionInterna = conectar();
                PreparedStatement solicitud = conexionInterna.prepareStatement(sql);
                ResultSet resultado = solicitud.executeQuery();){
            while (resultado.next()){
                Usuario usuario = new Usuario();
                usuario.setId(resultado.getInt(1));
                usuario.setNombre(resultado.getString(2));
                usuario.setEmail(resultado.getString(3));

                listaUsuarios.add(usuario);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listaUsuarios;
    }

    //Actualizar (UPDATE)
    //update usuarios set nombre = "Pepito", email="pepito@campuslands.com" where id = 3;
    //upadte usuarios set nombre = ?, email = ?, where id = ?;
    public static int actualizarUsuario(Usuario usuario){
        String sql = "UPDATE Usuarios SET nombre = ?, email = ? WHERE id = ?";
        int filas = 0;
        try(
                Connection conexionInterna = conectar();
                PreparedStatement solicitud = conexionInterna.prepareStatement(sql)){
            //Asignar valores a las incógnitas
            solicitud.setString(1, usuario.getNombre());
            solicitud.setString(2, usuario.getEmail());
            solicitud.setInt(3, usuario.getId());

            //Ejecución de la solicitud
            filas = solicitud.executeUpdate();

            System.out.println("Usuario actualizado exitosamente!");
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        return filas;
    }

    // Eliminar (DELETE)
    public static int eliminarUsuario(Usuario usuario){
        String sql = "delete from Usuarios where id = ?";
        int filas = 0;
        try{
            Connection conexionInterna = conectar();
            PreparedStatement solicitud = conexionInterna.prepareStatement(sql);

            solicitud.setInt(1, usuario.getId());
            filas = solicitud.executeUpdate();
            System.out.println("Usuario eliminado exitosamente!");

        }catch (SQLException e){
            e.printStackTrace();
        }
        return filas;
    }

    //Mostrar por ID
    public static void mostrarUsuarioID(Usuario usuario){
        String sql = "select * from Usuarios where id = ?";
        String user = "";
        try{
            Connection conexionInterna = conectar();
            PreparedStatement solicitud = conexionInterna.prepareStatement(sql);

            solicitud.setInt(1, usuario.getId());
            ResultSet resultado = solicitud.executeQuery();
            while (resultado.next()){
                user = resultado.getString("id")+ " - " +resultado.getString("nombre") + " - " + resultado.getString("email");
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        System.out.println(user);
    }
}