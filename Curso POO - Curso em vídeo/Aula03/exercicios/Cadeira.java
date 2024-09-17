package exercicios;

public class Cadeira {
	String cor;
	String material;
	boolean ocupada;
	
	void sentar() {
		ocupada = true;
	}
	
	void status() {
		System.out.println("A cor da cadeira é: " + this.cor);
		System.out.println("A cadeira é feita de " + this.material);
		System.out.println("A cadeira está sendo ocupada? " + this.ocupada);
	}
}
