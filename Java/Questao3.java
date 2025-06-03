import java.util.*;

public class Questao3 {

     public static void main(String []args){
        Scanner myN1 = new Scanner(System.in);
        Scanner myN2 = new Scanner(System.in);
        Scanner myN3 = new Scanner(System.in);
        Scanner myN4 = new Scanner(System.in);

        System.out.print("Qual sua primeira nota?: ");
        float myNumber1 = myN1.nextInt();

        System.out.print("Qual sua segunda nota?: ");
        float myNumber2 = myN2.nextInt();

        System.out.print("Qual sua terceira nota?: ");
        float myNumber3 = myN3.nextInt();

        System.out.print("E qual sua quarta nota?: ");
        float myNumber4 = myN4.nextInt();

        float result = ((myNumber1 + myNumber2 + myNumber3 + myNumber4)/4);
        
        System.out.println("A sua média é de: "+result);
    }
}