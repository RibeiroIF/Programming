import java.util.*;

public class Questao4 {
    public static void main(String []args){
        Scanner mySquare = new Scanner(System.in);

        System.out.print("Qual o raio do círculo?: ");
        float myRay = mySquare.nextInt();

        float area = (myRay * 3.1416f);
        
        System.out.println("A área do círculo é de: "+area);

    }
}