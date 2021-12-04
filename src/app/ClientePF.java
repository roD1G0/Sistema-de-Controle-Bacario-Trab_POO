package app;

public class ClientePF extends Cliente{
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
		return "CPF: "+ CPF + " "+ super.toString();
	}

}
