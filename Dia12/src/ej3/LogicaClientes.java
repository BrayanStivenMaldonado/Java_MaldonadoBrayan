package ej3;

import java.util.ArrayList;
import java.util.List;

//En este ejemplo se está incumpliendo el principio OCP (open/closed principle)
//ya que al momento de filtrar, si se quisiera agregar un nuevo tipo de filtrado
//se tendría que modificar la clase FiltroCliente.
//por lo cual se crea la clase abstracta TipoFiltrado para simplemente editar el tipo
//de filtrado con un override y no tener que editar ninguna clase principal.

public class LogicaClientes {

	private FiltroClientes filtro = new FiltroClientes();
	
	private List<Cliente> clientes =  new ArrayList<Cliente>();

	public List<Cliente> getClientes() {
		return clientes;
	}
        
	public List<Cliente> getClientesPorLocalidad(Localidad localidad) {
		return filtro.filtroPorTipo(clientes, new FiltroPorLocalidad(localidad));
	}
	
	public List<Cliente> getClientesPorNombre(String nombre) {
		return filtro.filtroPorTipo(clientes, new FiltradoPorNombre(nombre));
	}
	
	public List<Cliente> getClientesConSaldo() {
		return filtro.filtroPorTipo(clientes, new FiltroPorSaldo());
	}
}
