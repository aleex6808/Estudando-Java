/*
Busca e Substring
Crie uma string e peça ao usuário para digitar uma palavra. Verifique se a palavra está presente na string. Se estiver, exiba a posição inicial da palavra e uma substring começando dessa posição até o final da string.
*/

package Strings;

import java.util.Scanner;

class BuscaESub {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    String palavra = "Eu deveria me explicar ou permanecer mal entendido?";
    String string;
    System.out.println("Digite uma palavra: ");
    string = entrada.nextLine();
    
    if (palavra.contains(string)) { // Verifica se a palavra digitada pelo usuário está dentro da String inicial.
      System.out.println("Palavra na posição: " + palavra.indexOf(string)); // Mostra a posição da palavra digitada pelo usuário na String inicial.
      System.out.println("Substring: " + palavra.substring(palavra.indexOf(string), palavra.length())); 
    }else{
      System.out.println("Esta palavra não está dentro da String!!");
      entrada.close();
    }
  }
}