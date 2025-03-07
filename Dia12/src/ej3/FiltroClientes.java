package ej3;

import java.util.ArrayList;
import java.util.List;

public class FiltroClientes {
    public List<Cliente> filtroPorTipo(List<Cliente> ListClientes, TipoFiltrado tipoFiltrado){
        List<Cliente> filteredList = new ArrayList<Cliente>();
        for (Cliente cliente:ListClientes){
            if (tipoFiltrado.CumpleTipoFiltrado( cliente)){
                filteredList.add(cliente);
            }
        }
        return filteredList;
    }
}