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
			System.out.println("\nEscolha uma op��o: \n 1-Cadastrar cliente; "
					+ "\n 2-Alterar informa��es do cliente; \n 3-Lista de clientes\n0-Voltar.");
			System.out.print("Sua op��o: ");
			op1 = e.next().charAt(0);
			e.nextLine();
			
			switch(op1) {
				case '1':
					CadastrarCliente.cadastrarClientes();
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
					System.out.println("Op��o invalida!!!");
					break;
			}
		}while(op1 != '0');
	}

	
	public static void alterarInformacoes() {
		char op;
		int o = 0;
		do {
			lerListas();
			System.out.println("Escolha uma op��o: \n 1-Alterar renda; \n 2-Alterar endere�o; \n 3-Alterar telefone\n4-Excluir cliente\n0-Voltar.");
			System.out.print("Sua op��o: ");
			op = e.next().charAt(0);
			e.nextLine();
			
			switch(op) {
			
				case '1':
					altRenda();
					break;
				case '2':
					listaDeClientes();
					do {
						System.out.print("Escolha um cliente para alterar endere�o:\nSua op��o: ");
						o = e.nextInt();
						e.nextLine();
						if(o < 0 || o > lC.quantClientes()-1)
							System.out.println("Op��o Invalida!!!");
						else {
							Cliente cliente = lC.getCliente(o);
							CadastrarCliente.setEndereco(cliente);
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
					System.out.println("Op��o invalida!!!");
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
				System.out.print("Escolha um cliente para excluir:\nSua op��o: ");
				o = e.nextInt();
				e.nextLine();
				if(o < 0 || o > lC.quantClientes()-1)
					System.out.println("Op��o Invalida!!!");
				else {
					if(lC.removeCliente(o)) {
						System.out.println("\nCliente excluido com sucesso!");
						gravarListas();
					}
					else{
						System.out.println("\nN�o foi possivel excluir o cliente!");
					}
				}
			}while(o < 0 || o > lC.quantClientes()-1);
			
			System.out.print("\nDeseja exluir mais um cliente?\n1-Sim.\n0-N�o.\nSua op��o: ");
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
					System.out.println("Op��o invalida!!!");
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
		System.out.println("\tEsta � a lista de Clientes:\n");
		lC.listarClientes();
	}
	
	public static void altRenda() {
		char op2;
		int o;
		do {
			lerListas();
			listaDeClientes();
			do {
				System.out.print("Escolha um cliente para alterar a renda:\nSua op��o: ");
				o = e.nextInt();
				e.nextLine();
				if(o < 0 || o > lC.quantClientes()-1)
					System.out.println("Op��o Invalida!!!");
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
						System.out.println("\nN�o foi possivel alterar a renda!");
					}
				}
			}while(o < 0 || o > lC.quantClientes()-1);
			
			System.out.print("\nDeseja alterar a renda de mais um cliente?\n1-Sim.\n0-N�o.\nSua op��o: ");
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
					System.out.println("Op��o invalida!!!");
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
				System.out.print("Escolha um cliente para alterar o telefone:\nSua op��o: ");
				o = e.nextInt();
				e.nextLine();
				if(o < 0 || o > lC.quantClientes()-1)
					System.out.println("Op��o Invalida!!!");
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
						System.out.println("\nN�o foi possivel alterar o telefone!");
					}
				}
			}while(o < 0 || o > lC.quantClientes()-1);
			
			System.out.print("\nDeseja alterar o telefone de mais um cliente?\n1-Sim.\n0-N�o.\nSua op��o: ");
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
					System.out.println("Op��o invalida!!!");
					break;
			}
			
		}while(op2 != '0');
	}
	
}