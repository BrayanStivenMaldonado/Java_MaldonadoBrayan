package notasvibrantes;
import java.sql.*;

public class dbConnection {
    static String url="jdbc:mysql://127.0.0.1:3306/notasVibrantes";
    static String user="root";
    static String pass="Brayansamuel12";
    
    public static Connection conectar(){
        
        Connection con = null;
        try{
            con=DriverManager.getConnection(url,user,pass);
                System.out.println("Conexión exitosa!!");
        }catch(SQLException e){
            e.printStackTrace();
        }
            return con;
    }
    

}
