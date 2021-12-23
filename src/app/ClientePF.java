package app;

public class ClientePF extends Cliente implements Valida{
	private long CPF;
	private long RG; 
	
	public ClientePF(String nome, long CPF, long RG) {
		//chama o construtor da super classe
		super(nome);
		this.CPF = CPF;
		this.RG = RG;
	}
	public void setCPF(long newCPF) {
		CPF = newCPF;
	}
	public long getCPF() {
		return CPF;
	}
	public void setRG(long newRG) {
        RG = newRG;
    }
    public long getRG() {
        return RG;
    }
	//exibe as informacoes do cliente pessoa fisica, incluindo o cpf
	public String toString() {
		return "CPF: "+ CPF + " RG: "+ RG +" "+ super.toString();
	}
	public boolean valida(long CPF) {
		return true;
	}

}
