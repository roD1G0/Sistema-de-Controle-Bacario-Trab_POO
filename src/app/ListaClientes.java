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
		clientes = new ArrayList<Cliente>();
	}
	public void addCliente(Cliente cliente) {
		clientes.add(cliente);
	}
	public int quantClientes() {
		return clientes.size();
	}
	public void listarClientes() {
		for(int i = 0; i < clientes.size();i++)
		System.out.println(i+") "+clientes.get(i).toString());
	}
	public boolean removeCliente(int i) {
		if(i >= 0 && i < clientes.size()) {
			clientes.remove(i);
			return true;
		}
		return false;
	}
	public Cliente getCliente(int i) {
		return clientes.get(i);
	}
	public boolean incrementaContas(Cliente cliente) {
		for(int i = 0; i < clientes.size();i++) {
			if(clientes.get(i) == cliente) {
				clientes.get(i).incrementaContas();
				return true;
			}
		}
		return false;
	}
	public boolean decrementaContas(Cliente cliente) {
		for(int i = 0; i < clientes.size();i++) {
			if(clientes.get(i) == cliente) {
				clientes.get(i).decrementaContas();
				return true;
			}
		}
		return false;
	}
	public boolean setEndereco(Cliente cliente, long cep, String pais, String cidade, String rua, int num) {
		for(int i = 0; i < clientes.size();i++) {
			if(clientes.get(i) == cliente) {
				clientes.get(i).setEndereco(cep, pais, cidade, rua, num);
				return true;
			}
		}
		return false;
	}
	public boolean verificaCliente(Cliente cliente) {
		for(int i = 0; i < clientes.size();i++) {
			if(clientes.get(i) == cliente) {
				return true;
			}
		}
		return false;
	}
	public boolean altRenda(Cliente cliente, double renda) {
		for(int i = 0; i < clientes.size();i++) {
			if(clientes.get(i) == cliente) {
				clientes.get(i).setRenda(renda);
				return true;
			}
		}
		return false;
	}
	public boolean altTelefone(Cliente cliente, long telefone) {
		for(int i = 0; i < clientes.size();i++) {
			if(clientes.get(i) == cliente) {
				clientes.get(i).setTelefone(telefone);
				return true;
			}
		}
		return false;
	}
}
