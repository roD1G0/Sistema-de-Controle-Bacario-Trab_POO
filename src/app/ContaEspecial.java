package app;

public class ContaEspecial extends ContaCorrente {

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
    public boolean alterarLimite(int nLimite)
    {
        //A operação só sera efetuada se a conta estiver ativa.
        if(getSituacao() && nLimite > 0) {
                setLimite(nLimite);
                return true;
            }
        return false;
    }


    //Apresenta o limite da conta
    public boolean verificarLimite()
    { //A operação só sera efetuada se a conta estiver ativa.
        if(getSituacao()) {
            getLimite();
            return true;
        }
        return false;
    }


    public boolean saque(double valor)
    {
        //A operação só sera efetuada se a conta estiver ativa.
    	//"A operação de saque considera o saldo da conta acrescido do limite para decidir se o saque é efetuado ou não"
        if(getSituacao() && valor <= getSaldo() + getLimite()) {
                super.saque(valor);
                return true;
            }
        return false;
    }


    private void setLimite(double newLimite) { limite = newLimite; }
    private double getLimite() { return limite; }

}
