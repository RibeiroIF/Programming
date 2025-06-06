import java.util.*;
//FINALIZADA
public class Questao5{
    public static void main(String[] args){
        Scanner myNum = new Scanner(System.in);

        System.out.print("Selecione um número: ");
        int x = myNum.nextInt();
        int cont = 0;
        cont = 0;
       
        while(cont >= 0 && cont < 16){
        if(cont == 14){
                System.out.print("O número não foi contabilizado, já atingimos o limite.");
                System.out.print("\nFim da sessão.\n");
                break;
                }        
        if(x > 0){
                System.out.println("O número é maior que zero");
                System.out.print("Selecione um número: ");
                x = myNum.nextInt();
                cont++;
                }
        if(x < 0){
                System.out.println("O número é menor que zero");
                System.out.print("Selecione um número: ");
                x = myNum.nextInt();
                cont++;
                }
        if(x == 0){
                System.out.println("O número é igual a zero");
                System.out.print("Selecione um número: ");
                x = myNum.nextInt();
                cont++;
                }
            }
    }
}//FINALIZADO
             

