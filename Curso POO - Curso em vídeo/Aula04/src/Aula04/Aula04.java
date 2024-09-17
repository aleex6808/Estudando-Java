package Aula04;

public class Aula04 {
	public static void main(String[] args) {
		Caneta c1 = new Caneta("NIC", "Amarela",0.4f);
		
		Caneta c2 = new Caneta("KKK", "Laranja", 1.5f);
		
		c1.status();
		System.out.println();
		c2.status();
	}
	
	
}
