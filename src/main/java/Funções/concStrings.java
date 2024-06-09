/*
Exercício 4: Concatenar Strings
Crie um método concatenarStrings que receba duas strings e retorne a concatenação delas.


public static String concatenarStrings(String str1, String str2) {
    // Implemente a lógica para concatenar as strings
}
Chame esse método no método main e exiba o resultado.
*/

package Funções;

import java.util.Scanner;

class concStrings {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    String mens1, mens2, mens3;

    System.out.println("Digite uma mensagem: ");
    mens1 = entrada.nextLine();

    System.out.println();

    System.out.println("Digite outra mensagem: ");
    mens2 = entrada.nextLine();

    mens3 = concatenarStrings(mens1, mens2);
    
    System.out.println();

    System.out.println(mens3);
    
    entrada.close();
  }

  public static String concatenarStrings(String pal1, String pal2) {
    return pal1 + pal2;
  }
}