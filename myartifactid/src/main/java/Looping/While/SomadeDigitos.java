/* Exercicio 02: Soma de Dígitos.

Descrição: Solicite ao uúario um número inteiro positivo 
e calcule a soma de seus dígitos.
    
*/

import java.util.Scanner;

class SomadeDigitos{
  public static void
  main(String[] args) {
     Scanner entrada = new Scanner(System.in);
     int qnts_posicoes, soma = 0;
    
    System.out.println("Quantas dígitos tem seu número? ");
    qnts_posicoes = entrada.nextInt();
    
    
    System.out.println();
    
    System.out.print("Digite um número inteiro positivo: ");
                                                             
    int[] numero = new int[qnts_posicoes];

    int i = 0;
    
    while(i < qnts_posicoes){
      numero[i] = entrada.nextInt();
      
      soma = soma + numero[i];

      i++;
    }
     System.out.println(soma);
  }
}