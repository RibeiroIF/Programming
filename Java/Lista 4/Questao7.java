import java.util.*;
//Construa um algoritmo para ler a cotação do dólar e, na sequência, ler um determinado valor em dólar//
//mostrando seu respectivo valor em reais. Repita a operação enquanto o valor for diferente de 0 //
public class Questao7 {
    public static void main(String[] args){
        Scanner myDol = new Scanner(System.in);
        Scanner myVal = new Scanner(System.in);

        System.out.print("Qual a cotação do dólar?:");
        float a = myDol.nextFloat();

        System.out.print("Qual o valor em dólar?: ");
        float b = myVal.nextFloat();
        float reais = (b/a);

        while(reais != 0f){
            System.out.print("O valor convertido para reais é: "+reais);
            System.out.print("\nQual a cotação do dólar?:");
            a = myDol.nextFloat();
            System.out.print("Qual o valor em dólar?: ");
            b = myVal.nextFloat();
            reais = (b/a);
        if(reais == 0f);{
            System.out.print("Operação encerrada.");
            break;
        }
    }

    }

    
}
