import java.util.*;

public class Teste_met {

public static void myHeart(int bpm, String bpmR){
    if (bpm == 80){
        bpmR = "bom";
    }
    if (bpm > 80){
        bpmR = "ruim";
    }
    if (bpm < 80){
        bpmR = "abaixo";
    }
}

public static void myMessage(int bpm, String bpmR){
    myHeart(bpm, bpmR);
    System.out.println("Seu batimento está: "+bpmR);
}
    public static void main(String[]args){
        Scanner teste = new Scanner (System.in);
        int bpm;
        String good = "bom", bad = "ruim", average = "abaixo";
        String bpmR = "";
        
        System.out.println("Qual seu bpm atual?: ");
        bpm = teste.nextInt();

        myMessage(bpm, bpmR);
    }
}
