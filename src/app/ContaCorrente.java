package app;

public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente, int senha) {
        super(cliente, senha);
    }

    /*A conta corrente permite as seguintes operações:
    abrir a conta, encerrar a conta, validar a senha, verificar o saldo,
     sacar um valor e depositar um valor.
     A operação de saque é efetuada somente se
     o saldo da conta é igual ou superior ao valor que deve ser sacado.
     A operação de depósito é efetuada se o valor a ser depositado é maior do que zero.*/



    //Deposita o valor na conta
    public boolean deposito(int senha, double valor) {
        //A operação só sera efetuada se a conta estiver ativa.
        //A operação de depósito é efetuada se o valor a ser depositado é maior do que zero.
        if(validaSenha(senha)==true && getSituacao() && valor > 0) {
                setSaldo(getSaldo() + valor);
                return true;
            }
        return false;
    }

    //Apresenta o saldo da conta
    public boolean verificarSaldo(int senha)
    {
        //A operação só sera efetuada se a conta estiver ativa.
        if(validaSenha(senha)==true && getSituacao())
        {
            getSaldo();
            return true;
        }
        return false;
    }


    //Saca o valor da conta
    public boolean saque(int senha, double valor) {
        //A operação só sera efetuada se a conta estiver ativa.
    	//A operação de saque é efetuada somente se o saldo da conta é igual ou superior ao valor que deve ser sacado.
        if(validaSenha(senha)==true && getSituacao() && valor <= getSaldo()) {
                    	setSaldo(getSaldo() - valor);
            return true;
            }
        return false;
    }


}
