/*
Comparação de Strings
Peça ao usuário para digitar duas strings e compare-as usando equals e compareTo. Exiba os resultados.
*/

import java.util.Scanner;

class CompStrings{
  public static void main(String[] args){
    Scanner entrada = new Scanner(System.in);
    String palavra1, palavra2;

    System.out.println("Digite algo: ");
    palavra1 = entrada.nextLine();

    System.out.println("\nDigite algo novamente: ");
    palavra2 = entrada.nextLine();

    System.out.println("\nUsando equals: " + palavra1.equals(palavra2));
    System.out.println("\nUsando compareTo: " + palavra1.compareTo(palavra2));
  }
}