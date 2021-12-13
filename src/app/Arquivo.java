package app;
import java.io.*;

public class Arquivo{

	public static void gravar(String matriz[][], String nomeArquivo) throws Exception{
		//abre o arquivo para escrita
		FileOutputStream outFile = new FileOutputStream(new File(nomeArquivo));
		BufferedWriter buff = new BufferedWriter(new OutputStreamWriter(outFile, "UTF-8"));
		
		for(int i = 0; i < 2; i++) {
			  for(int j = 0; j < 5; j++) {
					//escreve no arquivo
					buff.write(matriz[i][j]);
			  }
			  buff.newLine();
		  }

		// fecha o arquivo
		buff.close();  
		outFile.close();
	}

	public static String[] getLinhas(String nomeArquivo) throws Exception{
        // declaração das variáveis        
       	String[] linhas;
		String linha;
		int nlinhas, i = 0;
        //abre o arquivo para leitura
        FileInputStream inFile = new FileInputStream(new File(nomeArquivo));
        BufferedReader buff = new BufferedReader(new InputStreamReader(inFile, "UTF-8"));

        //lê a primeira linha do arquivo (numero de linhas)
		linha = buff.readLine();
		nlinhas = 11;
		linhas = new String[nlinhas+1];
		linhas[i++] = linha;

		//lê as demais linhas do arquivo
		do{
			linha = buff.readLine();
			if(linha != null)
				linhas[i++] = linha; 
		}while(linha != null);
            
        //fecha o arquivo
        buff.close();
        inFile.close();
		
		return linhas;
    }

}