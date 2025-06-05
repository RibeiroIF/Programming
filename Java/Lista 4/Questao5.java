import java.util.*;

public class Questao5{
    public static void main(String[] args){
        Scanner myNum = new Scanner(System.in);

        System.out.print("Selecione um número: ");
        int x = myNum.nextInt();
        int cont = 1;
        
        while(cont >=0 || cont <= 16);{
            System.out.print("Selecione um número: ");
            x = myNum.nextInt();
            cont++;
        if(x > 0){
            System.out.println("O número é maior que zero");
        }
        if(x < 0){
            System.out.println("O número é menor que zero");
        }
        if(x == 0){
            System.out.println("O número é igual a zero");
        }
        }     
    } 
}
