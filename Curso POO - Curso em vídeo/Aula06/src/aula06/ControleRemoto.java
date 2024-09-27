package aula06;

import java.util.Scanner;

public class ControleRemoto implements Controlador {

	// Atributos
	private int volume;
	private boolean ligado;
	private boolean tocando;
	private boolean menu;
	Scanner entrada = new Scanner(System.in);

	// Métodos especiais
	
	//Método contrutor
	public ControleRemoto() {
		this.volume = 50;
		this.ligado = true;
		this.tocando = false;
		this.menu = false;
	}
	
	//Métodos Getters e Setters

	private boolean getMenu() {
		return menu;
	}

	private void setMenu(boolean menu) {
		this.menu = menu;
	}

	private int getVolume() {
		return volume;
	}

	private void setVolume(int volume) {
		if (this.volume <= 100 && this.volume >= 0) {
			this.volume = volume;
		} else {
			System.out.println("Volume fora do limite permitido (0-100)");
		}
	}

	private boolean getLigado() {
		return ligado;
	}

	private void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	private boolean getTocando() {
		return tocando;
	}

	private void setTocando(boolean tocando) {
		this.tocando = tocando;
	}

	public void ligar() {
		if (!this.getLigado()) {
			this.setLigado(true);
			System.out.println("Controle ligado");
		} else {
			System.out.println("O controle já está ligado");
		}
	}

	public void desligar() {
		if (this.getLigado()) {
			this.setLigado(false);
			System.out.println("Controle desligado");
		} else {
			System.out.println("O controle já está desligado");
		}

	}

	// Métodos do controle remoto
	
	public void executar() { 
		int opcao = 0;
		while (opcao != 6) {
			System.out.println("--- Opções ---");
			System.out.println("1 - Abrir o menu");
			System.out.println("2 - Play/Pause");
			System.out.println("3 - Aumentar volume");
			System.out.println("4 - Diminuir volume");
			System.out.println("5 - Mostrar Status");
			System.out.println("6 - Sair");
			System.out.print("Digite aqui: ");
			opcao = entrada.nextInt();
			entrada.nextLine();

			switch (opcao) {
			case 1:
				abrirMenu();
				break;
			case 2:
				if (!getTocando()) {
					play();
					break;
				} else {
					pause();
					break;
				}
			case 3:
				maisVolume();
				break;
			case 4:
				menosVolume();
				
				break;

			case 5:
				if (getMenu()) {
					System.out.println("Menu já está aberto!");
				} else {
					abrirMenu();
				}
				break;
			case 6:
				fecharMenu();
				System.out.println("Fim do programa...");
				break;
			default:
				System.out.println("Opção inválida");
				break;

			}
		}
	}

	public void abrirMenu() {
		if (getLigado() && !getMenu()) {
			setMenu(true);
			System.out.println("--- MENU ---");
			mostrarStatus();
			System.out.println("");
		} else {
			System.out.println("Não é possível abrir o menu");
		}
	}

	public void fecharMenu() {
		if (getMenu()) {
			setMenu(false);
			System.out.println("Fechando menu...");
		} else {
			System.out.println("Não é possível fechar o menu, pois ele já está fechado");
		}
	}

	public void mostrarStatus() {
		System.out.println("Está ligado? " + this.getLigado());
		System.out.println("Está tocando? " + this.getTocando());
		System.out.println("Volume: " + this.getVolume());
		for (int i = 0; i < this.getVolume(); i += 10) {
			System.out.print("=");
		}
		System.out.println();
	}

	public void maisVolume() {
		if (this.getLigado()) {
			this.setVolume(this.getVolume() + 5);
		} else {
			System.out.println("Impossível aumentar o volume");
		}

	}

	public void menosVolume() {
		if (this.getLigado() && this.getVolume() > 0) {
			this.setVolume(this.getVolume() - 5);
		} else {
			System.out.println("Impossível diminuir o volume");
		}

	}

	public void ligarMudo() {
		if (this.getLigado() && this.getVolume() > 0) {
			this.setVolume(0);
		} else {
			System.out.println("Não é possível ligar o mudo");
		}

	}

	public void desligarMudo() {
		if (this.getLigado() && this.getVolume() == 0) {
			this.setVolume(50);
		} else {
			System.out.println("Não é possível desligar o mudo");
		}

	}

	public void play() {
		if (this.getLigado() && !this.getTocando()) {
			this.setTocando(true);
		} else {
			System.out.println("Não é possível reproduzir");
		}

	}

	public void pause() {
		if (this.getLigado() && this.getTocando()) {
			this.setTocando(false);
		} else {
			System.out.println("Não é possível pausar");
		}

	}

}
