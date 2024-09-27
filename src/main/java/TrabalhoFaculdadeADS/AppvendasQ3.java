package TrabalhoFaculdadeADS;

import java.util.Scanner;

public class AppvendasQ3 {

	public static String escolha = "";
	public static double modelo, quantidade;
	public static double desconto, frete, num_camisetas;
	public static int escolha_frete;
	public static boolean entradaValida = false;
	public static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		escolha_modelo();
		num_camisetas();
		frete();
		double total = (modelo * num_camisetas) + frete;
		System.out.println("Total: R$" + total + " (" + "Modelo: " + modelo + " * Quantidade(com desconto): "
				+ num_camisetas + " + frete: " + frete + ")");
	}

	public static String escolha_modelo() {

		while (!escolha.equalsIgnoreCase("MCS") && !escolha.equalsIgnoreCase("MLS") && !escolha.equalsIgnoreCase("MCE")
				&& !escolha.equalsIgnoreCase("MLE")) {

			System.out.println("Bem vindo a fábrica de Camisetas do Alexander de Almeida Fortuna");
			System.out.println("Entre com o modelo desejado");
			System.out.println("MCS - Manga Curta Simples");
			System.out.println("MLS - Manga Longa Simples");
			System.out.println("MCE - Manga Curta Com Estampa");
			System.out.println("MCL - Manga Longa Com Estampa");
			System.out.print(">>");
			escolha = entrada.next();
			entrada.nextLine();

			if (escolha.equalsIgnoreCase("MCS")) {
				modelo = 1.80;
			} else if (escolha.equalsIgnoreCase("MLS")) {
				modelo = 2.10;
			} else if (escolha.equalsIgnoreCase("MCE")) {
				modelo = 2.90;
			} else if (escolha.equalsIgnoreCase("MLE")) {
				modelo = 3.20;
			} else {
				System.out.println("Escolha inválida, entre com o modelo novamente.");
			}
		}

		return escolha;

	}

	public static double num_camisetas() {
		while (!entradaValida) {
			System.out.print("Entre com o número de camisetas: ");
			String quantidadeStr = entrada.nextLine();

			try {
				quantidade = Double.parseDouble(quantidadeStr);

				if (quantidade > 20000) {
					System.out.println("Não aceitamos pedidos nessa quantidade.");
				} else {

					entradaValida = true;

					if (quantidade >= 20 && quantidade < 200) {
						desconto = 5 / 100.0;

					} else if (quantidade >= 200 && quantidade < 2000) {
						desconto = 7 / 100.0;

					} else if (quantidade >= 2000 && quantidade <= 20000) {
						desconto = 12 / 100.0;

					} else {
						System.out.println("Produto sem desconto.");
						desconto = 0;
					}

				}

			} catch (NumberFormatException e) {

				System.out.println("O valor fornecido não é numérico.");

			}
		}

		num_camisetas = quantidade - (quantidade * desconto);

		return num_camisetas;
	}

	public static double frete() {

		entradaValida = false;

		while (!entradaValida) {
			System.out.println("Escolha o tipo de frete: ");
			System.out.println("1 - Frete por transportadora - R$100.00");
			System.out.println("2 - Frete por Sedex - R$200.00");
			System.out.println("0 - Retirar pedido na fábrica - R$ 0 .00");
			System.out.print(">>");
			escolha_frete = entrada.nextInt();
			entrada.nextLine();

			if (escolha_frete == 1) {
				frete = 100.00;
				entradaValida = true;

			} else if (escolha_frete == 2) {
				frete = 200.00;
				entradaValida = true;

			} else if (escolha_frete == 0) {
				frete = 0.00;
				entradaValida = true;

			} else {
				System.out.println("Opção inválida. Escolha novamente.");
			}
		}

		return frete;

	}
}
