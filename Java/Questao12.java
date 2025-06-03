import java.util.*;

public class Questao12 {
    public static void main(String []args){
        Scanner myNumber = new Scanner(System.in);

        System.out.print("Qual o primeiro número escolhido?: ");
        int x = myNumber.nextInt();
        System.out.print("Qual o segundo número escolhido?: ");
        int y = myNumber.nextInt();
        System.out.print("Qual o terceiro número escolhido?: ");
        int z = myNumber.nextInt();
        
        if(x > y && x > z){
        System.out.println("O primeiro número é o maior");
        }
        else if(y > x && y > z){
        System.out.println("O segundo número é o maior");
        }
        else if(z > x && z > y){
        System.out.println("O terceiro número é o maior");
        }
        else{
        System.out.println("Os 3 números são iguais");
        }

    }
}