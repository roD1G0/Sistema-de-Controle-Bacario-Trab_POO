package app;
import java.util.Scanner;

public class Sistema_de_Controle_Bancario {

	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);
		char op;
		
		do {
			System.out.println("\tMENU DE OP��ES:\nEscolha uma das op��es:\n1-Menu das contas;\n2-Menu dos clientes;\n0-Sair.");
			System.out.print("Sua op��o: ");
			op = e.next().charAt(0);
			e.nextLine();
			
			switch(op) {
				case '1':
					GerenciaConta.ExibirMenu();
					break;
				case '2':
					GerenciaCliente.ExibirMenu();
					break;
				case '0':
					System.out.println("Saindo...");
					break;
				default:
					System.out.println("Op��o invalida!!!");
					break;
			}
		}while(op != '0');
	}
}
