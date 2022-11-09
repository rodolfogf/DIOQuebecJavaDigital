package dio.exceptions.cheked;

import javax.swing.*;
import java.io.*;

public class CheckedException {
    public static void main(String[] args){

        String nomeArquivo = "teste.txt";

        try{
            imprimirArquivo(nomeArquivo);
        }catch (FileNotFoundException e){
            JOptionPane.showMessageDialog(null, "Arquivo não encontrado");
        }catch (IOException e){
            JOptionPane.showMessageDialog(null, "Erro ao tentar abrir o arquivo");
            e.printStackTrace();
        }
    }

    public static void imprimirArquivo(String nmarquivo) throws IOException {

        File arquivo = new File(nmarquivo);

        BufferedReader br = new BufferedReader(new FileReader(arquivo.getName()));
        String linha = br.readLine();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        do{
            bw.write(linha);
            bw.newLine();
            linha = br.readLine();
        }while(linha != null);
        bw.flush();
        br.close();
    }
}
