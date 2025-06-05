import java.util.*;

public class Atividade7 {
    public static void main(String[] args){
        Scanner myNumber = new Scanner(System.in);

        System.out.print("Escolha um número: ");
        int x = myNumber.nextInt();
        int y = x;

        System.out.print("Ordem Crescente: ");
        while (x < y+10){
            System.out.print(x+" ");
            x++;
        }
        x=x-10;
        System.out.print("\nOrdem Descrescente: ");
        while (x > y-10){
            System.out.print(x+" ");
            x--;
        }
    }
}