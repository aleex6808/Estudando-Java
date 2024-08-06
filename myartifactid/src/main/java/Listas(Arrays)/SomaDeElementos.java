/*
Escreva um programa que peça ao usuário pra entrar com 10 números e armazene esses números em um array. Depois, some todos os números e exiba a soma.
*/

import java.util.Scanner;

class SomaDeElementos {
  public static void main(String[] args){
    Scanner entrada = new Scanner(System.in);
    int i = 0, soma = 0;
    int[] numeros = new int[10];
    
      for(i = 0; i < 10; i++){
        System.out.println("Digite o " + (i+1) + "º número:");
        numeros[i] = entrada.nextInt();
        
        soma += numeros[i];
      }
      System.out.println();
    
      System.out.println("A soma dos números é: " + soma);
    
    entrada.close();
  }
}