package ej5;

public class FacturaOadDatosCRUDAndRead implements IOadCRUD,IOadRead{
    @Override
    public void Update(Object id, Object entity) {
        //Actualizar dato
    }

    @Override
    public void Insert(Object entity) {
        //Insertar dato
    }

    @Override
    public void Delete(Object id) {
        //Eliminar dato
    }
    @Override
    public Object[] GetAll() {
        // Obtener todas las facturas
        Object[] object=new Object[1];
        return object;
    }
    @Override
    public Object GetById(Object id) {
        // Obtener factura por ID
        Object object=new Object();
        return object;
    }
}
