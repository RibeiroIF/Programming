import java.util.*;

public class Teste_met {

static void myHeart(int bpm, String bpmR){
    if (bpm == 80){
        bpmR = "bom";
        System.out.println("Seu batimento está: "+bpmR);
    }
    if (bpm > 80){
        bpmR = "ruim";
        System.out.println("Seu batimento está: "+bpmR);
    }
    if (bpm < 80){
        bpmR = "abaixo";
        System.out.println("Seu batimento está: "+bpmR);
    }
}
    public static void main(String[]args){
        Scanner teste = new Scanner (System.in);
        int bpm;
        String good = "bom", bad = "ruim", average = "abaixo";
        String bpmR = "";
        
        System.out.println("Qual seu bpm atual?: ");
        bpm = teste.nextInt();

        myHeart(bpm, bpmR);
    }
}
