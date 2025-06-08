import java.util.*; //FINALIZADO
//Dados 3 valores numéricos A,B e C, verificar se eles podem ser comprimentos de lados de um triângulo e, se
//forem, verificar (classificados quanto ao lado) se é triângulo: equilátero, isósceles ou escaleno. Caso não seja um
//triângulo, escrever uma mensagem.
//Obs. 1: Triângulos: Equilátero: todos os lados iguais; Isósceles: dois lados iguais; Escaleno: todos os lados
//diferentes
//Obs. 2: Para que seja um triângulo, cada lado deve ser menor que a soma dos outros dois.
public class Questao2 {
    public static void main(String[]args){
        Scanner sideOne = new Scanner(System.in);
        Scanner sideTwo = new Scanner(System.in);
        Scanner sideThree = new Scanner(System.in);
    
    System.out.print("Qual o valor do primeiro lado do triângulo?: ");
    float a = sideOne.nextFloat();

    System.out.print("Qual o valor do segundo lado do triângulo?: ");
    float b = sideTwo.nextFloat();

    System.out.print("E qual o valor do terceiro lado do triângulo?: ");
    float c = sideThree.nextFloat();

    if(a+b < c || a+c < b || b+c < a){
        System.out.print("Este não é um triângulo\n");
    }
    else if(a==b && b==c && a==c){
        System.out.print("Este é um triângulo equilátero\n");
    }
    else if(a==b || b==c || a==c){
        System.out.print("Este é um triângulo isósceles\n");
    }
    else if(a!=b && a!=c && b!=c){
        System.out.print("Este é um triângulo escaleno\n");
    }

    }
    
}//FINALIZADO
