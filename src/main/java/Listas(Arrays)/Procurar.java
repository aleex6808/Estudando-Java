/*
Exercício 5: Procurar um Elemento em um Array
Escreva um programa que armazene 8 nomes em um array e permita ao usuário procurar por um nome específico. O programa deve informar se o nome foi encontrado e sua posição no array.
*/

import java.util.Scanner;

class Procurar {
  public static void main(String[] args) {

    // Declaração de variáveis
    final int TAM = 8;
    Scanner entrada = new Scanner(System.in);
    String[] nomes = new String[TAM];
    int i;
    boolean encontrado = false;
    String busca;

    // Looping: Recebe os nomes e armazena no vetor
    for (i = 0; i < TAM; i++) {
      System.out.print("Digite o " + (i + 1) + "º nome: ");
      nomes[i] = entrada.nextLine();

      System.out.println(); // Quebra a linha
    }

    // Recebe o nome que será buscado
    System.out.print("\nDigite o nome que deseja buscar: ");
    busca = entrada.nextLine();

    // Looping e verificação
    
    looping(busca, nomes);

    for (i = 0; i < TAM; i++) {
      if (busca.equals(nomes[i])) { // Verifica se o nome buscado existe no vetor ( equals() é usado para comparar strings)
        System.out.print(i + " "); // Retorna a posição que o nome está
        encontrado = true;
      }
    }

    if (!encontrado) {
      System.out.println("\nNome não encontrado...\n");
    }

    System.out.println("\n\n ---Fim do programa!--- ");

    entrada.close();
  }

  public static String looping(String palavra1, String[] palavra2) {
    for (int i = 0; i < palavra2.length; i++) {
      if (palavra1.equals(palavra2[i])) {
        System.out.print("\nNome(s) encontrado(s) na(s) posição(ões): ");
        break;
      }
    }
    return "";
  }
}