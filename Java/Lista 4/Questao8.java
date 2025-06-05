import java.util.*;
//Construa um algoritmo para pagamento de comissão de vendas. A quantidade de vendedores deve ser lida no
//início do algoritmo e considere que a comissão é de 5%. Os dados de cada vendedor são os seguintes: nome do
//vendedor e o valor vendido
//Para cada vendedor, deve ser apresentado o valor da comissão.
//Ao final, mostrar os seguintes resultados: A quantidade de vendedores lidos, o valor total vendido; o valor pago
//às comissões e o nome do melhor vendedor e seu respectivo valor de venda e comissão.//
//Saber primeiro: Quantidade de vendedores; valor total vendido ; valor pago às comissões
//Saber depois: melhor vendedor ; melhor valor e sua comissão
public class Questao8 {
    public static void main(String[] args){
        Scanner allSales = new Scanner(System.in);
        Scanner myName = new Scanner(System.in);
        Scanner myVal = new Scanner(System.in);
        Scanner myCom = new Scanner(System.in);

        String b = myName.nextLine();
        int c = myVal.nextInt();
        int d = myCom.nextInt();

        String vendedores = b;
        int vendNumber;
        int total = d;
        int comissao;
        int aux = 0;

        System.out.print("Quantos vendedores estão incluídos?:");
        int a = allSales.nextInt();

        while(aux < vendNumber){
            System.out.print("Qual o nome do vendedor?:");
            b = myName.nextLine();
            System.out.print("Quanto o "+b+" vendeu?: ");
            c = myVal.nextInt();
            aux++;   
        }

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
