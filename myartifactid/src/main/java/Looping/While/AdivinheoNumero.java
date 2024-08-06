/* Exercício 03: Adivinhe o Número 
  Descrição: Implemente um jogo onde o programa escolhe um número aleatório
  entre 1 a 100 e o usuário tenta adivinhar o número. O programa deve
  fornecer dicas se o palpite do usuário está muito alto ou muito baixo.
  O jogo continua até o usuário acertar o número.

*/

import java.util.Scanner;

class AdivinheoNumero {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int palpite = 0;

    while (palpite != 29) {
      System.out.println("Digite um número entre 1 a 100 para descobrir o número correto:");
      palpite = entrada.nextInt();

      if (palpite >= 70 && palpite <= 100) {
        System.out.println("Muito alto");
      } else if (palpite >= 50 && palpite < 100) {
        System.out.println("Alto");
      } else if (palpite < 20 && palpite >= 0) {
        System.out.println("Baixo");
      } else if (palpite >= 20 && palpite <= 30) {
        System.out.println("Muito perto");
      } else if (palpite >= 30 && palpite <= 49) {
        System.out.println("Perto");
      } else if(palpite < 0 || palpite > 100){
        System.out.println("Número inválido");
      } 
      else{
        System.out.println();
      }
    }
    System.out.println("Parabéns você acertou!!! :)) ");
    entrada.close();
  }
}
