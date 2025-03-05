package SOLID.SRP;

public class Bad {
    //1. Single Responsability Principle (SRP) - Principio de Responsabilidad Única
    // Una clase debe tener una única razón para cambiar,
    // es decir, debe encargarse de una sola responsabilidad.
    
    class Report{
        public void generateReport(){
            //Genera un informe
        }
        public void saveToFile(){
            //Guarda el informe en un archivo (Violación de SRP)
        }
    }   
    //¿Qué está mal? La clase Report tiene dos responsabilidades
    //Generar el informe y guardarlo en un archivo.
}