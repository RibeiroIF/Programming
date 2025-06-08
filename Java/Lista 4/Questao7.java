import java.util.*; //FINALIZADO
//Construa um algoritmo para ler a cotação do dólar e, na sequência, ler um determinado valor em dólar 
//mostrando seu respectivo valor em reais. Repita a operação enquanto o valor for diferente de 0 
public class Questao7 {
    public static void main(String[] args){
        Scanner myQ7 = new Scanner(System.in);
        
        System.out.print("Qual a cotação do dólar?: ");
        float a = myQ7.nextFloat();
        System.out.print("Qual o valor em dólar?: ");
        float b = myQ7.nextFloat();
        float reais = 1f;
        reais = (b*a);

        while(reais != 0f){
            System.out.print("O valor convertido para reais é: "+reais);
            System.out.print("\nQual a cotação do dólar?: ");
            a = myQ7.nextFloat();
            System.out.print("Qual o valor em dólar?: ");
            b = myQ7.nextFloat();
            reais = (b*a);
        if(b == 0){
            System.out.print("\nOperação encerrada.\n");
            break;
        }
        }
    }
}//FINALIZADO   

