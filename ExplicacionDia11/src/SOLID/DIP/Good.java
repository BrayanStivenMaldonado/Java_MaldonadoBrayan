package SOLID.DIP;

public class Good {
    interface Database{
        void connect();
    }
    
    class MySQLDatabase implements Database{
        public void connect(){
            System.out.println("Conectando a MySQL...");
        }
    }

    class PostgreSQLDatabase implements Database{
        public void connect(){
            System.out.println("Conectando a PostgreSQL...");
        }
    }
    
    class DataManager{
        private Database database = new PostgreSQLDatabase();
        
        public DataManager(Database database){
            this.database = database;
        }
        
        public void connect(){
            database.connect();
        }
    }
}
