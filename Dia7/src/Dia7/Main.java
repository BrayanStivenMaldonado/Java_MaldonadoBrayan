package Dia7;

import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        ArrayList<Empleado> listaEmpleados= new ArrayList<>();
        
        EmpleadoFijo em1=new EmpleadoFijo("Stiven Sanchez", 1300000);
        listaEmpleados.add(em1);
        
        EmpleadoFijo em2 = new EmpleadoFijo("Breiner Gonzales", 1500000);
        listaEmpleados.add(em2);
        
        EmpleadoFijo em3 = new EmpleadoFijo("Camilo Lopez", 2300000);
        listaEmpleados.add(em3);

        EmpleadoFijo em4 = new EmpleadoFijo("Mildred Ortega", 2900000);
        listaEmpleados.add(em4);

        EmpleadoFijo em5 = new EmpleadoFijo("Pepe Reina", 1600000);
        listaEmpleados.add(em5);
        
        EmpleadoHoras em6=new EmpleadoHoras(40, "Cristiano Ronaldo", 1200000);
        listaEmpleados.add(em6);
        
        EmpleadoHoras em7 = new EmpleadoHoras(40, "Lucero Gomez", 1200000);
        listaEmpleados.add(em7);

        EmpleadoHoras em8 = new EmpleadoHoras(55, "Lionel Messi", 1550000);
        listaEmpleados.add(em8);

        EmpleadoHoras em9 = new EmpleadoHoras(38, "Andres Lopez", 1150000);
        listaEmpleados.add(em9);

        EmpleadoHoras em10 = new EmpleadoHoras(60, "Jharedt Maldonado", 1900000);
        listaEmpleados.add(em10);
        
        
        boolean booleanito = true;
        
        while(booleanito == true){
            System.out.println("--------MENU--------");
            System.out.println("1. Agregar empleado fijo");
            System.out.println("2. Agregar empleado por horas");
            System.out.println("3. Mostrar informacion de los empleados con su bonificación");
            System.out.println("4. Salir");
            
            int n = scan.nextInt();
            scan.nextLine();
            
            switch(n){
                case 1:
                    System.out.println("Ingrese el nombre del empleado: ");
                    String nombre = scan.nextLine();
                    
                    System.out.println("Ingrese el salario del empleado");
                    double salario = scan.nextDouble();
                    scan.nextLine();
                    
                    EmpleadoFijo empleadoAgg = new EmpleadoFijo(nombre,salario);
                    listaEmpleados.add(empleadoAgg);
                    break;
                    
                case 2:
                    System.out.println("Ingrese el nombre del empleado: ");
                    String nombreHrs = scan.nextLine();
                    
                    System.out.println("Ingrese el salario del empleado");
                    double salarioHrs=scan.nextDouble();
                    scan.nextLine();
                    
                    System.out.println("Ingrese las horas trabajadas del empleado");
                    int horasTrabajadas=scan.nextInt();
                    scan.nextLine();
                    
                    EmpleadoHoras emmpleadoPorHorasAdd = new EmpleadoHoras(horasTrabajadas,nombreHrs,salarioHrs);
                    
                    listaEmpleados.add(emmpleadoPorHorasAdd);
                    break;
                    
                case 3: 
                    for (Empleado em : listaEmpleados) {
                        System.out.println("#############");
                        em.mostrarInformacion();
                        em.calcularBonificacion();
                        System.out.println("");
                    }
                    
                    break;
                    
                case 4: 
                    
                    System.out.println("Saliendo del programa...");
                    booleanito = false;
                    break;
                    
                default:
                    System.out.println("Debes ingresar una opcion valida");
                    break;
            }
        }
    }
    
}
