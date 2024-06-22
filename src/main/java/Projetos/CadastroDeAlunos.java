/* 
Ideia gerada pelo Chat GPT
Claro! Vamos criar um programa em Java que utiliza tanto estruturas de decisão (if-else) quanto estruturas de repetição (loops) para resolver um problema interessante. A ideia do programa será um "Sistema de Cadastro e Pesquisa de Alunos". Este programa permitirá ao usuário:

1 - Cadastrar novos alunos com nome e nota.
2 - Listar todos os alunos cadastrados.
3 - Calcular e exibir a média das notas dos alunos.
4 - Exibir os alunos que possuem nota acima da média.
5 - Sair do programa. */

import java.util.Scanner; // Importa a biblioteca do Scanner..

//Declaração de variáveis
class CadastroDeAlunos {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in); 
    String[] alunos = new String[30];
    int opcao = 0, i = 0, contAluno = 0;
    float[] notas = new float[30];
    float soma = 0, media = 0;

    while (opcao != 5) { //Enquanto o usuário não digitar 5 o programa continua..
      
      menu (); //Imprime o menu
      
      opcao = entrada.nextInt(); //Captura a opção escolhida pelo usuário
      
      entrada.nextLine(); // Consome a nova linha residual

      switch (opcao) { //Com base na opção escolhida realiza um dos cases
          
        case 1: // Cadastra novos alunos com nome e nota
          System.out.println();
          
          System.out.print("Digite o nome do aluno: ");
          alunos[i] = entrada.nextLine();

          System.out.println();
          
          System.out.print("Digite a nota do aluno: ");
          notas[i] = entrada.nextFloat();
          
          entrada.nextLine();

          i++;

          contAluno++;

          System.out.println();
          
          break;
          
        case 2: // Lista os alunos com nome e nota
          for (i = 0; i < contAluno; i++){
            System.out.println();
            
            System.out.println("Aluno " + (i+1) + ": " + alunos[i]);
            System.out.println("Nota do aluno " + (i + 1) + ": " + notas[i]);

            System.out.println();
          }
          
          break;
          
        case 3: // Imprime a média das notas dos alunos

         for (i = 0; i < contAluno; i++){
           
          soma = soma + notas[i]; 
           
         }
          media = soma / contAluno;

          System.out.println();

          System.out.println("A média das notas dos alunos é: " + media);
           
         
          break;
          
        case 4: // Lista os alunos que possuem a nota acima da média
          
          System.out.println("Alunos que possuem a nota acima da média: ");

          System.out.println();
          
            for (i = 0; i < contAluno; i++){
              
              if (notas[i] > media){
                
                System.out.println("Nome do aluno: " + alunos[i]);
                
                System.out.println();
                
                System.out.println("Nota do aluno: " + notas[i]);

                System.out.println();
              }
            }
          
          break;
          
        case 5: // Mostra uma mensagem antes de finalizar o programa
            System.out.println("---- Fim da execução!!!! ----");
          break;

        default: // Pro caso do usuário escolher uma opção inválida
            System.out.println("Opção inválida digite novamente.");
          break;

      }
    }

    entrada.close(); //Fecha o Scanner
  }

  public static void menu() { // Imprime o menu
    System.out.println(" ---- Sistema de cadastro de aluno ---- ");
    System.out.println(" 1 - Cadastrar aluno.");
    System.out.println(" 2 - Listar aluno(s).");
    System.out.println(" 3 - Calcular e exibir a média das notas dos alunos.");
    System.out.println(" 4 - Exibir os alunos que possuem nota acima da média.");
    System.out.println(" 5 - Sair do programa.");

    System.out.println();
    
    System.out.print("Digite aqui: ");

  }
}
