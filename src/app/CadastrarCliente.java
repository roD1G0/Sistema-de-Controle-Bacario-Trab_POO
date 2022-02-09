package app;

import static app.GerenciaCliente.e;
import static app.GerenciaCliente.gravarListas;
import static app.GerenciaCliente.lC;
import static app.GerenciaCliente.lerListas;

/**
 *
 * @author Rodrigo Rodrigues
 */
public class CadastrarCliente{
        public static void cadastrarClientes() {
		char op2;
		String nome = " ";
		do {
			lerListas();
			do {
				System.out.println("Escolha o tipo de cliente: \n 1-Cliente Pessoa Fisica;\n 2-Conta Juridica;\n 0-Voltar.");
				System.out.print("Sua op��o:");
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
						System.out.println("Op��o invalida!!!");
						break;
					}
				}
					
			}while(op2 != '0' && op2 != '1' && op2 != '2');
			
		}while(op2 != '0');
		
	}
        public static void setEndereco(Cliente cliente) {
		long cep;
		String pais, cidade, rua;
		int num;
		if(lC.verificaCliente(cliente)) {
			System.out.println("Informe o endere�o do cliente: ");
			System.out.print("CEP: ");
			cep = e.nextLong();
			e.nextLine();
			System.out.print("Pa�s: ");
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
			System.out.println("Cliente n�o encontrado!");
		}
		
	}
}
