package Normalito;

import  java.sql.*;
import java.util.ArrayList;
import  java.util.List;

public class UsuarioDAO {
    //ATRIBUTOS DE CONEXIÓN A LA BBDD
    //jdbc:mysql://dominio:puerto/basededatos
    private String URL  = "jdbc:mysql://bcsq8lqnsgdwsndmv4yc-mysql.services.clever-cloud.com:3306/bcsq8lqnsgdwsndmv4yc";
    //jdbc:mysql://localhost:3306/miBaseDatos
    private String USER = "utgpz2kmvnt30uth";
    private String PASSWORD = "KZGYeMOKKJbQy5E28mYO";

    //Método para conectarnos a la BBDD
    private Connection conectar() throws SQLException{
        return DriverManager.getConnection(URL, USER, PASSWORD);
    };

    //Crear (CREATE)
    public void InsertarUsuario(String nombre, String email){
        String sql = "INSERT INTO Usuarios(nombre,email) VALUES(?,?)";
        try(
            Connection conexionInterna = conectar();
            PreparedStatement solicitud = conexionInterna.prepareStatement(sql)){
                //Asignar valores a las incógnitas
                solicitud.setString(1, nombre);
                solicitud.setString(2, email);

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
    public List<String> obtenerUsuarios(){
        String sql = "SELECT * FROM Usuarios";
        List<String> listaUsuarios = new ArrayList<>();
        try(
                Connection conexionInterna = conectar();
                PreparedStatement solicitud = conexionInterna.prepareStatement(sql);
                ResultSet resultado = solicitud.executeQuery();){
            while (resultado.next()){
                listaUsuarios.add(resultado.getInt("id")+
                        " - " + resultado.getString("nombre")+
                        " - " + resultado.getString("email"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listaUsuarios;
    }

    //Actualizar (UPDATE)
    //update usuarios set nombre = "Pepito", email="pepito@campuslands.com" where id = 3;
    //upadte usuarios set nombre = ?, email = ?, where id = ?;

    public void actualizarUsuario(int id, String nombre, String email){
        String sql = "UPDATE Usuarios SET nombre = ?, email = ? WHERE id = ?";
        try(
                Connection conexionInterna = conectar();
                PreparedStatement solicitud = conexionInterna.prepareStatement(sql)){
            //Asignar valores a las incógnitas
            solicitud.setString(1, nombre);
            solicitud.setString(2, email);
            solicitud.setInt(3, id);

            //Ejecución de la solicitud
            int filas = solicitud.executeUpdate();
            if(filas > 0){
                System.out.println("Usuario actualizado exitosamente!");
            }else{
                System.out.println("No se pudo actualizar el usuario con id: " + id);
            }
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }

    // Eliminar (DELETE)
    public void eliminarUsuario(int id){
        String sql = "DELETE FROM Usuarios WHERE id = ?";
        try{
            Connection conexionInterna = conectar();
            PreparedStatement solicitud = conexionInterna.prepareStatement(sql);

            solicitud.setInt(1, id);
            solicitud.executeUpdate();
            System.out.println("Usuario eliminado exitosamente!");

        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    //Mosrar por id
    public String mostrarUsuario(int id){
        String sql = "SELECT * FROM Usuarios WHERE id = ?";
        String mostrarUsuario = "";
        try{
            Connection conexionInterna = conectar();
            PreparedStatement solicitud = conexionInterna.prepareStatement(sql);

            solicitud.setInt(1, id);

            ResultSet resultado = solicitud.executeQuery();

            while (resultado.next()){
                mostrarUsuario = resultado.getInt("id")+ " - " +resultado.getString("nombre") + " - " + resultado.getString("email");
            }
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        return  mostrarUsuario;
    }
}
