import java.util.*;

public class Questao13 {
    public static void main(String []args){
        Scanner myNumber = new Scanner(System.in);

        System.out.print("Qual o primeiro número escolhido?: ");
        int x = myNumber.nextInt();
        System.out.print("Qual o segundo número escolhido?: ");
        int y = myNumber.nextInt();
        System.out.print("Qual o terceiro número escolhido?: ");
        int z = myNumber.nextInt();
        int aux;

        if(x > y){
            aux = x;
            x = y;
            y = aux;
        }
        if(x > z){
            aux = x;
            x = z;
            z = aux;
        }
        if (y > z){
            aux = y;
            y = z;
            z = aux;
        }
        System.out.println("A sequência de números é: "+x+", "+y+", "+z);

    }
}