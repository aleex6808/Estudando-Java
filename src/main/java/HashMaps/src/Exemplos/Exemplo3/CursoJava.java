package Exemplos.Exemplo3;

import java.util.HashMap;

public class CursoJava {

	public static void main(String[] args) {

		HashMap<Integer, String> carros = new HashMap<Integer, String>();

		carros.put(1, "Polo");
		carros.put(2, "HRV");
		carros.put(3, "Golf");
		carros.put(4, "Camaro");
		carros.put(5, "Mustang");
		carros.put(6, "Cruze");

		System.out.println(carros);
		
		carros.clear();
		
		
		//System.out.println(carros.get(1));

		for(String c:carros.values()) {
			System.out.println(c);
		}
	}
}
