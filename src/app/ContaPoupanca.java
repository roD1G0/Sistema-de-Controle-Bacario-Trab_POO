package app;

public class ContaPoupanca extends ContaCorrente {
	private static final long serialVersionUID = 7870033380660416217L;
	private double []saldo;

	public ContaPoupanca(Cliente cliente, long senha) {
		super(cliente, senha);
		tipoConta = "Conta Poupança";
		saldo = new double[28];
		for(int i = 0; i<saldo.length; i++){
			saldo[i] = 0;
		}

	}

	public boolean deposito(long senha, double valor, int dia) {
		if (validaSenha(senha) && getSituacao() && valor > 0) {
			if(dia > 28)
				dia = 1;
			saldo[dia -1] = valor;
			return true;
		}
		return false;

	}

        @Override
	public double getSaldo() {
		double total = 0;
		for(int i = 0; i < saldo.length; i++){
			total += saldo[1];
		}
		return total;
	}

	public boolean saque(long senha, double valor, int dia) {
		if(validaSenha(senha) && getSituacao() && valor <= getSaldo()) {
			if(dia> 28)
				dia= 1;
			do{
				if(saldo[dia-1]>= valor){
					saldo[dia -1] -= valor;
					valor = 0;

				}else{
					valor -= saldo[dia-1];
					saldo[dia-1] = 0;
					dia --;
					if(dia == 0)
						dia = 28;
				}
			}while(valor> 0);
			return true;
		}
		return false;
	}

	public boolean calcularJuros(long senha, double juros, int dia) {
		if (validaSenha(senha) && getSituacao()) {
			if (dia > 28)
				dia = 1;
			saldo[dia - 1] += (saldo[dia - 1] * juros);
			return true;
		}
		return false;
	}

}
