import java.util.*;

public class Teste_lav {

	public static void myMessage(int cars[], int servs[], float val, float valtotal, int car, int serv, int car1, int car2, int car3, int serv1, int serv2, int serv3, float serv1p, float serv2p, float serv3p, float car1p, float car2p, float car3p, String name, String carN, String servN){
		if (car == 1) {
			carN = "Pequeno";
			car1++;
			if (serv == 1){
				servN = "Lavação interna";
				val = 50;
				serv1++;
			}
			if (serv == 2){
				servN = "Lavação interna + externa";
				val = 70;
				serv2++;
			}
			if (serv == 3){
				servN = "Lavação interna + externa + cera";
				val = 90;
				serv3++;
			}
		}
		if (car == 2) {
			carN = "Médio";
			car2++;
			if (serv == 1){
				servN = "Lavação interna";
				val = 70;
				serv1++;
			}
			if (serv == 2){
				servN = "Lavação interna + externa";
				val = 90;
				serv2++;
			}
			if (serv == 3){
				servN = "Lavação interna + externa + cera";
				val = 110;
				serv3++;
			}
		}
		if (car == 3) {
			carN = "Grande";
			car3++;
			if (serv == 1){
				servN = "Lavação interna";
				val = 90;
				serv1++;
			}
			if (serv == 2){
				servN = "Lavação interna + externa";
				val = 110;
				serv2++;
			}
			if (serv == 3){
				servN = "Lavação interna + externa + cera";
				val = 130;
				serv3++;
			}
		}
		serv1p = (serv1*100/servs.length);
		serv2p = (serv2*100/servs.length);
		serv3p = (serv3*100/servs.length);
		car1p = (car1*100/cars.length);
		car2p = (car2*100/cars.length);
		car3p = (car3*100/cars.length);
		valtotal+=val;
		System.out.println("O carro do cliente "+name+" foi o "+carN+" e o serviço vendido foi o "+servN+" no valor de R$"+val);
		System.out.print("------------------------------------------\n");
		System.out.print("O percentual de veículos atendidos por categoria foi:\nPequeno: "+car1p+"\nMédio: "+car2p+"\nGrande: "+car3p+"\n");
		System.out.print("------------------------------------------\n");
		System.out.print("O percentual de serviços escolhidos por categoria foi:\nLavação interna: "+serv1p+"\nLavação interna+externa: "+serv2p+"\nLavação interna+externa+cera: "+serv3p);
		System.out.print("------------------------------------------\n");
	}
	public static void main(String[] args) {
		Scanner lav = new Scanner (System.in);
		String carN = "", servN = "";
		int clients;
		String names[];
		int cars[], car1 = 0, car2 = 0, car3 = 0;
		int servs[], serv1 = 0, serv2 = 0, serv3 = 0;
		float valtotal = 0, val = 0, car1p = 0, car2p = 0, car3p = 0, serv1p = 0, serv2p = 0, serv3p = 0;
		
		System.out.print("Quantos clientes serão atendidos?: ");
		clients = lav.nextInt();
		names = new String[clients];
		cars = new int[clients];
		servs = new int[clients];
		System.out.print("------------------------------------------\n");
		
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
			System.out.print("------------------------------------------\n");
			if (servs[i] > 3) {
				System.out.print("Serviço inválido.");
				break;
			}
		}
		
		for (int j = 0; j < cars.length; j++) {
			int serv = servs[j];
			int car = cars[j];
			String name = names[j];
			myMessage(cars, servs, val, valtotal, car, serv, car1, car2, car3, serv1, serv2, serv3, car1p, car2p, car3p, serv1p, serv2p, serv3p, name, carN, servN);
			System.out.print("------------------------------------------\n");
		}

	}
}
