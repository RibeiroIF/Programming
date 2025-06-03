import java.util.*;

public class Questao8 {
    public static void main(String []args){
        Scanner mySalary = new Scanner(System.in);

        System.out.print("Qual o seu salário?: ");
        float x = mySalary.nextInt();

        float inss = (x * 0.08f);
        
        System.out.println("O valor a ser descontado pelo INSS é de: "+inss);

    }
}