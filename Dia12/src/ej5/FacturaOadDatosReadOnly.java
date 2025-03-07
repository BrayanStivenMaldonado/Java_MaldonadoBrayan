package ej5;

import com.sun.jdi.ObjectCollectedException;

public class FacturaOadDatosReadOnly implements IOadRead{
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
