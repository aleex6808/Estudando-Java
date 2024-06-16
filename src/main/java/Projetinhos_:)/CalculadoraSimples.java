/* 
Algoritmo Calculadora Simples

Rascunho:
- Informa o menu para o usuário *
- Utiliza função switch para implementar o menu *
- Utiliza o while para interromper o programa *
- Utiliza methods para os cálculos *
*/

import java.util.Scanner;

class CalculadoraSimples {
  public static void main(String[] args) {

    // Declaração de variáveis..
    Scanner entrada = new Scanner(System.in);
    int opcao = 0;
    float n1, n2, resultado;

    // Looping: Caso a opção 5 for escolhida ele interrompe o programa..
    while (opcao != 5) {
      menu(); // Mostra as opções disponíveis para o usuário..
      opcao = entrada.nextInt(); // Recebe a opção digitada pelo usuário e armazena na váriavel..

      switch (opcao) { // Com base na opção escolhida realiza uma das seguintes ações..
        case 1:
          System.out.print("\nDigite o primeiro número: ");
          n1 = entrada.nextFloat(); // Recebe a número digitado pelo usuário e o armazena na váriavel..

          System.out.print("\nDigite o segundo número: ");
          n2 = entrada.nextFloat();

          resultado = adicao(n1, n2); // Realiza o cálculo..

          System.out.println("\nResultado: " + resultado + "\n"); // Imprime o resultado..

          break;
        case 2:
          System.out.print("\nDigite o primeiro número: ");
          n1 = entrada.nextFloat(); // Recebe a número digitado pelo usuário e o armazena na váriavel..

          System.out.print("\nDigite o segundo número: ");
          n2 = entrada.nextFloat();

          resultado = subtracao(n1, n2); // Realiza o cálculo..

          System.out.println("\nResultado: " + resultado + "\n"); // Imprime o resultado..

          break;
        case 3:
          System.out.print("\nDigite o primeiro número: ");
          n1 = entrada.nextFloat(); // Recebe a número digitado pelo usuário e o armazena na váriavel..

          System.out.print("\nDigite o segundo número: ");
          n2 = entrada.nextFloat();

          resultado = multiplicacao(n1, n2); // Realiza o cálculo..

          System.out.println("\nResultado: " + resultado + "\n"); // Imprime o resultado..

          break;
        case 4:
          System.out.print("\nDigite o primeiro número: ");
          n1 = entrada.nextFloat(); // Recebe a número digitado pelo usuário e o armazena na váriavel..

          System.out.print("\nDigite o segundo número: ");
          n2 = entrada.nextFloat();

          if(n1 == 0 || n2 == 0){
            System.out.println("\n Erro!!! Não é possível dividir por zero \n");
            break;
          }

          resultado = divisao(n1, n2); // Realiza o cálculo..

          System.out.println("\nResultado: " + resultado + "\n"); // Imprime o resultado..

          break;
      }
    }
    entrada.close(); // Fecha o scanner..
  }

  // Função que imprime o menu com as opções disponíveis, para o usuário..
  public static void menu() {
    System.out.println(" --- Calculadora Simples ---");
    System.out.println("\n 1 - Adição ");
    System.out.println(" 2 - Subtração ");
    System.out.println(" 3 - Multiplicação ");
    System.out.println(" 4 - Divisão ");
    System.out.println(" 5 - Sair ");

    System.out.print("\n Digite aqui: ");
  }

  // Função de adição..
  public static float adicao(float n1, float n2) {
    return n1 + n2;
  }

  // Função de subtração..
  public static float subtracao(float n1, float n2) {
    return n1 - n2;
  }

  // Função de multiplicação..
  public static float multiplicacao(float n1, float n2) {
    return n1 * n2;
  }

  // Função de divisão..
  public static float divisao(float n1, float n2) {
    return n1 / n2;
  }
}
