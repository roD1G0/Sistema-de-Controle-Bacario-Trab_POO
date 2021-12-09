package app;

import java.util.Date;

public class Conta {
	private static  long geraNumeros = 10000;
	private long numero;
	private Date dataAbert;
	private Date dataEncer;
	private int senha;
	private double saldo;
	private boolean situacao;
	private Cliente cliente;
	public Conta(Cliente cliente, int senha) {
		numero = geraNumeros++;
		this.cliente = cliente;
		this.senha = senha;
		dataAbert = new Date();
		saldo = 0;
		situacao = true;
		cliente.incrementaContas();
	}
	//verifica se a senha informada é igual a senha da conta
	public boolean verificaSenha(int senha) {
		if(this.senha == senha) {
			return true;
		}
		return false;
	}
	//retorna o numero da conta
	public long getNumeroConta() {
		return numero;
	}
	//retorna o saldo da conta
	public double getSaldo() {
		return saldo;
	}
	//deposita o valor na conta
	public boolean deposito(double valor) {
		saldo += valor;
		return true;
	}
	//saca o valor da conta
	public boolean saque(double valor) {
		if(valor > saldo) {
			return false;
		}
		saldo -= valor;
		return true;
	}
	//reativa a conta se a conta estiver com a situacao "inativa" e incrementa na quantidade de contas do cliente
	public boolean ativaConta() {
		if(!situacao) {
			situacao = true;
			cliente.incrementaContas();
			return true;
		}
		return false;
	}
	//encerra a conta se ela estiver ativa, muda sua situacao para "Inativa" e decrementa na quantidade de contas do cliente
	public boolean encerraConta() {
		if(situacao) {
			situacao = false;
			cliente.decrementaContas();
			dataEncer = new Date();
			return true;
		}
		return false;
	}
	//seta uma nova senha se a situcao da conta for ativa
	public boolean setSenha(int newSenha) {
		if(situacao) {
			senha = newSenha;
			return true;
		}
		return false;
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
		return "Nome cliente: "+ cliente.getNome() + " Numero: " + numero + " Saldo: "+ saldo + " Situação: " + verificaSituacao() + "\nData abertura: " + dataAbert + " Data encerramento: " + dataEncer;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
