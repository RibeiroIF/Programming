import java.util.*;

public class Questao6{
    public static void main(String[] args){
        Scanner myNum = new Scanner(System.in);

        System.out.print("Insira o número de início da contagem: ");
        int n = myNum.nextInt();

    while (n >= 1 && n <= 30) {
        System.out.print(n+" ");
        n++;
        if (n % 4 == 0) {
            System.out.print("pim ");
            n++;
        }
    } 
        
    }
}//FINALIZADO