import java.util.*;

public class Questao11 {
    public static void main(String []args){
        Scanner myNumber = new Scanner(System.in);

        System.out.print("Qual o primeiro número escolhido?: ");
        int x = myNumber.nextInt();
        System.out.print("Qual o segundo número escolhido?: ");
        int y = myNumber.nextInt();
        
        if(x > y){
        System.out.println("O primeiro número é maior");
        }
        else if(x < y){
        System.out.println("O segundo número é maior");
        }
        else{
        System.out.println("Os dois números são iguais");
        }

    }
}

