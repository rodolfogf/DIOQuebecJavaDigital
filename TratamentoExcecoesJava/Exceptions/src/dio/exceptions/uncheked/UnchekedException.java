package dio.exceptions.uncheked;

import javax.swing.*;

public class UnchekedException {
    public static void main(String[] args) {

        boolean loop = true;
        int z = 0;
        do {
            String x = JOptionPane.showInputDialog("Informe o dividendo: ");
            String y = JOptionPane.showInputDialog("Informe o divisor: ");

            try{
                z = dividir(Integer.parseInt(x), Integer.parseInt(y));
                loop = false;
            }
            catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Só são aceitos números!");
            }
            catch (ArithmeticException e){
                JOptionPane.showMessageDialog(null, "Divisão por zero!");
            }
        }while (loop);

        System.out.println("z: " + z);
    }

    public static int dividir(int a, int b){
        return a/b;
    }
}
