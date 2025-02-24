package Ejercicio1;

class Dia6 {

    public static void main(String[] args) {
        //Agregar valores a la clase
        Empleado e1 = new Empleado("Brayan",1,1300000);
        //Get y Set de "Nombre"
        e1.setNombre("Stiven");
        System.out.println(e1.getNombre());
        
        //Get de "id"
        System.out.println(e1.getId());
        
        //Get y Set de "Salario"
        e1.setSalario(-1300000);
        e1.setSalario(2300000);
        System.out.println(e1.getSalario());
        
        //Metodo para mostrar informacion
        e1.mostrarInformacion();
    }
    
}
