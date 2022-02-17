package app;

public class ContaCorrente extends Conta {

    /**
	 * 
	 */
	private static final long serialVersionUID = -8165658920708028765L;

	protected String tipoConta;
	public ContaCorrente(Cliente cliente, long senha) {
                   super(cliente, senha);
                   tipoConta = "Conta Corrente";
    }

    /*A conta corrente permite as seguintes operações:
    abrir a conta, encerrar a conta, validar a senha, verificar o saldo,
     sacar um valor e depositar um valor.
     A operação de saque é efetuada somente se
     o saldo da conta é igual ou superior ao valor que deve ser sacado.
     A operação de depósito é efetuada se o valor a ser depositado é maior do que zero.*/



    //Deposita o valor na conta
        @Override
        public void deposito(long senha, double valor, int dia) throws Exception{
            //A operação só sera efetuada se a conta estiver ativa.
            //A operação de depósito é efetuada se o valor a ser depositado é maior do que zero.
            if(!validaSenha(senha)) {
                    throw new Exception("Senha invalida");
                }
            if(!getSituacao()) {
                    throw new Exception("Conta inativa");
                }
            if(valor <= 0) {
                    throw new Exception("Valor menor ou igual a zero");
                }
            setSaldo(getSaldo()+valor);
        }

    //Apresenta o saldo da conta
    public boolean verificarSaldo(long senha)
    {
        //A operação só sera efetuada se a conta estiver ativa.
        if(validaSenha(senha) && getSituacao())
        {
            getSaldo();
            return true;
        }
        return false;
    }


    //Saca o valor da conta
        @Override
    public void saque(long senha, double valor, int dia) throws Exception{
        //A operação só sera efetuada se a conta estiver ativa.
    	//A operação de saque é efetuada somente se o saldo da conta é igual ou superior ao valor que deve ser sacado.
        if(!validaSenha(senha)){
            throw new Exception ("Senha invalida!");
        }
        if(!getSituacao()) {
            throw new Exception ("Conta inativa!");
        }
        if(valor > getSaldo()) {
            throw new Exception ("Valor maior que o saldo disponivel!");
        }
        setSaldo(getSaldo() - valor);
    }
    public String getTipoConta() {
		return this.tipoConta;
	}
    public String toString(){
    return getTipoConta() + super.toString();
    }
}
