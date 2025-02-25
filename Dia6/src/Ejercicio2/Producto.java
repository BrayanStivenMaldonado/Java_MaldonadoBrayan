package Ejercicio2;

public class Producto {
    private String codigo;
    private String nombre;
    private int cantidad;
    private double precio;

    public Producto() {
    }

    public Producto(String codigo, String nombre, int cantidad, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }
    
    //Setter y Getter para "codigo"
    public String getCodigo(){
        return codigo;
    }
    
    public void setCodigo(String codigo){
        this.codigo = codigo;
    }
    
    //Setter y Getter para "nombre"
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    //Setter y Getter para "cantidad"
    public int getCantidad(){
        return cantidad;
    }
    
    public void setCantidad(int cantidad){
        if(cantidad>0){
            this.cantidad = cantidad;
        }else{
            System.out.println("Debe ingresar una cantidad positiva :/");
        }
    }
    
    //Setter y Getter para "precio"
    public double getPrecio(){
        return precio;
    }
    
    public void setPrecio(double precio){
        if(precio>=0){
            this.precio = precio;
        }else{
            System.out.println("El precio debe ser mayor a '0'");
        }
    }
    
    //Metodo para actualizar el Stock
    public void actualizarStock(int actualizar){
        if(actualizar>0){
            cantidad = cantidad + actualizar;
        }else if(actualizar<0 && actualizar + cantidad>=0){
            cantidad = actualizar + cantidad;
        }else if(actualizar == 0){
            System.out.println("La cantidad debe ser diferente de '0'");
        }else{
            System.out.println("Estas intentando comprar mas de la cantidad disponible de este producto.");
        }  
    }
    
    //Mostrar el estado del inventario

    
}
