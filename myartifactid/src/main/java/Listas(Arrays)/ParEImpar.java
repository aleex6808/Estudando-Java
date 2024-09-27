/*
Crie um programa que peça ao usuário para entrar com 15 números armazene-os em um array e em seguida, conte quantos são pares e quantos são ímpares. Exiba essas informações.
*/

import java.util.Scanner;


class ParEImpar {
  public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);
    final int TAMANHO = 15;
    int numeros[] = new int[TAMANHO];
    int impares[] = new int[TAMANHO];
    int pares[] = new int[TAMANHO];

    int i, contpar = 0, contimpar = 0;

    for (i = 0; i < TAMANHO; i++) {
      System.out.println("Digite o " + (i + 1) + "º número: ");
      numeros[i] = entrada.nextInt();

      if (numeros[i] % 2 == 0) {
        pares[i] = numeros[i];
        contpar++;
      } else {
        impares[i] = numeros[i];
        contimpar++;
      }
       System.out.println();
    }
    
    System.out.println("Impares: ");
    
    for (i = 0; i < TAMANHO; i++) {
      if (impares[i] != 0) {
        System.out.print(impares[i] + " | ");

      }
  }
    System.out.println();
    System.out.println();
    System.out.println("Pares: ");
    
    for (i = 0; i < TAMANHO; i++) {
        if (pares[i] != 0) {
          System.out.print(pares[i] + " | ");

        }
    }
    System.out.println();
    System.out.println();
    System.out.println("Quantidade de números impares: " + contimpar);
    System.out.println();
    System.out.println("Quantidade de números pares: " + contpar);
    entrada.close();
  }
}