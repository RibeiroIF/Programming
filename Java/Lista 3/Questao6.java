import java.util.*;

public class Questao6 {
    public static void main(String []args){
        Scanner myTemp = new Scanner(System.in);

        System.out.print("Qual a temperatura em Fahrenheit?: ");
        float x = myTemp.nextInt();
        
        float temp = (5 * (x-32)/9);
        
        System.out.println("A temperatura em Celsius é de: "+temp);

    }
}
