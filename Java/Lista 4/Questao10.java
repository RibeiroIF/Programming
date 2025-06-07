import java.util.Scanner;
//Tendo como dados de entrada a altura e o sexo de uma pessoa, construa um algoritmo que calcule seu peso
//ideal, utilizando as seguintes fórmulas://
//Para Homens: (72,7* altura) – 58//
//Para Mulheres: (62,1 * altura) – 44.7//
//• Na leitura do sexo só poderão ser aceitos M (masculino) ou F (feminino)
//• Realizar a seguinte pergunta ao usuário: ‘DESEJA CONTINUAR (S/N) ?’ e repetir caso a resposta for
//afirmativa.
public class Questao10{
    public static void main(String[] args){
        Scanner myQ10 = new Scanner(System.in);

        System.out.print("Qual o seu sexo: ");
        String gender = myQ10.nextLine();
            
        System.out.print("Qual a sua altura: ");
        float height = myQ10.nextFloat();
        String go = myQ10.nextLine();
        float weight;
        go = "s";
        
        while (go.equals("s")) {
        if(gender.equals("f")){
            weight = (62.1f * height) - 44.7f;
            System.out.print("Seu peso ideal é de: "+weight);
            System.out.print("\nDeseja continuar? S/N: ");
            go = myQ10.nextLine(); 
        }
        else if(gender.equals("m")){
            weight = (72.7f * height) - 58f;
            System.out.print("Seu peso ideal é de: "+weight);
            System.out.print("\nDeseja continuar? S/N: ");
            go = myQ10.nextLine();
        }
        System.out.print("Qual o seu sexo: ");
        gender = myQ10.nextLine();   
        System.out.print("Qual a sua altura: ");
        height = myQ10.nextFloat();
        if(go.equals("n")){
            break;
        }
    }
}
}//NÃO FINALIZADO 
