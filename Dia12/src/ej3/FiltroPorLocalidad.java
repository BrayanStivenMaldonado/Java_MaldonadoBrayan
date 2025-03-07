package ej3;

public class FiltroPorLocalidad implements TipoFiltrado{
    Localidad localidad;

    public FiltroPorLocalidad(Localidad localidad) {
        this.localidad = localidad;
    }

    @Override
    public Boolean CumpleTipoFiltrado(Cliente cliente) {
        return cliente.getLocalidad()==localidad;
    }
}