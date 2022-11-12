package dio.exceptions.custom;

import javax.swing.*;

public class CustomException {
    public static void main(String[] args) {
        int[] divisores = {1, 3, 4, 8, 9};
        int[] dividendos = {3, 7, 8, 17, 18, 21};

        for(int i = 0; i<dividendos.length; i++){
            try{
                if(dividendos[i] % divisores[i] !=0)
                    throw new DivisaoComRestoException("Esta operação não aceitará divisão com resto!", dividendos[i], divisores[i]);

                int resultado = dividendos[i] / divisores [i];
                System.out.println("Resultado:" + resultado);
            }catch (DivisaoComRestoException e){
                JOptionPane.showMessageDialog(null,"Esta operação não aceitará divisão com resto!");
                e.printStackTrace();
            }catch (ArrayIndexOutOfBoundsException e){
                JOptionPane.showMessageDialog(null,"Existem mais dividendos do que divisores!");
                e.printStackTrace();
            }
        }
    }
}
