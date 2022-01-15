package app;
public class ClientePF extends Cliente implements Valida{
	/**
	 * 
	 */
	private static final long serialVersionUID = 8264587340142452027L;
	private long CPF;
	
	public ClientePF(String nome, long CPF) {
		//chama o construtor da super classe
		super(nome);
		this.CPF = CPF;
		
	}
	public void setCPF(long newCPF) {
		CPF = newCPF;
	}
	public long getCPF() {
		return CPF;
	}
		//exibe as informacoes do cliente pessoa fisica, incluindo o cpf
	public String toString() {
		return "CPF: "+ CPF +" "+ super.toString();
	}
	public boolean valida(long CPF) {
		if(CPF == this.CPF) {
			return true;
		}	
		return false;
	}

}
