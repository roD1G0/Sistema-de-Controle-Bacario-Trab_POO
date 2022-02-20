package app;
import java.util.ArrayList;
import java.io.Serializable;
import java.util.Date;
public class ListaContas implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6012310947413061783L;
	private ArrayList <Conta> contas;
	
	public ListaContas() {
		contas = new ArrayList<Conta>();
	}
	public void addConta(Conta conta) {
		contas.add(conta);
	}
	public int quantContas() {
		return contas.size();
	}
	public String listarContas() { 
		String lista = "";
		for(int i = 0; i < contas.size(); i++)
		 lista += (i+") "+contas.get(i).toString())+"\n";
		return lista;
	}
	public boolean removeConta(long numero) {
		for(int i = 0; i < contas.size(); i++) {
			if(numero == contas.get(i).getNumeroConta()){
				contas.remove(i);
				return true;
			}
		}
		return false;
	}
	public boolean verificaNumero(long numero) {
		for(int i = 0; i < contas.size(); i++) {
			if(numero == contas.get(i).getNumeroConta()) {
				return true;
			}
		}
		return false;
	}
	public boolean saqueConta(long numero, long senha, double valor) {
                Date dia = new Date();
		for(int i = 0; i < contas.size(); i++) {
			if(numero == contas.get(i).getNumeroConta()){
                            try{
                                contas.get(i).saque(senha, valor, dia.getDay());
                                return true;
                            }catch(Exception er){
                                System.err.println(er.getMessage());
                            }
                            return false;
			}
		}
		return false;
	}
	public boolean depositaConta(long numero, long senha, double valor) {
            Date dia = new Date();
		for(int i = 0; i < contas.size(); i++) {
			if(numero == contas.get(i).getNumeroConta()){
                            try{
                                contas.get(i).deposito(senha, valor, dia.getDay());
                                return true;
                            }catch(Exception er){
                                System.out.println(er.getMessage());
                            }
                            return false;
			}
		}
		return false;
		
	}
	public boolean encerraConta(long numero, long senha) {
		for(int i = 0; i < contas.size(); i++) {
			if(numero == contas.get(i).getNumeroConta()){
                            try{
                                contas.get(i).encerraConta(senha);
                            }catch(Exception er){
                                System.err.println(er.getMessage());
                            }
                            return true;
			}
		}
		return false;
		
	}
	public boolean reativarConta (long numero) {
		for(int i = 0; i < contas.size(); i++) {
			if(numero == contas.get(i).getNumeroConta()){
				if(contas.get(i).ativaConta())
				return true;
			}
		}
		return false;
		
	}
	public boolean verificaSenha(long numero, long senha) {
		for(int i = 0; i < contas.size(); i++) {
			if(numero == contas.get(i).getNumeroConta() && contas.get(i).validaSenha(senha) == true) {
				return true;
			}
		}
		return false;
	}
	public boolean alterarLimite(long numero, long senha, double valor) {
		for(int i = 0; i < contas.size(); i++) {
			if(numero == contas.get(i).getNumeroConta()){
				if("Conta Especial".equals(contas.get(i).getTipoConta())) {
					ContaEspecial cE = (ContaEspecial) contas.get(i);
					contas.remove(i);
					try{
                                            cE.alterarLimite(senha, valor);
                                        }catch(Exception er){
                                            System.err.println(er.getMessage());
                                        } 
                                    contas.add(cE);
                                    return true;
			}
				
		}
	}
		return false;
		
	}
        public Cliente getCliente(long numero) {
		for(int i = 0; i < contas.size(); i++) {
			if(numero == contas.get(i).getNumeroConta()){
				return contas.get(i).getCliente();
			}
		}
		return null;
	}
        public String getSaldoMaior(){
            int maior = 0;
            for(int i = 0; i < contas.size(); i++){
              if(contas.get(i).getSaldo() >= contas.get(maior).getSaldo()){
                    maior = i;
            }
        }
            return contas.get(maior).toString();
    }
        public String getSaldoMenor(){
            int menor = 0;
            for(int i = 0; i < contas.size(); i++){
                if(contas.get(i).getSaldo() <= contas.get(menor).getSaldo()){
                    menor = i;
                }
        }
        return contas.get(menor).toString();
    }
        public long getMaiorNumero(){
		long maximo = 10000;
		for(int i = 0; i <contas.size(); i++){
			if(contas.get(i).getNumeroConta() > maximo){
				maximo = contas.get(i).getNumeroConta();
			}
		}
		return maximo;
	}
        public String[] getLista(){
            String[] lista = new String[contas.size()];
		for(int i = 0; i < contas.size(); i++)
		 lista[i] = (i+") "+contas.get(i).toString());
            return lista;
        }
}
