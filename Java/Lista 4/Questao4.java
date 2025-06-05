import java.util.*;

public class Questao4 {
    public static void main(String[] args){
        Scanner myNum = new Scanner(System.in);

        System.out.print("Escolha um número: ");
        int a = myNum.nextInt();
        int b = a;
        int c = 2;

        while (b < a*11){
            System.out.print(b+" ");
            b = a*c;
            c++;
            
        }
    }
}
