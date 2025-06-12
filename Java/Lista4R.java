package Java;

public class Lista4R{
    public static void main(String[] args){

    int cont=1, cont_int = 0;
    double media=0, soma=0;

    while(cont<=9){
        soma=0;
        media=0;
        cont_int=1;
        while(cont_int<=cont){ 
            System.out.print(cont_int+" ");
            soma+=cont_int;
            media=soma/2;
            cont_int=cont_int+2;
            }
            cont=cont+2;
            System.out.print("A média dos números desta linha é "+media);
            System.out.print("\n");
        }
          
    }
    }