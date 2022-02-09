package app;

import java.util.Date;
import java.io.Serializable;
public abstract class Conta implements Serializable, Valida{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6205127090202885483L;
	private static  long geraNumeros = 10000;
	private long numero;
	private Date dataAbert;
	private Date dataEncer;
	private long senha;
	private double saldo;
	private boolean situacao;
	private Cliente cliente;
        
	public Conta(Cliente cliente, long senha) {
		numero = geraNumeros++;
		this.cliente = cliente;
		this.senha = senha;
		dataAbert = new Date();
		saldo = 0;
		situacao = true;
	}
	//verifica se a senha informada � igual a senha da conta
	public boolean validaSenha(long senha){
        if (this.senha==senha){return true;}
        else {return false;}
    }
	//retorna o numero da conta
	public long getNumeroConta() {
		return numero;
	}
	//retorna o saldo da conta
	public double getSaldo() {
		return saldo;
	}
	//retorna a situ��o da conta em formato booleano, true = ativa, false = inativa
	public boolean getSituacao() {
		return situacao;
	}
	public Cliente getCliente() {
		return this.cliente;
	}
	//deposita o valor na conta
	public abstract boolean deposito(long senha, double valor);
	//saca o valor da conta
	public abstract boolean saque(long senha, double valor);
	//reativa a conta se a conta estiver com a situacao "inativa" e incrementa na quantidade de contas do cliente
	public boolean ativaConta() {
		if(!situacao) {
			situacao = true;
			return true;
		}
		return false;
	}
	//encerra a conta se ela estiver ativa, muda sua situacao para "Inativa" e decrementa na quantidade de contas do cliente
	public boolean encerraConta(long senha) {
		if(validaSenha(senha)==true && situacao) {
			situacao = false;
			dataEncer = new Date();
			return true;
		}
		return false;
	}
	//seta uma nova senha se a situcao da conta for ativa
	public boolean setSenha(long senha, long novaSenha){
        if(validaSenha(senha)){
            this.senha=novaSenha;
            return true;
        }
        else {return false;}
    }
    
	//verifica a situacao da conta
	public String verificaSituacao() {
		if(situacao) {
			return "Ativa";
		}
		return "Inativa";
	}
	//retorna as informacoes do cliente
	public String toString() {
		return " Nome cliente: "+ cliente.getNome() + " Numero: " + numero + " Saldo: "+ saldo + " Situa��o: " + verificaSituacao() + "\nData abertura: " + dataAbert + " Data encerramento: " + dataEncer;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public boolean valida(long verifcavel) {
		if(verifcavel > 999 && verifcavel <= 99999999) {
			senha = verifcavel;
			return true;
		}
		return false;
	}
	public static void setGeraNumeros(long numero){
                geraNumeros = numero;
	}

        public abstract String getTipoConta();
}
