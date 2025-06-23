import java.util.*;

public class Teste_lav {

	public static void myMessage(int car, int serv, String name, String carN, String servN){
		if (car == 1) {
			carN = "Pequeno";
		}
		if (car == 2) {
			carN = "Médio";
		}
		if (car == 3) {
			carN = "Grande";
		}
		if (serv == 1) {
			servN = "Lavação interna";
		}
		if (serv == 2) {
			servN = "Lavação interna + externa";
		}
		if (serv == 3) {
			servN = "Lavação interna + externa + cera";
		}
		System.out.println("O carro do cliente "+name+" foi o "+carN+" e o serviço vendido foi o "+servN);
	}
	public static void main(String[] args) {
		Scanner lav = new Scanner (System.in);
		String carN = "", servN = "";
		int clients;
		String names[];
		int cars[];
		int servs[];
		int valtotal = 0, val = 0, val1 = 50, val2 = 70, val3 = 90, val4 = 110, val5 = 130;
		
		System.out.print("Quantos clientes serão atendidos?: ");
		clients = lav.nextInt();
		names = new String[clients];
		cars = new int[clients];
		servs = new int[clients];
		
		for (int i = 0; i < clients; i++) {
			System.out.print("Qual o nome do cliente?: ");
			names[i] = lav.next();
			System.out.print("Qual o carro deste cliente?: ");
			cars[i] = lav.nextInt();
			if (cars[i] > 3) {
				System.out.print("Serviço inválido.");
				break;
			}
			System.out.print("E qual o serviço escolhido?: ");
			servs[i] = lav.nextInt();
			if (servs[i] > 3) {
				System.out.print("Serviço inválido.");
				break;
			}
		}
		
		for (int j = 0; j < cars.length; j++) {
			int serv = servs[j];
			int car = cars[j];
			String name = names[j];
			System.out.print("------------------------------------------\n");
			myMessage(car, serv, name, carN, servN);
		}
		

	}
}
