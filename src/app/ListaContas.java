package app;
import java.util.ArrayList;

public class ListaContas {
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

}
