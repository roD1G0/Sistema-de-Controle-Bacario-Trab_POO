package app;
import java.util.ArrayList;
import java.io.Serializable;
public class ListaContas implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6012310947413061783L;
	private ArrayList <Conta> contas;
	
	public ListaContas() {
		contas = new ArrayList();
	}
	public void addConta(Conta conta) {
		contas.add(conta);
	}
	public int quantContas() {
		return contas.size();
	}
	public String listarContas(int i) { 
		return contas.get(i).toString();
	}
	public boolean removeConta(int i) {
		if(i >= 0 && i < contas.size()) {
			contas.remove(i);
			return true;
		}
		return false;
	}

}
