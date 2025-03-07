package ej3;

public class FiltroPorSaldo implements TipoFiltrado{
     @Override
    public Boolean CumpleTipoFiltrado(Cliente cliente) {
        return cliente.getSaldo()>0;
    }
}
