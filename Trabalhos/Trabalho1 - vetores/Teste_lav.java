import java.util.*;

public class Teste_lav {
	public static void main(String[] args) {
		Scanner lav = new Scanner (System.in);
		String carN = "", servN = "", carM = "", servM = "";
		int clients;
		String names[];
		int cars[], car1 = 0, car2 = 0, car3 = 0;
		int servs[], serv1 = 0, serv2 = 0, serv3 = 0;
		float vals[];
		float valtotal = 0, car1p = 0, car2p = 0, car3p = 0, serv1p = 0, serv2p = 0, serv3p = 0;
		
		System.out.print("Quantos clientes serão atendidos?: ");
		clients = lav.nextInt();
		names = new String[clients];
		cars = new int[clients];
		servs = new int[clients];
		vals = new float[clients];
		System.out.print("---------------------------------------------------\n");
		
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
			System.out.print("---------------------------------------------------\n");
			if (servs[i] > 3) {
				System.out.print("Serviço inválido.");
				break;
			}
		}
		
		for (int j = 0; j < cars.length; j++) {
			int serv = servs[j];
			int car = cars[j];
			String name = names[j];
			float val = vals[j];
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
					vals[j] = 90;
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
		valtotal+=val;
		System.out.println("O carro do cliente "+name+" foi o "+carN+" e o serviço vendido foi o "+servN+" no valor de R$"+val);
		System.out.print("---------------------------------------------------\n");
		}
		serv1p = (serv1*100/servs.length);
		serv2p = (serv2*100/servs.length);
		serv3p = (serv3*100/servs.length);
		car1p = (car1*100/cars.length);
		car2p = (car2*100/cars.length);
		car3p = (car3*100/cars.length);

		if (car1 != 0 || car2 != 0 || car3 != 0){
			if (car1 > car2 && car1 > car3){
				carM = "Pequeno";
			}
			else if (car2 > car1 && car2 > car3){
				carM = "Médio";
			}
			else if (car3 > car1 && car3 > car2){
				carM = "Grande";
			}
			else{
				carM = "Não houve tipo de carro mais atendido";
			}
		}
		if (serv1 != 0 || serv2 != 0 || serv3 != 0){
			if (serv1 > serv2 && serv1 > serv3){
				servM = "Lavação interna";
			}
			else if (serv2 > serv1 && serv2 > serv3){
				servM = "Lavação interna + externa";
			}
			else if (serv3 > serv1 && serv3 > serv2){
				servM = "Lavação interna + externa + cera";
			}
			else{
				servM = "Não houve tipo de serviço mais vendido";
			}
		}

		System.out.print("O percentual de veículos atendidos por categoria foi:\nPequeno:"+car1p+"%\nMédio:"+car2p+"%\nGrande:"+car3p+"%\n");
		System.out.print("---------------------------------------------------\n");
		System.out.print("O percentual de serviços escolhidos por categoria foi:\nLavação interna:"+serv1p+"%\nLavação interna+externa:"+serv2p+"%\nLavação interna+externa+cera:"+serv3p+"%\n");
		System.out.print("---------------------------------------------------\n");
		System.out.print("O valor total arrecadado foi de R$"+valtotal+"\n");
		System.out.print("---------------------------------------------------\n");
		System.out.print("O tipo de veículo mais atendido foi o: "+carM+"\n");
		System.out.print("---------------------------------------------------\n");
		System.out.print("E o tipo de serviço mais atendido foi o: "+servM+"\n");
	}
}
