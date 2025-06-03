import java.util.*;

public class Questao10 {
    public static void main(String []args){
        Scanner myNumber = new Scanner(System.in);

        System.out.print("Qual o número escolhido?: ");
        int x = myNumber.nextInt();
        
        if(x % 2 == 0){
        System.out.println("O número é par");
        }
        else{
        System.out.println("O número é ímpar");
        }

    }
}
