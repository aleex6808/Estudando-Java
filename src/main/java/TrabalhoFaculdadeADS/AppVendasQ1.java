package TrabalhoFaculdadeADS;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;


public class AppVendasQ1 {
	public static void main(String[] args) {
		
		// Questão 1:
		
		// Declaração de valores

		Scanner entrada = new Scanner(System.in);
		double valorDoPedido, juros, valorDaParcela, valorTotalParcelado;
		int quantidadeParcelas;

		// Apresentação

		System.out.println("Bem-vindos a loja do Alexander de Almeida Fortuna");

		// Entrada de informações

		System.out.print("Digite o valor do pedido: ");
		valorDoPedido = entrada.nextDouble();
		entrada.nextLine();
		System.out.print("Digite a quantidade de parcelas: ");
		quantidadeParcelas = entrada.nextInt();
		entrada.nextLine();

		// Determina os juros com base na quantidade de parcelas

		if (quantidadeParcelas < 4) {
			juros = 0.0 / 100.0;
		} else if (quantidadeParcelas >= 4 && quantidadeParcelas < 6) {
			juros = 4.0 / 100.0;
		} else if (quantidadeParcelas >= 6 && quantidadeParcelas < 9) {
			juros = 8.0 / 100.0;
		} else if (quantidadeParcelas >= 9 && quantidadeParcelas < 13) {
			juros = 16.0 / 100.0;
		} else if (quantidadeParcelas >= 13) {
			juros = 32.0 / 100.0;
		} else {
			juros = 0.0;
		}

		// Cálculo dos valores

		valorDaParcela = (valorDoPedido * (1 + juros)) / quantidadeParcelas;
		

		valorTotalParcelado = valorDaParcela * quantidadeParcelas;

		// Saída de informações

		System.out.println("O valor das parcelas é de: R$" + BigDecimal.valueOf(valorDaParcela).setScale(2, RoundingMode.HALF_UP));
		System.out.println("O valor total parcelado é de: R$" + BigDecimal.valueOf(valorTotalParcelado));

	}

}
