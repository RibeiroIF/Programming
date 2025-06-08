import java.util.*; //NÃO FINALIZADO
//Construa um algoritmo para pagamento de comissão de vendas. A quantidade de vendedores deve ser lida no
//início do algoritmo e considere que a comissão é de 5%. Os dados de cada vendedor são os seguintes: nome do vendedor e o valor vendido
//Para cada vendedor, deve ser apresentado o valor da comissão.
//Ao final, mostrar os seguintes resultados: A quantidade de vendedores lidos, o valor total vendido; o valor pago
//às comissões e o nome do melhor vendedor e seu respectivo valor de venda e comissão.
//Saber primeiro: Quantidade de vendedores; valor total vendido ; valor pago às comissões
//Saber depois: melhor vendedor ; melhor valor e sua comissão
public class Questao8 {
    public static void main(String[] args){
       Scanner myQ8 = new Scanner(System.in);

       int cont = 0, vendedores = 0; 
       float venda = 0, vendaM = 0, vendatotal = 0, comissaototal = 0, comissaoM = 0;
       String nome = "", nomeM = "";

       System.out.print("Quantos vendedores foram contabilizados?: ");
       vendedores = myQ8.nextInt(); myQ8.nextLine();

       while(cont < vendedores){
            System.out.print("Qual o nome do vendedor?: ");
            nome = myQ8.nextLine();
            System.out.print("Quanto este vendedor vendeu?: ");
            venda = myQ8.nextFloat();
            myQ8.nextLine();
                if(venda > vendaM){
                    vendaM = venda;
                    nomeM = nome;
                    comissaoM = (venda * 0.05f);
                }
                vendatotal+=venda;
                cont++;
       }
            comissaototal = (vendatotal*0.05f);
            System.out.print("A quantidade de vendedores foi de "+vendedores+", o valor total de vendas foi de R$"+vendatotal+" e o total de comissão repassado foi de R$"+comissaototal+".");
            System.out.print("\nO vendedor que mais vendeu foi " +nomeM+ ", o valor vendido por ele foi de R$"+vendaM+" e sua comissão foi de R$"+comissaoM+".\n");
    }
}//NÃO FINALIZADO 
