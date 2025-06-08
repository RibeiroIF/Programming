import java.util.*; //FINALIZADO
//Faça um algoritmo que mostre os números pares entre 1 e 27
public class Questao3 {
    public static void main(String[] args){
        Scanner myNum = new Scanner(System.in);

        System.out.print("Qual o número determinado?: ");
        int a = myNum.nextInt();

        if(a == 1){
            a++;
            while (a>1 && a<27){
                System.out.print(a+" ");
                a = a+2;
            }
        }
        else if(a == 2){
        while(a>1 && a<27){
            System.out.print(a+" ");
            a = a+2;
        }
        }
        else{
            System.out.print("Não foi o número solicitado");
        }
    }
}//FINALIZADO