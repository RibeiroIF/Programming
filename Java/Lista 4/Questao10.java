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
        Scanner myHeight = new Scanner(System.in);
        Scanner myGender = new Scanner(System.in);

        System.out.print("Qual o seu sexo: ");
        String gender = myGender.nextLine();
            
        System.out.print("Qual a sua altura: ");
        float height = myHeight.nextFloat();

        String go = "S/N";
        float weight;
        
        while (go == "S") {
            System.out.print("Qual o seu sexo: ");
            gender = myGender.nextLine();
            System.out.print("Qual o seu peso: ");
            height = myHeight.nextFloat();
        if(gender == "f"){
            weight = (62.1f * height) - 44.7f;
            System.out.print("Seu peso é de: "+weight);
            System.out.print("Deseja continuar?: "); 
            continue;
        }
        else if(gender == "m"){
            weight = (72.7f * height) - 58f;
            System.out.print("Seu peso é de: "+weight);
            System.out.print("Deseja continuar?: "); 
            continue;
        }
        }
    }
}
