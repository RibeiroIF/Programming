package Trabalho2;

import java.util.Scanner;

import javax.swing.JOptionPane;
 
// REQUISITOS:
// 1 - OS DOIS SUBPROGRAMAS ESTÃO ABAIXO: 1) VALOR TOTAL DE VENDAS | 2) PERCENTUAL DE CARROS DO TIPO 1 ATENDIDOS
// 2 - ARMAZENAMENTO DOS DADOS DOS CLIENTES EM VETORES: FOI FEITO NA VARIÁVEL (DADOSCLIENTE[][])
// 3 - 

public class Trabalho2 {
	
	// PRIMEIRO SUBPROGRAMA, CALCULANDO O VALOR TOTAL DE VENDAS
	static float ValorTotal(float valores[]) {
		float somavalores = 0;
		for (float valor : valores) {
			somavalores+=valor;
		}
		return somavalores;
	}
	
	//SEGUNDO SUBPROGRAMA, CALCULANDO O PERCENTUAL DE CARROS DO TIPO 1 (PEQUENOS) ATENDIDOS
	static float PercentualCarro1(int carros[], int totalcar1) {
		float Mcarro1percent = (totalcar1*100)/carros.length;
		return Mcarro1percent;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int cont = 0;
		String []nomes, tipocarro, tiposervico;
		// AQUI É UMA MATRIZ BIDIMENSIONAL PARA ARMAZENAMENTO DOS DADOS DO CLIENTE
		String [][]dadoscliente;
		String carrodestaque = "", servicodestaque = "";
		int clientesnum = 0, totalcar1 = 0, totalcar2 = 0, totalcar3 = 0, totalserv1 = 0, totalserv2 = 0, totalserv3 = 0;
		int []clientesvet, carros, servicos;
		float []valores;
		float valortotal = 0;
		float carro1percent = 0, carro2percent = 0, carro3percent = 0;
		float servico1percent = 0, servico2percent = 0, servico3percent = 0;
		
		clientesnum = Integer.parseInt(JOptionPane.showInputDialog("Quantos clientes serão atendidos: "));
		
		System.out.print("Relatório de pedidos:\n");
		
		// NESTA MATRIZ, O NÚMERO DE DADOS (3) É PRÉ-DEFINIDO (NOME, CARRO E SERVIÇO)
		// JÁ O NÚMERO DE LINHAS É DEFINIDO PELA QUANTIDADE DE CLIENTES QUE SERÃO ATENDIDOS
		dadoscliente = new String [3][clientesnum];
		clientesvet = new int [clientesnum];
		nomes = new String [clientesnum];
		carros = new int [clientesnum];
		tipocarro = new String [clientesnum];
		tiposervico = new String [clientesnum];
		valores = new float [clientesnum];
		servicos = new int [clientesnum];
		
		for (int i = 0; i < clientesvet.length;i++) {
			nomes[i] = JOptionPane.showInputDialog("Qual o nome do cliente: ");
			carros[i] = Integer.parseInt(JOptionPane.showInputDialog("Qual o seu tipo de carro:"
					+ "\n1: Pequeno"
					+ "\n2: Médio"
					+ "\n3: Grande"));
			while(carros[i] > 3) {
				carros[i] = Integer.parseInt(JOptionPane.showInputDialog("Valor inválido. "
						+ "Favor inserir um número entre 1 e 3: "));
			}
			servicos[i] = Integer.parseInt(JOptionPane.showInputDialog("Qual o seu tipo de serviço:"
					+ "\n1: Lavação int."
					+ "\n2: Lavação int. + ext."
					+ "\n3: Lavação int. + ext> + cera"));
			while(servicos[i] > 3) {
				servicos[i] = Integer.parseInt(JOptionPane.showInputDialog("Valor inválido. "
						+ "Favor inserir um número entre 1 e 3: "));
			}
			
			if(carros[i] == 1) {
				tipocarro[i] = "Pequeno";
				switch(servicos[i]) {
				case 1:
					valores[i] = 50;
					tiposervico[i] = "Lavação interna";
					break;
				case 2:
					valores[i] = 70;
					tiposervico[i] = "Lavação int. + externa.";
					break;
				case 3:
					valores[i] = 90;
					tiposervico[i] = "Lavação int. + ext. + cera";
					break;
			}
			}
			if(carros[i] == 2) {
				tipocarro[i] = "Médio";
				switch(servicos[i]) {
				case 1:
					valores[i] = 70;
					tiposervico[i] = "Lavação interna";
					break;
				case 2:
					valores[i] = 90;
					tiposervico[i] = "Lavação int. + externa.";
					break;
				case 3:
					valores[i] = 110;
					tiposervico[i] = "Lavação int. + ext. + cera";
					break;
			}
			}
			if(carros[i] == 3) {
				tipocarro[i] = "Grande";
				switch(servicos[i]) {
				case 1:
					valores[i] = 90;
					tiposervico[i] = "Lavação interna.";
					break;
				case 2:
					valores[i] = 110;
					tiposervico[i] = "Lavação int. + externa.";
					break;
				case 3:
					valores[i] = 130;
					tiposervico[i] = "Lavação int. + ext. + cera";
					break;
			}
			}
			
			dadoscliente[0][cont] = nomes[i];
			dadoscliente[1][cont] = tipocarro[i];
			dadoscliente[2][cont] = tiposervico[i];
			
			JOptionPane.showMessageDialog(null, "Olá "+dadoscliente[0][cont]+", seu carro "+dadoscliente[1][cont]+" recebeu o serviço de "+dadoscliente[2][cont]+" no valor de R$"+valores[i]);
			System.out.println("Pedido número "+(cont+1)+": "+dadoscliente[0][cont]+" | "+dadoscliente[1][cont]+" | "+dadoscliente[2][cont]+" | R$"+valores[i]);
			cont++;
		}
		
		valortotal = ValorTotal(valores);
		for (int carro : carros) {
			if (carro == 1) {
				totalcar1++;
			}
			if (carro == 2) {
				totalcar2++;
			}
			if (carro == 3) {
				totalcar3++;
			}
		}
		
		for (int servico : servicos) {
			if (servico == 1) {
				totalserv1++;
			}
			if (servico == 2) {
				totalserv2++;
			}
			if (servico == 3) {
				totalserv3++;
			}
		}
		
		// carro1percent = (totalcar1*100)/carros.length; -- VIROU O SEGUNDO SUBPROGRAMA
		// NESTA SEÇÃO FOI UTILIZADO O SEGUNDO SUBPROGRAMA, CALCULANDO O PERCENTUAL DE CARROS PEQUENOS ATENDIDOS
		carro1percent = PercentualCarro1(carros, totalcar1);
		carro2percent = (totalcar2*100)/carros.length;
		carro3percent = (totalcar3*100)/carros.length;
		servico1percent = (totalserv1*100)/servicos.length;
		servico2percent = (totalserv2*100)/servicos.length;
		servico3percent = (totalserv3*100)/servicos.length;
		
		if (carro1percent !=0 || carro2percent != 0|| carro3percent != 0) {
			if (carro1percent > carro2percent & carro1percent > carro3percent) {
				carrodestaque = "Pequeno";
			}
			else if (carro2percent > carro1percent & carro2percent > carro3percent) {
				carrodestaque = "Médio";
			}
			else if (carro3percent > carro1percent & carro3percent > carro2percent) {
				carrodestaque = "Grande";
			}
			else {
				carrodestaque = "Não houve carro mais atendido";
			}
		}
		if (servico1percent !=0 || servico2percent != 0|| servico3percent != 0) {
			if (servico1percent > servico2percent & servico1percent > servico3percent) {
				servicodestaque = "Lavação int.";
			}
			else if (servico2percent > servico1percent & servico2percent > servico3percent) {
				servicodestaque = "Lavação int. + ext.";
			}
			else if (servico3percent > servico1percent & servico3percent > servico2percent) {
				servicodestaque = "Lavação int. + ext. + cera";
			}
			else {
				servicodestaque = "Não houve serviço mais vendido";
			}
		}
		System.out.println("---------------------------------------");
		System.out.println("Relatório de ordens de serviço:");
		for (int n = 0; n < clientesnum;n++) {
			System.out.println(nomes[n]+"|"+tipocarro[n]+"|"+tiposervico[n]+"|R$"+valores[n]);
		}
		System.out.println("---------------------------------------");
		JOptionPane.showMessageDialog(null,"O percentual de carros atendidos por tipo foi de:"
						+ "\nPequenos: "+carro1percent+"%"
						+ "\nMédios: "+carro2percent+"%"
						+ "\nGrandes: "+carro3percent+"%");
		System.out.println("Relatório percentual de carros atendidos:"
						+ "\nPequenos: "+carro1percent+"%"
						+ "\nMédios: "+carro2percent+"%"
						+ "\nGrandes: "+carro3percent+"%");
		System.out.println("---------------------------------------");
		JOptionPane.showMessageDialog(null, "O percentual de serviços atendidos por tipo foi de:"
						+ "\nLavação int.: "+servico1percent+"%"
						+ "\nLavação int. + ext.:"+servico2percent+"%"
						+ "\nLavação int. + ext. + cera:"+servico3percent+"%");
		System.out.println("O percentual de serviços atendidos por tipo foi de:"
						+ "\nLavação int.: "+servico1percent+"%"
						+ "\nLavação int. + ext.:"+servico2percent+"%"
						+ "\nLavação int. + ext. + cera:"+servico3percent+"%");
		System.out.println("---------------------------------------");
		JOptionPane.showMessageDialog(null, "O carro mais atendido foi o: "+carrodestaque);
		System.out.println("Carro mais atendido: "+carrodestaque);
		System.out.println("---------------------------------------");
		JOptionPane.showMessageDialog(null, "O serviço mais vendido foi o: "+servicodestaque);
		System.out.println("Serviço mais vendido: "+servicodestaque);
		System.out.println("---------------------------------------");
		// NESSA SEÇÃO FOI UTILIZADO O PRIMEIRO SUBPROGRAMA, CALCULANDO O VALOR TOTAL DE VENDAS
		JOptionPane.showMessageDialog(null, "O total de valores vendidos foi de: R$"+valortotal);
		System.out.println("Total de Valores Vendidos: R$"+valortotal);
		input.close();
	}

}
