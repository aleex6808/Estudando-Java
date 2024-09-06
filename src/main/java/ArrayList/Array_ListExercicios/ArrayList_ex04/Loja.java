package ArrayList_ex04;

import java.util.ArrayList;
import java.util.Scanner;

public class Loja {
	private ArrayList<Roupa> roupas;
	Scanner entrada = new Scanner(System.in);

	public Loja() {
		this.roupas = new ArrayList<Roupa>();
	}

	public void adicionarRoupa(Roupa roupa) {
		roupas.add(roupa);
	}

	public void removerRoupa(Roupa roupa) {
		roupas.remove(roupa);
	}

	public void listarRoupas() {
		if (roupas.size() > 0) {
			for (Roupa roupa : roupas) {
				System.out.println(roupa);
			}
		} else {
			System.out.println("Lista vazia!");
		}
	}

	public void buscarRoupa() {
		int opcao = 0;
		if (roupas.size() > 0) {
			while (opcao != 3) {
				System.out.println("Buscar por: ");
				System.out.println("1-Tipo");
				System.out.println("2-Tamanho");
				System.out.println("3-Sair");
				opcao = entrada.nextInt();
				entrada.nextLine();
				switch (opcao) {
				case 1:
					System.out.println("Busca: ");
					String busca = entrada.nextLine();
					boolean encontrado = false;
					for (Roupa roupa : roupas) {
						if (roupa.getTipo().equalsIgnoreCase(busca)) {
							System.out.println(roupa);
							encontrado = true;
						}
					}
					if (!encontrado) {
						System.out.println("Nenhuma roupa encontrada.");
					}
					break;
				case 2:
					System.out.println("Busca: ");
					busca = entrada.nextLine();
					encontrado = false;
					for (Roupa roupa : roupas) {
						if (roupa.getTamanho().equalsIgnoreCase(busca)) {
							System.out.println(roupa);
							encontrado = true;
						}
					}
					if (!encontrado) {
						System.out.println("Nenhuma roupa encontrada.");
					}
					break;
				}
			}
		}
	}
}
