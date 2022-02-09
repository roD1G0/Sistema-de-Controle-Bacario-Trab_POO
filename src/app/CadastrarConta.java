package app;

import static app.GerenciaConta.e;
import static app.GerenciaConta.gravarListas;
import static app.GerenciaConta.l;
import static app.GerenciaConta.lC;
import static app.GerenciaConta.lerListas;

/**
 *
 * @author Rodrigo Rodrigues
 */
public class CadastrarConta {
    public static void AbrirConta() {
            char opc;
            do {
            	lerListas();
    			int o;
    			long senha = 0;
    			System.out.println("Escolha o tipo de conta: \n 1-Conta Corrente \n 2-Conta Poupan�a \n 3-Conta Especial \n 0-Voltar;");
    			System.out.print("Sua op��o:");
    			opc = e.next().charAt(0);
    			e.nextLine();
    			
    			if(opc == '1' || opc == '2' || opc == '3' || opc == '0') {
    				if(opc == '1' || opc == '2' || opc == '3') {
    					do {
            				System.out.println("Escolha um cliente para a conta:\n");
            				lC.listarClientes();
            				
            				System.out.print("Sua escolha: ");
            				o = e.nextInt();
            				
            				if(o < 0 || o > lC.quantClientes()-1)
            					System.out.println("Op��o Invalida!!!");
            				else {
            					do {
            						System.out.println("Informe a senha da conta:\n(A senha n�o pode ter menos de 4 digitos e nem mais de 8 digitos)");
            						System.out.print("Senha: ");
            						senha = e.nextLong();
            						e.nextLine();
            						if(senha > 999 && senha < 99999999) {
            							switch(opc) {
            							case '1':
            								ContaCorrente cC = new ContaCorrente(lC.getCliente(o), senha);
            								l.addConta(cC);
            								lC.incrementaContas(lC.getCliente(o));
            								gravarListas();
            							case '2':
            								ContaPoupanca cP = new ContaPoupanca(lC.getCliente(o), senha);
            								l.addConta(cP);
            								lC.incrementaContas(lC.getCliente(o));
            								gravarListas();
            								break;
            							case '3':
            								System.out.println("Informe o limite da conta: ");
            								double limite = e.nextDouble();
            								ContaEspecial cE = new ContaEspecial(lC.getCliente(o), senha,limite);
            								l.addConta(cE);
            								lC.incrementaContas(lC.getCliente(o));
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
            					}while(senha < 999 || senha > 99999999);
            				}
            				
            			}while(o < 0 || o > lC.quantClientes()-1);
    				}
    				
    			}else {
    				System.out.println("Op��o invalida!!!");
    			}
    		} while (opc != '0');
        }
        public static void removeConta() {
            	char opc;
            	long numConta = 0;
            	long senha = 0;
            	do {
            		l.listarContas();
            		do {
            			System.out.print("\nInforme o numero da conta que deseja remover:\nNumero: ");
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
                                       if(l.removeConta(numConta)){
                                           gravarListas();
                                       }else{
                                        System.out.println("Não foi possivel remover a conta!");
                                       }
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
}
