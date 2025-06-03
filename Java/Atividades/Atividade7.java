import java.util.*;

public class Atividade7 {
    public static void main(String[] args){
        Scanner myNumber = new Scanner(System.in);

        System.out.print("Escolha um número: ");
        int x = myNumber.nextInt();
        int y = x;

        System.out.print("Ordem Crescente: ");
        do{
            System.out.print(x+" ");
            x++;
        }
        while (x < y+10);
        x=x-10;
        System.out.print("\nOrdem Descrescente: ");
        do{
            System.out.print(x+" ");
            x--;
        }
        while (x > y-10);
    }
}
