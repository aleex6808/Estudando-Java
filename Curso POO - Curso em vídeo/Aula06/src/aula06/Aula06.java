package aula06;
import java.util.Scanner;


public class Aula06 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		ControleRemoto c = new ControleRemoto();
		
		System.out.println("Digite um valor entre -100 e 100");
		int x = entrada.nextInt();
	while(x <= 100 && x >= -100) {
			System.out.println("Digite um valor entre -100 e 100");
			 x = entrada.nextInt();
		}
		System.out.println("Encerrando...");
		
		}
	}


