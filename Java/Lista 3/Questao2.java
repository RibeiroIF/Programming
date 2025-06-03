import java.util.Scanner;

public class Questao2 {

     public static void main(String []args){
        Scanner myN1 = new Scanner(System.in);
        Scanner myN2 = new Scanner(System.in);

        System.out.print("Qual o primeiro número?: ");
        int myNumber1 = myN1.nextInt();

        System.out.print("Qual o segundo número?: ");
        int myNumber2 = myN2.nextInt();

        int result = myNumber1 + myNumber2;
        
        System.out.println("A soma dos dois números é de: "+result);
    } 
}