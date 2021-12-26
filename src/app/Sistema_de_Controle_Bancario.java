package app;
import java.util.Scanner;
import java.util.ArrayList;

public class Sistema_de_Controle_Bancario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClientePF cPF;
		ClientePJ cPJ;
		Scanner e = new Scanner(System.in);
		ListaClientes lista = new ListaClientes();
		ListaClientes lClint2 = new ListaClientes();
		ListaContas lContas = new ListaContas();
		ListaContas lCont2 = new ListaContas();
		String nome;
		long rg, cpf, cnpj;
		
		try{
			Object obj;
			obj = Arquivo.ler("ListaClientes");
			lista = (ListaClientes) obj;
		}catch(Exception er) {
			System.err.println(er.getMessage());
		}
		try{
			Object obj;
			obj = Arquivo.ler("ListaContas");
			lContas = (ListaContas) obj;
		}catch(Exception er) {
			System.err.println(er.getMessage());
		}
		for(int i = 0; i < lContas.quantContas();i++)
			System.out.println(lContas.removeConta(i));
		for(int i = 0; i < lista.quantClientes();i++)
			System.out.println(lista.removeCliente(i));
		
		try {
			Arquivo.gravar(lista, "ListaClientes");
		}catch(Exception er) {
			System.err.println(er.getMessage());
		}
		try{
			Object obj;
			obj = Arquivo.ler("ListaClientes");
			lClint2 = (ListaClientes) obj;
		}catch(Exception er) {
			System.err.println(er.getMessage());
		}
		for(int i = 0; i < lClint2.quantClientes();i++)
			System.out.println(lClint2.listarClientes(i));
		
		try {
			Arquivo.gravar(lContas, "ListaContas");
		}catch(Exception er) {
			System.err.println(er.getMessage());
		}
		try{
			Object obj;
			obj = Arquivo.ler("ListaContas");
			lCont2 = (ListaContas) obj;
		}catch(Exception er) {
			System.err.println(er.getMessage());
		}
		for(int i = 0; i < lCont2.quantContas();i++)
			System.out.println(lCont2.listarContas(i));
	
//		System.out.print("Informe o nome do cliente: ");
//		nome = e.nextLine();
//		System.out.print("Informe o RG do cliente: ");
//		rg = e.nextLong();
//		System.out.print("Informe o CPF do cliente: ");
//		cpf = e.nextLong();
//		e.nextLine();
//		cPF = new ClientePF(nome, rg, cpf);
//		
//		cPF.setEndereco(97546550, "Brasil", "Alegrete", " AV. Tiaraju", 810);
//		
//		System.out.print("Informe o nome do cliente: ");
//		nome = e.nextLine();
//		System.out.print("Informe o CNPJ do cliente: ");
//		cnpj = e.nextLong();
//		
//		cPJ = new ClientePJ(nome, cnpj);
//		
//		cPJ.setEndereco(97546550, "Brasil", "Alegrete", " AV. Tiaraju", 810);
//		
//		lista.addCliente(cPF);
//		lista.addCliente(cPJ);
//		for(int i = 0; i < lista.quantClientes();i++)
//		System.out.println(lista.listarClientes(i));
//		
//		System.out.println(lista.quantClientes());
//		
//		ContaCorrente conta1 = new ContaCorrente(cPF, 1111);
//		lContas.addConta(conta1);
//		ContaPoupanca conta2 = new ContaPoupanca(cPF, 2222);
//		lContas.addConta(conta2);
//		ContaEspecial conta3 = new ContaEspecial(cPF, 3333, 1000.00);
//		lContas.addConta(conta3);
//		
//		ContaCorrente conta4 = new ContaCorrente(cPJ, 1001);
//		lContas.addConta(conta4);
//		ContaPoupanca conta5 = new ContaPoupanca(cPJ, 2323);
//		lContas.addConta(conta5);
//		ContaEspecial conta6 = new ContaEspecial(cPJ, 3030, 1200.00);
//		lContas.addConta(conta6);
//		
//		for(int i = 0; i < lContas.quantContas();i++)
//			System.out.println(lContas.listarContas(i));
//			
//			System.out.println(lContas.quantContas());
//		
//			try {
//				Arquivo.gravar(lista, "ListaClientes");
//			}catch(Exception er) {
//				System.err.println(er.getMessage());
//			}
//			try{
//				Object obj;
//				obj = Arquivo.ler("ListaClientes");
//				lClint2 = (ListaClientes) obj;
//			}catch(Exception er) {
//				System.err.println(er.getMessage());
//			}
//			for(int i = 0; i < lClint2.quantClientes();i++)
//				System.out.println(lClint2.listarClientes(i));
//			
//			try {
//				Arquivo.gravar(lContas, "ListaContas");
//			}catch(Exception er) {
//				System.err.println(er.getMessage());
//			}
//			try{
//				Object obj;
//				obj = Arquivo.ler("ListaContas");
//				lCont2 = (ListaContas) obj;
//			}catch(Exception er) {
//				System.err.println(er.getMessage());
//			}
//			for(int i = 0; i < lCont2.quantContas();i++)
//				System.out.println(lCont2.listarContas(i));
	}
}
