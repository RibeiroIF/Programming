import java.util.*;

public class Questao7 {
    public static void main(String []args){
        Scanner myN1 = new Scanner(System.in);
        Scanner myN2 = new Scanner(System.in);

        System.out.print("Qual o primeiro número escolhido?: ");
        int x = myN1.nextInt();

        System.out.print("Qual o segundo número escolhido?: ");
        int y = myN2.nextInt();

        float rest = (x % y);
        
        System.out.println("O resto da divisão é de: "+rest);

    }
}
