/* Exercício 2: Calcular o fatorial de um número.

Solicite ao usuário um número inteiro positivo e calcule o fatorial desse número. */

import java.util.Scanner;

class fatorial{
  public static void 
  main(String[] args){
    int numero, i, soma = 1;
    Scanner entrada = new Scanner(System.in);

    System.out.println("Digite o número: ");
    numero = entrada.nextInt();

    for(i = 1; i <= numero; i++) {
      soma = i * (soma + 0);
    }

    System.out.println("O fatorial deste número é: " + soma);

    entrada.close();
  }
}