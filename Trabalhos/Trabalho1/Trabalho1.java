import java.util.*;

public class Trabalho1 {

	public static void main(String[] args) {
		Scanner Trab1 = new Scanner(System.in);

		int car = 0, serv = 0, clients = 0, cont = 0;
		int cartotal = 0, servtotal = 0;
		int car1total = 0, car2total = 0, car3total = 0, serv1total = 0, serv2total = 0, serv3total = 0;
		float car1p = 0, car2p = 0, car3p = 0, serv1p = 0, serv2p = 0, serv3p = 0;
		float cost11 = 50, cost12 = 70, cost13 = 90, cost21 = 70, cost22 = 90, cost23 = 110, cost31 = 90, cost32 = 110, cost33 = 130, cost = 0, costtotal = 0;
		String car1 = "Pequeno", car2 = "Médio", car3 = "Grande", serv1 = "Lavação interna", serv2 = "Lavação interna + externa", serv3 = "Lavação interna + externa + cera";
		String carM = "", servM = "", carN = "", servN = "";

		System.out.print("Quantos clientes serão atendidos?: ");
		clients = Trab1.nextInt();
		System.out.print("----------------------------------\n");

		while (cont < clients) {
			System.out.print("Qual o seu nome?: ");
			String name = Trab1.next();
			System.out.print("Qual seu tipo de veículo?: ");
			car = Trab1.nextInt();
			cartotal += 1;
			if (car > 3) {
				System.out.print("Erro");
				break;
			}
			System.out.print("E qual serviço você irá escolher?: ");
			serv = Trab1.nextInt();
			servtotal += 1;
			if (serv > 3) {
				System.out.print("Erro");
				break;
			}
			if (car == 1 && serv == 1) {
				carN = "Pequeno";
				servN = "Lavação interna";
				cost = cost11;
				costtotal += cost11;
				car1total += 1;
				serv1total += 1;
			}
			if (car == 1 && serv == 2) {
				carN = "Pequeno";
				servN = "Lavação interna + externa";
				cost = cost12;
				costtotal += cost12;
				car1total += 1;
				serv2total += 1;
			}
			if (car == 1 && serv == 3) {
				carN = "Pequeno";
				servN = "Lavação interna + externa + cera";
				cost = cost13;
				costtotal += cost13;
				car1total += 1;
				serv3total += 1;
			}
			if (car == 2 && serv == 1) {
				carN = "Médio";
				servN = "Lavação interna";
				cost = cost21;
				costtotal += cost21;
				car2total += 1;
				serv1total += 1;
			}
			if (car == 2 && serv == 2) {
				carN = "Médio";
				servN = "Lavação interna + externa";
				cost = cost22;
				costtotal += cost22;
				car2total += 1;
				serv2total += 1;
			}
			if (car == 2 && serv == 3) {
				carN = "Médio";
				servN = "Lavação interna + externa + cera";
				cost = cost23;
				costtotal += cost23;
				car2total += 1;
				serv3total += 1;
			}
			if (car == 3 && serv == 1) {
				carN = "Grande";
				servN = "Lavação interna";
				cost = cost31;
				costtotal += cost31;
				car3total += 1;
				serv1total += 1;
			}
			if (car == 3 && serv == 2) {
				carN = "Grande";
				servN = "Lavação interna + externa";
				cost = cost32;
				costtotal += cost32;
				car3total += 1;
				serv2total += 1;
			}
			if (car == 3 && serv == 3) {
				carN = "Grande";
				servN = "Lavação interna + externa + cera";
				cost = cost33;
				costtotal += cost33;
				car3total += 1;
				serv3total += 1;
			}
			System.out.print("\nOlá " + name + ", seu veículo é do tipo " + carN + ", contratando o serviço de " + servN
					+ " e seu custo é de R$" + cost + "\n");
			System.out.print("---------------------------------------------------------------\n");
			cont++;

		}
		if (car1total != 0 || car2total != 0 || car3total != 0) {
			if (car1total > car2total && car1total > car3total) {
				carM = car1;
			} else if (car2total > car1total && car2total > car3total) {
				carM = car2;
			} else if (car3total > car2total && car3total > car1total) {
				carM = car3;
			} else {
				carM = "Não houve tipo de carro mais atendido";
			}
		}

		if (serv1total != 0 || serv2total != 0 || serv3total != 0) {
			if (serv1total > serv2total && serv1total > serv3total) {
				servM = serv1;
			} else if (serv2total > serv1total && serv2total > serv3total) {
				servM = serv2;
			} else if (serv3total > serv2total && serv3total > serv1total) {
				servM = serv3;
			} else {
				servM = "Não houve tipo de serviço mais vendido";
			}
		}

		car1p = (car1total * 100) / cartotal;
		car2p = (car2total * 100) / cartotal;
		car3p = (car3total * 100) / cartotal;
		serv1p = (serv1total * 100) / servtotal;
		serv2p = (serv2total * 100) / servtotal;
		serv3p = (serv3total * 100) / servtotal;
		System.out.print("O tipo de veículo mais atendido foi o: " + carM + "\n");
		System.out.print("E o tipo de serviço mais vendido foi o: " + servM + "\n");
		System.out.print("---------------------------------------------------------------\n");
		System.out.print("O percentual de veículos atendidos por cada tipo foi de:\nPequenos: " + car1p + "%\nMédios: "
				+ car2p + "%\nGrandes: " + car3p + "%\n");
		System.out.print("---------------------------------------------------------------\n");
		System.out.print("O percentual de atendimentos feitos foi de:\nLavações internas: " + serv1p
				+ "%\nLavações internas + externas: " + serv2p + "%\nLavações internas + externas + cera: " + serv3p
				+ "%\n");
		System.out.print("---------------------------------------------------------------\n");
		System.out.print("O valor total arrecadado foi de R$" + costtotal + "\n");
		System.out.print("---------------------------------------------------------------\n");
		System.out.print("Operação concluída. Volte sempre!!");
	}

}
