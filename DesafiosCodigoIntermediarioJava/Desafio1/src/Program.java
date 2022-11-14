// Abaixo segue um exemplo de código que você pode ou não utilizar

import java.util.*;

public class Program
{
    public static void main(String[] args)
    {
        int num = Integer.parseInt(new Scanner(System.in).nextLine());
        var step = 0;

// TODO: Implemente uma condição onde seja possível reduzir o número até 0:

        while (num >  0 )
        {
            if ((num % 2) == 1)
            {
                num -= 1;
                step++;
            }
            else{
                num = num / 2;
                step++;
            }

        }

        if(step >  0){
            System.out.println(step);
        }else{
            System.out.println("");
        }
    }
}