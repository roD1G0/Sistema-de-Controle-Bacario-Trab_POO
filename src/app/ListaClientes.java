package app;
import java.io.Serializable;
import java.util.ArrayList;

public class ListaClientes implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -5912104782131131137L;
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
	public boolean removeCliente(int i) {
		if(i >= 0 && i < clientes.size()) {
			clientes.remove(i);
			return true;
		}
		return false;
	}
	
}
