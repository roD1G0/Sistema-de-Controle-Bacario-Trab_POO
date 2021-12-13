package app;
import java.util.ArrayList;

public class ListaClientes {
	private ArrayList<Cliente> clientes;
	
	public ListaClientes() {
		clientes = new ArrayList();
	}
	public void addCliente(Cliente cliente) {
		clientes.add(cliente);
	}
	public int quantClientes() {
		return clientes.size();
	}
	public String listarClientes(int i) { 
		return clientes.get(i).toString();
	}
	
}
