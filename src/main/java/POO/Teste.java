package POO;

public class Teste {
	
	
	public static void main(String[] args) {
		ClasseQueCalcula classeQueCalcula = new ClasseQueCalcula();
		
		int area1 = classeQueCalcula.calcularArea(5,10);
		System.out.println("Área do retângulo com base 5 e altura 10: " + area1);
		
		
		double area2 = classeQueCalcula.calcularArea(2.5, 7.8);
		System.out.println("Área do retângulo com base 2.5 e altura 7.8: " + area2);
	}
}
