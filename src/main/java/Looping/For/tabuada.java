/* Exercício 1: Imprimir a tabuada de um número.

Solicite ao usuário um número inteiro e imprima a tabuada desse número de 1 a 10. */

import java.util.Scanner;

class tabuada {
  public static void 
  main(String[] args) {
    int numero, resultado, i;
    Scanner entrada = new Scanner(System.in);

    System.out.println("Digite um número: ");
    numero = entrada.nextInt();

    System.out.println("Tabuada do: " + numero);

    for (i = 1; i <= 10; i++) {
      resultado= numero * i;
      System.out.println(numero + " X " + i + " = " + resultado);
    }

  }
}