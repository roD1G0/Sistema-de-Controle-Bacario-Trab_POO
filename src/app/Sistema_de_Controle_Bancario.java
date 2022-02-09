package app;
import java.util.Scanner;
//import app.interfaces.UserInterface;

public class Sistema_de_Controle_Bancario {

	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);
                char op;	
                //new UserInterface();
		do {
			System.out.print("\n\tMENU DE OP��ES:\nEscolha uma das op��es:"
					+ "\n1-Menu das contas;\n2-Menu dos clientes;\n0-Sair.\nSua op��o: ");
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
