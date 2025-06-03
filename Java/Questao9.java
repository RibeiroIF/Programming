import java.util.*;

public class Questao9 {
    public static void main(String []args){
        Scanner myNumber = new Scanner(System.in);

        System.out.print("Qual o número escolhido?: ");
        float myN = myNumber.nextFloat();

        if (myN > 0){
            System.out.println("O número "+myN+" é positivo");
        }
        else if (myN < 0){
            System.out.println("O número "+myN+" é negativo");
        }
        else{
            System.out.println("O número é zero");
        }
    }
}