package app;
import java.io.Serializable;
public class Endereco implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3116167932462818251L;
	private long CEP;
	private String pais;
	private String cidade;
	private String rua;
	private int numero;
	
	public Endereco(long CEP,String pais,String cidade,String rua,int numero) {
		this.CEP = CEP;
		this.pais = pais;
		this.cidade = cidade;
		this.rua = rua;
		this.numero = numero;
	}
	public long getCEP() {
		return CEP;
	}
	public String getPais() {
		return pais;
	}
	public String getCidade() {
		return cidade;
	}
	public String getRua() {
		return rua;
	}
	public int getNumero() {
		return numero;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public void setCEP(long CEP) {
		this.CEP = CEP;
	}
	public String getEndereco() {
		return "CEP: "+ CEP +" País: "+ pais +" Cidade: "+ cidade +" Rua: "+ rua +" Número: "+numero;
	}
	

}
