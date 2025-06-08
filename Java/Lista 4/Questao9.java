import java.util.*;//FINALIZADO
//Num frigorífico entrou um certo número de bois que deve ser fornecido como entrada. 
//Cada boi traz no seu pescoço um cartão contendo um número de identificação e seu peso. 
//Fazer um algoritmo que escreva: o número e o peso do boi mais magro; o número e o peso do boi mais gordo e quantos bois entraram no frigorífico. 
public class Questao9 {
    public static void main(String [] args){
        Scanner myQ9 = new Scanner(System.in);

        int cont = 1, bois = 0, id = 0, smallN = 0, bigN = 0;
        float weight = 0f, smallW = 0f, bigW = 0f;

        System.out.print("Qual a quantidade de bois que entraram?: ");
        bois = myQ9.nextInt();

        System.out.print("Qual o número de identificação do boi?: ");
        id = myQ9.nextInt();

        System.out.print("E qual o seu peso?:");
        weight = myQ9.nextFloat();

        bigN = id;
        bigW = weight;
        smallN = id;
        smallW = weight;

        while(cont < bois){
            System.out.print("Qual o número de identificação do boi?: ");
            id = myQ9.nextInt();

            System.out.print("E qual o seu peso?:");
            weight = myQ9.nextFloat();
            
            if(weight < smallW){
                smallW = weight;
                smallN = id;
            }
            if(weight > bigW){
                bigW = weight;
                bigN = id;
            }
            cont++;
        }
            System.out.print("A quantidade de bois que entraram no frigorífico foi de: "+bois);
            System.out.print("\nO número de identificação do boi mais leve é "+smallN+" e seu peso é de "+smallW+"Kg");
            System.out.print("\nO número de identificação do boi mais pesado é "+bigN+" e seu peso é de "+bigW+"Kg\n");


        }
    }//FINALIZADO

