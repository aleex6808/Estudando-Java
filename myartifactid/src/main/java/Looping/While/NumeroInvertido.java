// Exercício 01: Numero Invertido

/* Descrição:
Solicite ao usuário um número inteiro positivo e imprima o número invertido.*/

import java.util.Scanner;

class NumeroInvertido {
  public static void main(String[] args) {
    int cont, qnt_posicoes;
    Scanner entrada = new Scanner(System.in);

    System.out.println("Quantas digitos tem seu número?");
    qnt_posicoes = entrada.nextInt();

    int[] numero = new int[qnt_posicoes];

    
    System.out.print("Digite seu numero apertando a tecla espaço pra cada digito: ");

    
    for(cont = 0; cont < qnt_posicoes; cont++){
      numero[cont] = entrada.nextInt();
      
    }

    System.out.println(); // Pula uma linha
    
    cont = qnt_posicoes - 1;
    
    while(cont >= 0){
      System.out.print(numero[cont] + " ");
      cont--;
      
    }
   
    entrada.close();
  }
}