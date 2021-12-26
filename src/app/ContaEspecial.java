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

    public ContaEspecial(Cliente cliente, int senha, double limite) {
        super(cliente, senha);
        this.limite = limite;
    }


    //Altera o limite da conta
    public boolean alterarLimite(int senha, double nLimite)
    {
        //A operação só sera efetuada se a conta estiver ativa.
        if(validaSenha(senha) && getSituacao() && nLimite >= 0) {
                 limite =nLimite;
                return true;
            }
        return false;
    }


    //Apresenta o limite da conta
    public boolean verificarLimite(int senha)
    { //A operação só sera efetuada se a conta estiver ativa.
        if(validaSenha(senha) && getSituacao()) {
            getLimite();
            return true;
        }
        return false;
    }


    public boolean saque(int senha, double valor)
    {
        //A operação só sera efetuada se a conta estiver ativa.
    	//"A operação de saque considera o saldo da conta acrescido do limite para decidir se o saque é efetuado ou não"
        if(validaSenha(senha) && getSituacao() && valor <= getSaldo() + getLimite()) {
                super.saque(senha, valor);
                return true;
            }
        return false;
    }
    private double getLimite() { return limite; }
}
