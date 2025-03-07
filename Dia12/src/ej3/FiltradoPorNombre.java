package ej3;

public class FiltradoPorNombre implements TipoFiltrado {
     String nombre;

    public FiltradoPorNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public Boolean CumpleTipoFiltrado(Cliente cliente) {
        return cliente.getNombre()==nombre;
    }
}