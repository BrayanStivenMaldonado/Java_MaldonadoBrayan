package SOLID.DIP;

public class Bad {
    //Dependency Inversion Principle (DIP) - Principio de Inversión de Dependencias
    //Las clases deben depender de las asbtracciones en lugar de depender directamente de clases
    
    class MySQLDatabase{
        public void connect(){
            System.out.println("Conectando a MySQL...");
        }
    }
    
    class DataManager{
        private MySQLDatabase database;
        
        public DataManager(){
            this.database = new MySQLDatabase();
        }
        
        public void connect(){
            database.connect();
        }
    }
    //¿Qué está mal? Datamanager depende directamente de MySQLDatabase,
    //lo que hace dificil cambiar la base de datos.
}
