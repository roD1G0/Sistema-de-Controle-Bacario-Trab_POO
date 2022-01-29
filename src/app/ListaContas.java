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
		contas = new ArrayList<Conta>();
	}
	public void addConta(Conta conta) {
		contas.add(conta);
	}
	public int quantContas() {
		return contas.size();
	}
	public void listarContas() { 
		for(int i = 0; i < contas.size(); i++)
		  System.out.println(i+") "+contas.get(i).toString());
	}
	public boolean removeConta(long numero) {
		for(int i = 0; i < contas.size(); i++) {
			if(numero == contas.get(i).getNumeroConta()){
				contas.remove(i);
				return true;
			}
		}
		return false;
	}
	public boolean verificaNumero(long numero) {
		for(int i = 0; i < contas.size(); i++) {
			if(numero == contas.get(i).getNumeroConta()) {
				return true;
			}
		}
		return false;
	}
	public boolean saqueConta(long numero, long senha, double valor) {
		for(int i = 0; i < contas.size(); i++) {
			if(numero == contas.get(i).getNumeroConta()){
				if(contas.get(i).saque(senha, valor))
				return true;
			}
		}
		return false;
	}
	public boolean depositaConta(long numero, long senha, double valor) {
		for(int i = 0; i < contas.size(); i++) {
			if(numero == contas.get(i).getNumeroConta()){
				if(contas.get(i).deposito(senha, valor))
				return true;
			}
		}
		return false;
		
	}
	public boolean encerraConta(long numero, long senha) {
		for(int i = 0; i < contas.size(); i++) {
			if(numero == contas.get(i).getNumeroConta()){
				if(contas.get(i).encerraConta(senha))
				return true;
			}
		}
		return false;
		
	}
	public boolean reativarConta (long numero) {
		for(int i = 0; i < contas.size(); i++) {
			if(numero == contas.get(i).getNumeroConta()){
				if(contas.get(i).ativaConta())
				return true;
			}
		}
		return false;
		
	}
	public boolean verificaSenha(long numero, long senha) {
		for(int i = 0; i < contas.size(); i++) {
			if(numero == contas.get(i).getNumeroConta() && contas.get(i).validaSenha(senha) == true) {
				return true;
			}
		}
		return false;
	}
	public boolean alterarLimite(long numero, long senha, double valor) {
		for(int i = 0; i < contas.size(); i++) {
			if(numero == contas.get(i).getNumeroConta()){
				ContaEspecial cE = (ContaEspecial)contas.get(i);
				contas.remove(i);
				if(cE.alterarLimite(senha, valor)) {
					contas.add(cE);
					return true;
				}
			}
		}
		return false;
		
	}
	public Cliente getCliente(long numero) {
		for(int i = 0; i < contas.size(); i++) {
			if(numero == contas.get(i).getNumeroConta()){
				return contas.get(i).getCliente();
			}
		}
		return null;
	}
}
