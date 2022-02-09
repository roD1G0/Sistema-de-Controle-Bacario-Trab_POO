package app;
import java.util.Scanner;

public class GerenciaConta {
    static ListaContas l = new ListaContas();
    static ListaClientes lC = new ListaClientes();
    static Scanner e = new Scanner(System.in);

    public static void ExibirMenu(){
    	char op;
    	do{
            lerListas();
            System.out.println("\nEscolha uma op��o: ");
            System.out.println("1- Abrir Conta. ");
            System.out.println("2- Gerenciar Conta. ");
            System.out.println("3- Lista de Contas. ");
            System.out.println("0 - Voltar.");
            System.out.print("Sua op��o: ");

            op = e.next().charAt(0);
            e.nextLine();
            switch (op) {
                case '1':
                    CadastrarConta.AbrirConta();
                    break;
                case '2':
                    gerenciarContas();
                    break;
                case '3':
                    listaDeContas();
                    break;
                case '0':
                    System.out.println("Saindo");
                    break;
                default:
                    System.out.println("Opc�o inv�lida.");
                    break;
            }
        }while( op != '0' );
    }
        public static void gerenciarContas() {
            char op1;
            do{
                lerListas();
                System.out.println("Escolha uma op��o:");
                System.out.println("1- Fazer saque.");
                System.out.println("2- Fazer deposito.");
                System.out.println("3- Reativar conta.");
                System.out.println("4- Encerrar Conta.");
                System.out.println("5- Alterar limte. (Conta especial)");
                System.out.println("6- Conta com maior saldo.");
                System.out.println("7- Conta com menor saldo.");
                System.out.println("8- Apagar conta");
                System.out.println("0 - Voltar.");
                System.out.print("Sua op��o: ");
                
                op1 = e.next().charAt(0);
                e.nextLine();
                switch (op1) {
                    case '1':
                        Saque();
                        break;
                    case '2':
                        Deposita();
                        break;
                    case '3':
                        Reativar();
                        break;
                    case '4':
                        EncerrarConta();
                        break;
                    case '5':
                        alterarLimite();
                        break;
                    case '6':
                        contaMaiorSaldo();
                        break;
                    case '7':
                        contaMenorSaldo();
                        break;
                    case '8':
                        CadastrarConta.removeConta();
                        break;
                    case '0':
                        System.out.println("Saindo");
                        break;
                    default:
                        System.out.println("Opc�o inv�lida.");
                        break;
                }
            }while( op1 != '0' );
        }
            public static void Saque(){
            	char opc;
            	long numConta;
            do{
            	do {
	                System.out.println("D�gite o n�mero da conta para realizar o saque: ");
	                numConta = e.nextLong();
	                e.nextLine();
	                long senha = 0;
	                if(l.verificaNumero(numConta)){
	                	do {
	                		System.out.println("Informe a senha: ");
	                        senha= e.nextLong();
	                        e.nextLine();
	                        if(l.verificaSenha(numConta, senha)) {
	                        	 System.out.println("Informe o valor do saque");
	                             double valor = e.nextDouble();
	                             e.nextLine();
	                             
	                             if(l.saqueConta(numConta, senha, valor)) {
	                            	 System.out.println("Saque realizado com sucesso!");
	                            	 gravarListas();
	                             }else {
	                            	 System.out.println("Saque n�o realizado!\nO valor � maior que o saldo da conta!");
	                             }
	                        }else {
	                        	System.out.println("Senha incorreta!!!");
	                        }
                            }while(!l.verificaSenha(numConta, senha));
	                }else{
	                    System.out.println("Conta inexistente.");
	                }
            	}while(!l.verificaNumero(numConta));
                  do{
                      System.out.println("Deseja realizar outro saque?\n1-Sim.\n0-N�o.");
                     opc = e.next().charAt(0);
                     switch(opc){
                         case '1':
                             System.out.println("Ok");
                             break;
                         case '0':
                             System.out.println("Saindo");
                             break;
                         default:
                             System.out.println("Op��o inv�lida");
                     }
                  }while(opc != '0');
            }while(opc != '0');
        }
            public static void Deposita(){
            	char opc;
            	long numConta = 0;
            	long senha = 0;
            	
                do{
                	do {
                		System.out.println("D�gite o n�mero da conta para realizar deposito: ");
                        numConta = e.nextLong();
                        e.nextLine();
                        if(l.verificaNumero(numConta)){
                        	do {
                        	System.out.println("Informe a senha: ");
                                senha = e.nextLong();
                                e.nextLine();
                                
                                if(l.verificaSenha(numConta, senha)){
                                	System.out.println("Informe o valor do deposito");
                                    double valor = e.nextDouble();
                                    e.nextLine();
                                    
                                    if(l.depositaConta(numConta, senha, valor)) {
                                    	System.out.println("Deposito realizado com suceso!");
                                    	gravarListas();
                                    }else {
                                    	System.out.println("N�o foi possivel realizar o deposito!");
                                    }
                                }else {
                                	System.out.println("Senha incorreta!!!");
                                }
                        	}while(!l.verificaSenha(numConta, senha));
                        }else{
                            System.out.println("Conta inexistente.");
                        }
                	}while(!l.verificaNumero(numConta));
                    do{
                        System.out.println("Deseja realizar outro deposito?\n1-Sim.\n0-N�o.");
                        opc = e.next().charAt(0);
                        switch(opc){
                            case '1':
                                System.out.println("Ok");
                                break;
                            case '0':
                                System.out.println("Saindo");
                                break;
                            default:
                                System.out.println("Op��o inv�lida!!!");
                        }
                    }while(opc != '0');
                }while(opc != '0');
            }
            public static void Reativar(){
            	char opc;
            	long numConta = 0;
            	do {
            		l.listarContas();
            		do {
            			System.out.print("\nInforme o numero da conta que deseja reativar:\nNumero: ");
                		numConta = e.nextLong();
                		e.nextLine();
                		
                		if(l.verificaNumero(numConta)) {
                			if(l.reativarConta(numConta)) {
                				System.out.println("Conta reativada com sucesso!");
                				gravarListas();
                			}else {
                				System.out.println("N�o foi possivel reativar a conta!");
                			}
                		}else {
                			 System.out.println("Conta inexistente.");
                		}
            		}while(!l.verificaNumero(numConta));
            		do {
            			System.out.print("Deseja reativar mais uma conta?\n1-Sim\n0-N�o\nSua op��o:");
                		opc = e.next().charAt(0);
                		e.nextLine();
                		switch(opc){
                        case '1':
                            System.out.println("Ok");
                            break;
                        case '2':
                            System.out.println("Saindo");
                            break;
                        default:
                            System.out.println("Op��o inv�lida!!!");
                    }
            		}while(opc != '0');
            	}while(opc != '0');
            }
            public static void EncerrarConta() {
            	char opc;
            	long numConta = 0;
            	long senha = 0;
            	do {
            		l.listarContas();
            		do {
            			System.out.print("\nInforme o numero da conta que deseja encerrar:\nNumero: ");
                		numConta = e.nextLong();
                		e.nextLine();
                		
                		if(l.verificaNumero(numConta)) {
                			do {
                        		System.out.println("Informe a senha: ");
                                senha = e.nextLong();
                                e.nextLine();
                                
                                if(l.verificaSenha(numConta, senha)){
                                   if(l.encerraConta(numConta, senha)) {
                                	   System.out.println("Conta encerrada com sucesso");
                                       lC.decrementaContas(l.getCliente(numConta));
                                       gravarListas();
                                   }else {
                                	   System.out.println("N�o foi possivel encerrar a conta!");
                                   }
                                }else {
                                	System.out.println("Senha incorreta!!!");
                                }
                			}while(!l.verificaSenha(numConta, senha));
                		}else {
                			 System.out.println("Conta inexistente.");
                		}
            		}while(!l.verificaNumero(numConta));
            		do {
            			System.out.print("Deseja encerrar mais uma conta?\n1-Sim\n0-N�o\nSua op��o:");
                		opc = e.next().charAt(0);
                		e.nextLine();
                		switch(opc){
                        case '1':
                            System.out.println("Ok");
                            break;
                        case '2':
                            System.out.println("Saindo");
                            break;
                        default:
                            System.out.println("Op��o inv�lida!!!");
                    }
            		}while(opc != '0');
            		
            	}while(opc != '0');
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
                                Conta.setGeraNumeros(l.getMaiorNumero()+1);
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
            public static void listaDeContas() {
        		System.out.println("\tEsta � a lista de Contas:\n");
        		l.listarContas();
        	}
            public static void alterarLimite() {
            	char opc;
            	long numConta = 0;
            	long senha = 0;
            	do {
            		l.listarContas();
            		do {
            			System.out.print("\nInforme o numero da conta que deseja alterar o limite:\nNumero: ");
                		numConta = e.nextLong();
                		e.nextLine();
                		
                		if(l.verificaNumero(numConta)) {
                			do {
                        		System.out.println("Informe a senha: ");
                                senha = e.nextLong();
                                e.nextLine();
                                
                                if(l.verificaSenha(numConta, senha)){
                                	System.out.print("Informe o novo limite da conta: ");
                                	double valor = e.nextDouble();
                                	e.nextLine();
                                	if(l.alterarLimite(numConta, senha, valor)) {
                                		System.out.println("Limite alterado com sucesso!");
                                		gravarListas();
                                	}else {
                                		System.out.println("N�o foi possivel alterar o limte!");
                                	}
                                }else {
                                	System.out.println("Senha incorreta!!!");
                                }
                			}while(!l.verificaSenha(numConta, senha));
                		}else {
                			 System.out.println("Esta conta n�o �  uma conta Especial ou n�o exite.");
                		}
            		}while(!l.verificaNumero(numConta));
            		do {
            			System.out.print("Deseja alterar o limite de mais uma conta?\n1-Sim\n0-N�o\nSua op��o:");
                		opc = e.next().charAt(0);
                		e.nextLine();
                		switch(opc){
                        case '1':
                            System.out.println("Ok");
                            break;
                        case '2':
                            System.out.println("Saindo");
                            break;
                        default:
                            System.out.println("Op��o inv�lida!!!");
                    }
            		}while(opc != '0');
            	}while(opc != '0');
            }
            public static void contaMaiorSaldo(){
                System.out.println("\nEsta é a conta com maior saldo:");
                try{
                    System.out.println(l.getSaldoMaior());
                }catch(Exception err){
                    System.out.println("\nOuve um erro na pesquisa: ");
                    System.err.println(err.getMessage());
            }
    }
            public static void contaMenorSaldo(){
                System.out.println("\nEsta é a conta com menor saldo:");
                try{
                    System.out.println(l.getSaldoMenor());
                }catch(Exception er){
                    System.out.println("\nOuve um erro na pesquisa: ");
                    System.err.println(er.getMessage());
                }
    }
}