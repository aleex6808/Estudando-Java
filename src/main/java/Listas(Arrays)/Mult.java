/*
Exercício 4: Multiplicação dos Elementos de um Array
Crie um programa que peça ao usuário para entrar com 5 números e armazene-os em um array. Em seguida, multiplique todos os elementos e exiba o resultado da multiplicação.
*/

import java.util.Scanner;

class Mult {
  public static void main(String[] args) {
    
    // Declaração de variáveis
    Scanner entrada = new Scanner(System.in);
    double[] numeros = new double[5];
    int i;
    double mult = 1;
    
    // Looping: Solicita os números ao usuário armazena no vetor de posição i
    for (i = 0; i < 5; i++) {
      System.out.println ("Digite o " + (i + 1) + "º número: ");
      numeros[i] = entrada.nextDouble();

      System.out.println ();      
    } 

    // Realiza o cálculo
    for (i = 0; i < 5; i++) {
      mult *= numeros[i];
    } 
    
    System.out.println ("\nExibição do resultado:\n");

     System.out.println (mult);

    entrada.close();
  }
}