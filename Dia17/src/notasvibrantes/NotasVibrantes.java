package notasvibrantes;
import java.util.*;
 
public class NotasVibrantes {
    private static final Scanner scanner = new Scanner(System.in);
 
    public static void main(String[] args) {
        
//        dbConnection dbc = new dbConnection();
//        dbc.conectar();

        CRUD operaciones = new CRUD();
        //operaciones.insertarCliente(1,"Brayan","Maldonado","brayanmaldonado0805@gmail.com","32490213612");
        //operaciones.leerConciertos();
        
        boolean booleanito = true;
        
        while (booleanito == true){
            
            System.out.println("---  NOTAS VIBRANTES  ---");
            System.out.println("1. Mostrar conciertos disponibles"); // terminado
            System.out.println("2. Registar cliente"); // terminado
            System.out.println("3. Vender ticket"); // terminado
            System.out.println("4. Mostrar tickets vendidos de cada concierto");
            System.out.println("5. Cancelar un ticket"); // terminado
            System.out.println("6. Ingresos totales por concierto"); //terminado
            System.out.println("7. Mostrar tickets por cliente"); // terminado
            System.out.println("8. Salir del sistema"); // terminado


            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch(opcion){
                case 1 -> { 
                    operaciones.mostrarConciertos();
                }

                case 2 -> {
                    System.out.println("Nombre del cliente: ");
                    String newName = scanner.nextLine();
                    System.out.println("Apellido del cliente");
                    String newLastName = scanner.nextLine();
                    System.out.println("Correo del cliente");
                    String newMail = scanner.nextLine();
                    System.out.println("Telefono del cliente");
                    String newPhone = scanner.nextLine();
                    operaciones.insertarCliente(newName,newLastName,newMail,newPhone);
                }
                
                case 3 -> {
                    operaciones.venderTicket();
                }
                
                case 4 -> {
                    operaciones.mostrarTicketsCC();
                }
                
                case 5 -> {
                    System.out.println("Ingrese el id del ticket que desea eliminar");
                    int ticketEliminar = scanner.nextInt();
                    operaciones.EliminarTicket(ticketEliminar);
                }
                
                case 6 -> {
                    operaciones.IngresosTotalesConcierto();
                }
                
                case 7 -> {
                    System.out.println("Ingrese el id del cliente del cual desea revisar los tickets adquiridos");
                    int mostrarTicket = scanner.nextInt(); 
                    operaciones.MostrarTicket(mostrarTicket);
                }
                
                case 8 -> {
                    System.out.println("Saliendo del sistema...");
                    booleanito = false;
                }
            }
        }
    }
}
