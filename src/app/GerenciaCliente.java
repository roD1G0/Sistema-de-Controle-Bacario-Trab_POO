package app;
import java.util.Scanner;

public class GerenciaCliente {
    static Scanner e = new Scanner(System.in);
    static ListaClientes lC = new ListaClientes();
    static ListaContas l = new ListaContas();

    public static void ExibirMenu() {
    	char op1;
    	do {
			lerListas();
			System.out.println("Escolha uma opção: \n 1-Cadastrar cliente; \n 2-Alterar informações do cliente; \n 3-Lista de clientes\n0-Voltar.");
			System.out.print("Sua opção: ");
			op1 = e.next().charAt(0);
			e.nextLine();
			
			switch(op1) {
				case '1':
					cadastrarClientes();
					 break;
				case '2':
					alterarInformacoes();
					 break;
				case '3':
					listaDeClientes();
					 break;
				case '0':
					System.out.println("Voltando...");
					break;
				default:
					System.out.println("Opção invalida!!!");
					break;
			}
		}while(op1 != '0');
	}

	private static void cadastrarClientes() {
		char op2;
		String nome = " ";
		do {
			lerListas();
			do {
				System.out.println("Escolha o tipo de cliente: \n 1-Cliente Pessoa Fisica;\n 2-Conta Juridica;\n 0-Voltar.");
				System.out.print("Sua opção:");
				op2 = e.next().charAt(0);
				e.nextLine();
				if(op2 == '0' || op2 == '1' || op2 == '2') {
					if(op2 != '0') {
						System.out.print("Informe o nome do cliente:\nNome: ");
						nome = e.next();
						e.nextLine();
					}
					switch(op2) {
					case '1':
						System.out.println("Informe o CPF do cliente: ");
						System.out.print("CPF: ");
						long CPF = e.nextLong();
						e.nextLine();
						
						ClientePF cPF = new ClientePF(nome, CPF);
						
						lC.addCliente(cPF);
						setEndereco(cPF);
						gravarListas();
						break;
					case '2':
						System.out.println("Informe o CPF do cliente: ");
						System.out.print("CNPJ: ");
						long CNPJ = e.nextLong();
						e.nextLine();
						
						ClientePJ cPJ = new ClientePJ(nome, CNPJ);
						
						lC.addCliente(cPJ);
						setEndereco(cPJ);
						gravarListas();
						 break;
					case '0':
						System.out.println("Voltando...");
						break;
					default:
						System.out.println("Opção invalida!!!");
						break;
					}
				}
					
			}while(op2 != '0' && op2 != '1' && op2 != '2');
			
		}while(op2 != '0');
		
	}
	public static void alterarInformacoes() {
		char op;
		int o = 0;
		do {
			lerListas();
			System.out.println("Escolha uma opção: \n 1-Alterar renda; \n 2-Alterar endereço; \n 3-Alterar telefone\n4-Excluir cliente\n0-Voltar.");
			System.out.print("Sua opção: ");
			op = e.next().charAt(0);
			e.nextLine();
			
			switch(op) {
			
				case '1':
					altRenda();
					break;
				case '2':
					listaDeClientes();
					do {
						System.out.print("Escolha um cliente para alterar endereço:\nSua opção: ");
						o = e.nextInt();
						e.nextLine();
						if(o < 0 || o > lC.quantClientes()-1)
							System.out.println("Opção Invalida!!!");
						else {
							Cliente cliente = lC.getCliente(o);
							setEndereco(cliente);
						}
					}while(o < 0 || o > lC.quantClientes()-1);
					break;
				case '3':
					altTelefone();
					break;
				case '4':
					remover();
					 break;
				
				case '0':
					System.out.println("Voltando...");
					break;
				default:
					System.out.println("Opção invalida!!!");
					break;
			}
		}while(op != '0');
	}
	public static void remover() {
		char op2;
		int o;
		do {
			lerListas();
			listaDeClientes();
			do {
				System.out.print("Escolha um cliente para excluir:\nSua opção: ");
				o = e.nextInt();
				e.nextLine();
				if(o < 0 || o > lC.quantClientes()-1)
					System.out.println("Opção Invalida!!!");
				else {
					if(lC.removeCliente(o)) {
						System.out.println("\nCliente excluido com sucesso!");
						gravarListas();
					}
					else{
						System.out.println("\nNão foi possivel excluir o cliente!");
					}
				}
			}while(o < 0 || o > lC.quantClientes()-1);
			
			System.out.print("\nDeseja exluir mais um cliente?\n1-Sim.\n0-Não.\nSua opção: ");
			op2 = e.next().charAt(0);
			e.nextLine();
			
			switch(op2) {
				case '1':
					System.out.println("Ok!");
					break;
				case '0':
					System.out.println("Voltando...");
					break;
				default:
					System.out.println("Opção invalida!!!");
					break;
			}
			
		}while(op2 != '0');
		
	}
	public static void lerListas() {
		try{
			Object obj;
			obj = Arquivo.ler("ListaClientes");
			lC = (ListaClientes) obj;
		}catch(Exception er) {
			System.err.println(er.getMessage());
		}
		try{
			Object obj;
			obj = Arquivo.ler("ListaContas");
			l = (ListaContas) obj;
		}catch(Exception er) {
			System.err.println(er.getMessage());
		}
	}
	public static void gravarListas() {
		try {
			Arquivo.gravar(l, "ListaContas");
		}catch(Exception er) {
			System.err.println(er.getMessage());
		}
		try {
			Arquivo.gravar(lC, "ListaClientes");
		}catch(Exception er) {
			System.err.println(er.getMessage());
		}
	}
	public static void listaDeClientes() {
		System.out.println("\tEsta é a lista de Clientes:\n");
		lC.listarClientes();
	}
	public static void setEndereco(Cliente cliente) {
		long cep;
		String pais, cidade, rua;
		int num;
		if(lC.verificaCliente(cliente)) {
			System.out.println("Informe o endereço do cliente: ");
			System.out.print("CEP: ");
			cep = e.nextLong();
			e.nextLine();
			System.out.print("País: ");
			pais = e.next();
			e.nextLine();
			System.out.print("Cidade: ");
			cidade = e.next();
			e.nextLine();
			System.out.print("Rua: ");
			rua = e.next();
			e.nextLine();
			System.out.print("Numero: ");
			num = e.nextInt();
			e.nextLine();
			
			lC.setEndereco(cliente, cep, pais, cidade, rua, num);
		}
		else {
			System.out.println("Cliente não encontrado!");
		}
		
	}
	public static void altRenda() {
		char op2;
		int o;
		do {
			lerListas();
			listaDeClientes();
			do {
				System.out.print("Escolha um cliente para alterar a renda:\nSua opção: ");
				o = e.nextInt();
				e.nextLine();
				if(o < 0 || o > lC.quantClientes()-1)
					System.out.println("Opção Invalida!!!");
				else {
					System.out.print("Informe o valor da renda do cliente:");
					double renda = e.nextDouble();
					e.nextLine();
					
					Cliente cliente = lC.getCliente(o);
					if(lC.altRenda(cliente, renda)) {
						System.out.println("\nRenda alterada com sucesso!");
						gravarListas();
					}
					else{
						System.out.println("\nNão foi possivel alterar a renda!");
					}
				}
			}while(o < 0 || o > lC.quantClientes()-1);
			
			System.out.print("\nDeseja alterar a renda de mais um cliente?\n1-Sim.\n0-Não.\nSua opção: ");
			op2 = e.next().charAt(0);
			e.nextLine();
			
			switch(op2) {
				case '1':
					System.out.println("Ok!");
					break;
				case '0':
					System.out.println("Voltando...");
					break;
				default:
					System.out.println("Opção invalida!!!");
					break;
			}
			
		}while(op2 != '0');
	}
	public static void altTelefone() {
		char op2;
		int o;
		do {
			lerListas();
			listaDeClientes();
			do {
				System.out.print("Escolha um cliente para alterar o telefone:\nSua opção: ");
				o = e.nextInt();
				e.nextLine();
				if(o < 0 || o > lC.quantClientes()-1)
					System.out.println("Opção Invalida!!!");
				else {
					System.out.print("Informe o numero de telefone do cliente:");
					long telefone = e.nextLong();
					e.nextLine();
					
					Cliente cliente = lC.getCliente(o);
					if(lC.altTelefone(cliente, telefone)) {
						System.out.println("\nTelefone alterado com sucesso!");
						gravarListas();
					}
					else{
						System.out.println("\nNão foi possivel alterar o telefone!");
					}
				}
			}while(o < 0 || o > lC.quantClientes()-1);
			
			System.out.print("\nDeseja alterar o telefone de mais um cliente?\n1-Sim.\n0-Não.\nSua opção: ");
			op2 = e.next().charAt(0);
			e.nextLine();
			
			switch(op2) {
				case '1':
					System.out.println("Ok!");
					break;
				case '0':
					System.out.println("Voltando...");
					break;
				default:
					System.out.println("Opção invalida!!!");
					break;
			}
			
		}while(op2 != '0');
	}
	
}