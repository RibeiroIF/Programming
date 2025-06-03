import java.util.*;

public class Questao3 {
    public static void main(String[] args){
        Scanner myNum = new Scanner(System.in);

        System.out.print("Qual o número determinado?: ");
        int a = myNum.nextInt();

        while(a>1 && a<27){
            System.out.print(a+" ");
            a = a+2;
        }
    }
    
}
