package app;

public class ContaEspecial extends ContaCorrente {

    /**
	 * 
	 */
	private static final long serialVersionUID = -4636050053938698024L;
	private double limite;

    /*A conta especial é uma conta corrente que possui um limite, ou seja,
    a operação de saque considera o saldo da conta acrescido do limite
    para decidir se o saque é efetuado ou não. Além das operações da conta corrente,
    a conta especial permite alterar o limite.*/

    public ContaEspecial(Cliente cliente, long senha, double limite) {
        super(cliente, senha);
        this.limite = limite;
        tipoConta = "Conta Especial";
    }


    //Altera o limite da conta
    public void alterarLimite(long senha, double nLimite) throws Exception
    {
        //A operação só sera efetuada se a conta estiver ativa.
        if(!validaSenha(senha)) {
             throw new Exception ("Senha invalida!");
        }
        if(!getSituacao()) {
             throw new Exception ("Conta inativa!");
        }
        if(nLimite <= 0) {
             throw new Exception ("Limite menor ou igual a zero!");
        }
        limite =nLimite;
    }


    //Apresenta o limite da conta
    public boolean verificarLimite(long senha)
    { //A operação só sera efetuada se a conta estiver ativa.
        if(validaSenha(senha) && getSituacao()) {
            getLimite();
            return true;
        }
        return false;
    }


        @Override
    public void saque(long senha, double valor, int dia) throws Exception
    {
        //A operação só sera efetuada se a conta estiver ativa.
    	//"A operação de saque considera o saldo da conta acrescido do limite para decidir se o saque é efetuado ou não
        if(!validaSenha(senha)){
            throw new Exception ("Senha invalida!");
        }
        if(!getSituacao()) {
            throw new Exception ("Conta inativa!");
        }
        if(valor > getSaldo()+getLimite()) {
            throw new Exception ("Valor maior que o saldo disponivel!");
        }
        setSaldo(getSaldo() - valor);
    }
    private double getLimite() { return limite; }
    
    @Override
    public String toString() {
    	return "Limite:"+this.limite+" "+super.toString();
    }
    
}
