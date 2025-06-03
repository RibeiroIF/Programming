import java.util.*;

public class Questao4 {
    public static void main(String []args){
        Scanner mySquare = new Scanner(System.in);

        System.out.print("Qual o lado do quadrado?: ");
        float mySide = mySquare.nextInt();

        float area = (mySide * mySide);
        float perimeter = (mySide * 4);
        
        System.out.println("A área do quadrado é de "+area+" e seu perímetro é de "+perimeter);

    }
}