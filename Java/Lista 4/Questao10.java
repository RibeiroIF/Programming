import java.util.Scanner; //FINALIZADO
//Tendo como dados de entrada a altura e o sexo de uma pessoa, construa um algoritmo que calcule seu peso
//ideal, utilizando as seguintes fórmulas:
//Para Homens: (72,7* altura) – 58
//Para Mulheres: (62,1 * altura) – 44.7
//• Na leitura do sexo só poderão ser aceitos M (masculino) ou F (feminino)
//• Realizar a seguinte pergunta ao usuário: ‘DESEJA CONTINUAR (S/N) ?’ e repetir caso a resposta for
//afirmativa.
public class Questao10{
    public static void main(String[] args){
        Scanner myQ10 = new Scanner(System.in);

        String gender = "", go = "S"; 
        float height = 0 , weight = 0;
        
        
        while (go.equalsIgnoreCase("S")) {
            System.out.print("Qual o seu sexo: ");
            gender = myQ10.nextLine();
            System.out.print("Qual a sua altura: ");
            height = myQ10.nextFloat(); go = myQ10.nextLine();
        if(gender.equals("f") || go.equals("F")){
            weight = (62.1f * height) - 44.7f;
            System.out.print("Seu peso ideal é de: "+weight);
        }
        if(gender.equals("m") || go.equals("M")){
            weight = (72.7f * height) - 58f;
            System.out.print("Seu peso ideal é de: "+weight);  
        }
        System.out.print("\nDeseja continuar?: ");
        go = myQ10.nextLine();
        }
        System.out.print("Programa finalizado.");
    }
}
//FINALIZADO 
