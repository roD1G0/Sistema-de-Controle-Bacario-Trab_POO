package app;
import java.util.Scanner;
import java.util.ArrayList;

public class Sistema_de_Controle_Bancario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Cliente c1 = new Cliente("Rodrigo");
		System.out.println(c1.toString());
		
		ClientePF cPF = new ClientePF("Giovana", 12345, 999999);
		System.out.println(cPF.toString());
		
		ClientePJ cPJ = new ClientePJ("Rubia", 54321);
		System.out.println(cPJ.toString());
		
		ContaCorrente conta1 = new ContaCorrente(c1, 1111);
		System.out.println(conta1.toString());
		System.out.println(c1.toString());
		System.out.println(conta1.getSaldo());
		conta1.deposito(200.00);
		System.out.println(conta1.getSaldo());
		conta1.saque(20.00);
		System.out.println(conta1.getSaldo());
		conta1.encerraConta();
		System.out.println(conta1.toString());
		System.out.println(c1.toString());
		
		ContaPoupanca conta2 = new ContaPoupanca(cPF, 2222);
		System.out.println(conta2.toString());
		System.out.println(cPF.toString());
		
		ContaEspecial conta3 = new ContaEspecial(cPJ, 3333, 1000.00);
		System.out.println(conta3.toString());
		System.out.println(cPJ.toString());*/
		ClientePF cPF;
		ClientePJ cPJ;
		Scanner e = new Scanner(System.in);
		ListaClientes lista = new ListaClientes();
		String nome;
		long rg, cpf, cnpj;
		ListaContas lContas = new ListaContas();
		
		System.out.print("Informe o nome do cliente: ");
		nome = e.nextLine();
		System.out.print("Informe o RG do cliente: ");
		rg = e.nextLong();
		System.out.print("Informe o CPF do cliente: ");
		cpf = e.nextLong();
		e.nextLine();
		cPF = new ClientePF(nome, rg, cpf);
		
		cPF.setEndereco(97546550, "Brasil", "Alegrete", " AV. Tiaraju", 810);
		
		System.out.print("Informe o nome do cliente: ");
		nome = e.nextLine();
		System.out.print("Informe o CNPJ do cliente: ");
		cnpj = e.nextLong();
		
		cPJ = new ClientePJ(nome, cnpj);
		
		cPJ.setEndereco(97546550, "Brasil", "Alegrete", " AV. Tiaraju", 810);
		
		lista.addCliente(cPF);
		lista.addCliente(cPJ);
		for(int i = 0; i < lista.quantClientes();i++)
		System.out.println(lista.listarClientes(i));
		
		System.out.println(lista.quantClientes());
		
		ContaCorrente conta1 = new ContaCorrente(cPF, 1111);
		lContas.addConta(conta1);
		ContaPoupanca conta2 = new ContaPoupanca(cPF, 2222);
		lContas.addConta(conta2);
		ContaEspecial conta3 = new ContaEspecial(cPF, 3333, 1000.00);
		lContas.addConta(conta3);
		
		ContaCorrente conta4 = new ContaCorrente(cPJ, 1001);
		lContas.addConta(conta4);
		ContaPoupanca conta5 = new ContaPoupanca(cPJ, 2323);
		lContas.addConta(conta5);
		ContaEspecial conta6 = new ContaEspecial(cPJ, 3030, 1200.00);
		lContas.addConta(conta6);
		
		for(int i = 0; i < lContas.quantContas();i++)
			System.out.println(lContas.listarContas(i));
			
			System.out.println(lContas.quantContas());
		
	}

}
