/*Chame esse método no método main e exiba o resultado.
Exercício 3: Encontrar o Maior Número
Crie um método encontrarMaior que receba três números inteiros e retorne o maior entre eles.

public static int encontrarMaior(int a, int b, int c) {
    // Implemente a lógica para encontrar o maior número
}

Chame esse método no método main e exiba o resultado.*/

package Funções;

import java.util.Scanner;

class Maior_Numero{
  public static void main(String[] args) {
    int n1, n2, n3;
    Scanner entrada = new Scanner(System.in);
    System.out.println("Digite um número");
    n1 = entrada.nextInt();

    System.out.println();

    System.out.println("Digite outro número");
    n2 = entrada.nextInt();

    System.out.println();

    System.out.println("Digite outro número");
    n3 = entrada.nextInt();

    System.out.println();

    int maiorNumero = encontrarMaior(n1, n2, n3);

    System.out.println("O maior número é: " + maiorNumero);

    entrada.close();
  }

  public static int encontrarMaior(int a, int b, int c) {
    if (a > b && a > c) {
      return a;
    } else if (b > a && b > c) {
      return b;
    } else {
      return c;
    }
  }
}
