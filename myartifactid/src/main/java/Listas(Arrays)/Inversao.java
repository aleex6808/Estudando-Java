/*
Exercício 3: Inverter um ArrayEscreva um programa que leia 5 números em um array e, em seguida, exiba os números na ordem inversa à que foram inseridos.
*/

import java.util.Scanner;

class inversao {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    float[] numeros = new float[5];
    int i;
    for (i = 0; i < 5; i++) {
      System.out.println ("Digite o " + (i + 1) + "° número: ");
      numeros[i] = entrada.nextFloat ();
    }
    System.out.println ();
    
    i = 4;

    while (i >= 0) {
      System.out.println(numeros[i]);
      i--;
    }
    
  }
}