package app;

public class ContaPoupanca extends ContaCorrente {
	private static final long serialVersionUID = 7870033380660416217L;
	private double []saldo;

	public ContaPoupanca(Cliente cliente, long senha) {
		super(cliente, senha);
		tipoConta = "Conta Poupança";
		this.saldo = new double[28];
		for(int i = 0; i<this.saldo.length; i++){
			this.saldo[i] = 0.0;
		}

	}

	public void deposito(long senha, double valor, int dia) throws Exception{
		if (!validaSenha(senha)) {
                    throw new Exception ("Senha invalida!");
		}
                if (!getSituacao()) {
                    throw new Exception ("Conta inativa!");
		}
                if (valor <= 0) {
                    throw new Exception ("Valor menor ou igual a zero!");
		}
		if(dia > 28)
                    dia = 1;
                this.saldo[dia -1] = valor;
	}
        @Override
        public double getSaldo() {
		double total = 0;
		for(int i = 0; i < this.saldo.length; i++){
			total += this.saldo[i];
		}
		return total;
	}
        @Override
	public void saque(long senha, double valor, int dia)throws Exception {
		if(!validaSenha(senha)) {
                    throw new Exception ("Senha invalida!");
		}
                if(!getSituacao()) {
                    throw new Exception ("Conta inativa!");
		}
                if(valor > this.getSaldo()) {
                    throw new Exception ("Valor maior que o saldo disponivel!");
		}
		if(dia> 28)
                    dia= 1;
                do{
                    if(this.saldo[dia-1]>= valor){
                        this.saldo[dia -1] -= valor;
                        valor = 0;
                    }else{
                        valor -= this.saldo[dia-1];
                        this.saldo[dia-1] = 0;
                        dia --;
                        if(dia == 0)
                            dia = 28;
                    }
                }while(valor > 0);
	}

	public void calcularJuros(long senha, double juros, int dia) throws Exception{
            if (!validaSenha(senha) && getSituacao()) {
		throw new Exception("Senha invalida!");
            }
            if (!getSituacao()) {
		throw new Exception("Conta inativa!");
            }
            if (dia > 28)
		dia = 1;
            this.saldo[dia - 1] += (this.saldo[dia - 1] * juros);
	}
        public void setSaldo(double nSaldo, int dia){
            this.saldo[dia-1] = nSaldo;
        }
}
