package notasvibrantes;
import java.sql.*;
import java.util.Scanner;
import java.time.LocalDate;


public class CRUD {
    private static final Scanner scanner = new Scanner(System.in);
    
    public void insertarCliente(String nombre, String apellido, String correo, String telefono){
        String query = "insert into Cliente(nombre, apellido, correo, telefono) values (?,?,?,?)";
        
        try{
            Connection con = dbConnection.conectar();
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, nombre);
            ps.setString(2,apellido);
            ps.setString(3,correo);
            ps.setString(4,telefono);
            
            ps.executeUpdate();
                System.out.println("Dato insertado exitosamente");
            
    
        }catch(SQLException ex){
            System.out.println("Error al insertar dato");
            ex.printStackTrace();
        }
    }
    
    public void mostrarConciertos(){
        String query = "select * from Concierto";
        try{
            Connection con = dbConnection.conectar();
            PreparedStatement ps = con.prepareStatement(query);
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                String artista = rs.getString("artista");
                String fecha = rs.getString("fecha");
                String lugar = rs.getString("lugar");
                Double precioBase = rs.getDouble("precioBase");
                System.out.println("Id: "+id+" nombre: "+nombre+" artista: "+artista+" fecha: "+fecha+" lugar: "+lugar+" precioBase: "+precioBase);
                
            }
        }catch(SQLException ex){
            System.out.println("Error al insertar dato");
            ex.printStackTrace();
        }
    }
    
    public void MostrarTicket(int id){
        String query = "select * from Ticket where id_cliente = ?";
        
        try{
            Connection con = dbConnection.conectar();
            PreparedStatement ps = con.prepareStatement(query);
            
            ps.setInt(1,id);
            
            ResultSet rs = ps.executeQuery();
                    
            while(rs.next()){
                int idTicket = rs.getInt("id");
                int id_cliente = rs.getInt("id_cliente");
                int id_concierto = rs.getInt("id_concierto");
                int id_zona = rs.getInt("id_zona");
                double precioFinal = rs.getDouble("precioFinal");
                
                System.out.println("id: "+idTicket+" id_cliente: "+id_cliente+" id_concierto: "+id_concierto+" id_zona: "+id_zona + "precioFinal: "+precioFinal);
            }
        
        }catch(SQLException ex){
            System.out.println("Error al eliminar ticket");
            ex.printStackTrace();
        }
    }
    
    public void IngresosTotalesConcierto(){
        String query = "select Concierto.id ,Concierto.nombre ,Concierto.artista, Concierto.lugar, Concierto.fecha, SUM(Ticket.precioFinal) as ingresos_totales from Ticket join Concierto on Ticket.id_concierto = Concierto.id group by Concierto.id, Concierto.nombre, Concierto.artista, Concierto.lugar, Concierto.fecha ORDER BY Concierto.id ASC;";
        
        try{
            Connection con = dbConnection.conectar();
            PreparedStatement ps = con.prepareStatement(query);

            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                int idConcierto = rs.getInt("Concierto.id");
                String nombreConcierto = rs.getString("Concierto.nombre");
                double ingresosTotales = rs.getDouble("ingresos_totales");
                
                System.out.println("id: "+idConcierto+" nombre: "+nombreConcierto+ " Ingresos Totales: "+ingresosTotales);
            }
        }catch(SQLException ex){
            System.out.println("Error al calcular los ingresos");
            ex.printStackTrace();
        }
    }
    
    public void EliminarTicket(int id){
        String query = "delete from Ticket where id = ?";
        
        try{
            Connection con = dbConnection.conectar();
            PreparedStatement ps = con.prepareStatement(query);
            
            ps.setInt(1, id);
            
            ps.executeUpdate();
                System.out.println("Ticket eliminado exitosamente!!");
                
        }catch(SQLException ex){
            System.out.println("Error al eliminar ticket");
            ex.printStackTrace();
        }
    }
    
    public void venderTicket(){
        LocalDate fechaActual = LocalDate.now();
        String queryConciertos = "select * from Concierto";
        String queryZonas = "select * from Zona";
        String query1 = "select precioBase from Concierto where Concierto.id = ?";
        String query2 = "select precioAdicional from Zona where Zona.id = ?";
        String query3 = "select * from Cliente";
        String query4 = "insert into Ticket(id_cliente, id_concierto, id_zona, precioFinal, fechaCompra) values (?,?,?,?,?)";
        
        
        try{
            Connection con = dbConnection.conectar();
            
            PreparedStatement psC = con.prepareStatement(queryConciertos);    
            ResultSet rsC = psC.executeQuery();
            
            while(rsC.next()){
                int id = rsC.getInt("id");
                String nombre = rsC.getString("nombre");
                String artista = rsC.getString("artista");
                String fecha = rsC.getString("fecha");
                String lugar = rsC.getString("lugar");
                Double precioBase = rsC.getDouble("precioBase");
                System.out.println("Id: "+id+" nombre: "+nombre+" artista: "+artista+" fecha: "+fecha+" lugar: "+lugar+" precioBase: "+precioBase);
                
            }
            System.out.println("Ingerse el id del concierto al que va a asistir");
            
            PreparedStatement ps1 = con.prepareStatement(query1);
            int id_concierto = scanner.nextInt();
            ps1.setInt(1, id_concierto);
            ResultSet rs1 = ps1.executeQuery();
            
            double precioBase = 0;   
            if(rs1.next()){
                precioBase = rs1.getDouble("precioBase");
            }
            
            PreparedStatement psZ = con.prepareStatement(queryZonas);
            
            ResultSet rsZ = psZ.executeQuery();
            
            while(rsZ.next()){
                int id = rsZ.getInt("id");
                String nombre = rsZ.getString("nombreZona");
                String capacidad = rsZ.getString("capacidad");
                Double precio_base = rsZ.getDouble("precioAdicional");
                System.out.println("Id: "+id+" Nombre: "+nombre+" Capacidad: "+capacidad+" Precio adicional: "+precio_base);
                
            }
             
            PreparedStatement ps2 = con.prepareStatement(query2);
            int id_zona = scanner.nextInt();            
            ps2.setInt(1,id_zona);            
            ResultSet rs2 = ps2.executeQuery();
            
            double precioZona = 0;           
            if(rs2.next()){
                precioZona = rs2.getDouble("precioAdicional");
            }
            
            PreparedStatement ps3 = con.prepareStatement(query3);
            ResultSet rs3 = ps3.executeQuery();
            
            while(rs3.next()){
                int id = rs3.getInt("id");
                String nombre = rs3.getString("nombre");
                String apellido = rs3.getString("apellido");
                System.out.println("Id: "+id+" Nombre: "+nombre+" Apellido: "+apellido);
            }
            System.out.println("Ingrese el id del cliente que va a comprar el ticket");
            int idCliente = scanner.nextInt();  
            
            double precioTotal = precioBase+precioZona;            
            System.out.println("id del cliente: "+idCliente+" Precio total: "+precioTotal);
            
            PreparedStatement ps4 = con.prepareStatement(query4);
            ps4.setInt(1, idCliente);
            ps4.setInt(2,id_concierto);
            ps4.setInt(3,id_zona);
            ps4.setDouble(4,precioTotal);
            ps4.setDate(5, Date.valueOf(fechaActual));
            
            ps4.executeUpdate();
                System.out.println("Dato insertado exitosamente");

            rs1.close();
            rs2.close();
            rs3.close();
            ps1.close();
            ps2.close();
            ps3.close();
            ps4.close();
            con.close();
            
            
        }catch(SQLException ex){
            System.out.println("Error al escoger el concierto");
            ex.printStackTrace();
        } 
    }
    
    public void mostrarZonas(){
        String query = "select * from Zona";
        
        try{
            Connection con = dbConnection.conectar();
            PreparedStatement ps = con.prepareStatement(query);
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                int id = rs.getInt("id");
                String nombre = rs.getString("nombreZona");
                String capacidad = rs.getString("capacidad");
                Double precioBase = rs.getDouble("precioAdicional");
                System.out.println("Id: "+id+" Nombre: "+nombre+" Capacidad: "+capacidad+" Precio adicional: "+precioBase);
                
            }
        }catch(SQLException ex){
            System.out.println("Error al insertar dato");
            ex.printStackTrace();
        }
    }
    
    public void mostrarTicketsCC(){
        String query = "select concierto.nombre, count(id_concierto) from ticket join concierto on id_concierto = concierto.id group by 1;";
        
        try{
            Connection con = dbConnection.conectar();
            PreparedStatement ps = con.prepareStatement(query);
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){           
                String nombre = rs.getString("concierto.nombre");
                int cantidad = rs.getInt("count(id_concierto)");
                System.out.println(nombre+" cantidad: "+cantidad);
            }
        }catch(SQLException ex){
            System.out.println("Error al insertar dato");
            ex.printStackTrace();
        }
        
    }     
}
