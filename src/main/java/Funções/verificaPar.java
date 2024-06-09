/*Exercício 02: Verificar se um Número é Par:

Crie um método ehPar que receba um número inteiro e retorne true se o número for par, e false caso contrário.

*/
package Funções;

import java.util.Scanner;

class verificaPar {
  public static void main(String[] args) {
    int numero;
    Scanner entrada = new Scanner(System.in);
    System.out.println ("Digite um número: ");
    numero = entrada.nextInt();

    System.out.println ();

    System.out.println ("Este número é par?");

    ehPar (numero);

    entrada.close ();
  }

  public static boolean ehPar (int a) {
    boolean par;
    if (a % 2 == 0) {
      par = true;
    }else {
      par = false;
    }
    return par;
  }
}


