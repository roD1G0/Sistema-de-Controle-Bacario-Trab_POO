package app;

public class ClientePJ extends Cliente implements Valida{
	private long CNPJ;
	
	public ClientePJ(String nome, long CNPJ) {
		//chama o contrutor da super classe
		super(nome);
		this.CNPJ = CNPJ;
	}
	public void setCNPJ(long newCNPJ) {
		CNPJ = newCNPJ;
	}
	public long getCNPJ() {
		return CNPJ;
	}
	//retorna as informacoes do cliente pessoa juridica, incluindo seu cnpj
	public String toString() {
		return "CNPJ: " + CNPJ + " " + super.toString();
	}
	public boolean valida(long CNPJ) {
		return true;
	}

}
