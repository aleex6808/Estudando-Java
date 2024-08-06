package exercicios;

public class Ventilador {
	String cor;
	boolean ligado;
	int velocidade;
	int qnt_pas;
	boolean tomada;
	
	void ligar() {
		if (this.tomada == false) {
			System.out.println("Erro!!! Não é possível ligar.");
		} else {
			this.ligado = true;
		}
	}
	
	void ventilar() {
		if (this.ligado == false) {
			System.out.println("Erro!!! Não é possível ventilar.");
		} else {
			System.out.println("Escolha a velocidade");
		}
	}
}
