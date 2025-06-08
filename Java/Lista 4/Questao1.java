import java.util.*; //FINALIZADO
//Faça um algoritmo que, dado o consumo em KWh, calcule o valor da energia elétrica consumida em um mês.
//Sabe-se que: de 0-150 cobra-se R$ 0,2262 por KWh e o excedente (>150) cobra-se R$ 0,26531 por KWh 
public class Questao1 {
    public static void main(String[] args){
        Scanner myName = new Scanner(System.in);
        Scanner myLight = new Scanner(System.in);
        float valor;
        float extra;

        System.out.print("Qual seu nome?: ");
        String name = myName.nextLine();

        System.out.print("Quanto foi seu gasto de luz em KWh?: ");
        float light = myLight.nextFloat();

        if(light <= 150){
            valor = (light*0.2262f);
        }
        else{
            extra = (light - 150);
            valor = ((150*0.2262f)+(extra*0.26531f));
        }

        System.out.println(name+", seu gasto total de luz neste mês foi de: "+valor);

    }
    
}//FINALIZADO
