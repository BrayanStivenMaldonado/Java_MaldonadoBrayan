package SOLID.SRP;

public class Good {
    class Report{
        public void generateReport(){
            //Genera un informe
        }
    }
    
    class ReportSaver{
        public void saveToFile(String fileName, Report report){
            //Guarda el informe en un archivo
        }
    }
}

