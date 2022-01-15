package app;
import java.io.Serializable;
public class Cliente implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3777766942624711013L;
	private String nome;
	private long telefone;
	private boolean situacao;
	private double renda;
	private int quantContas;
	private Endereco endereco;
	//construtor de cliente
	public Cliente(String nome) {
		this.nome = nome;
		telefone = 0;
		renda = 0;
		situacao = false;
		quantContas = 0;
	}
	public String getNome() {
		return nome;
	}
	public long getTelefone() {
		return telefone;
	}
	public boolean getSituacao() {
		return situacao;
	}
	public double getRenda() {
		return renda;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setTelefone(long telefone) {
		this.telefone = telefone;
	}
	/*public void setSituacao(boolean situacao) {
		this.situacao = situacao;
	}*/
	public void setRenda(double renda) {
		this.renda = renda;
	}
	//verifica qual a situacap do cliente
	public String verificaSituacao() {
		if(situacao) {
			return "Ativa";
		}
		return "Inativa";
	}
	//retorna as informacoes do cliente
	public String toString() {
		return "Nome: "+ nome + " Telefone: "+ telefone + " Situação: "+ verificaSituacao()+ " Renda: "+ renda+ "\n"+ endereco.getEndereco();
	}
	//toda vez que o cliente abre uma conta incrementa em 1 a quantidade de contas
	public void incrementaContas() {
		quantContas++;
		situacao = true;
	}
	//toda vez que o cliente encerra uma conta decrementa em 1 a quantidade de contas, se chegar a menor ou igual a zero
	//a situacao do cliente se torna "inativa"
	public void decrementaContas() {
		quantContas--;
		if(quantContas <= 0) {
			situacao = false;
		}
	}
	public void setEndereco(long CEP,String pais,String cidade,String rua,int numero) {
		this.endereco = new Endereco( CEP, pais, cidade, rua, numero);
	}
	public String getEndereco() {
		return this.endereco.toString();
	}
}
