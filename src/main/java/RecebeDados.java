import java.util.Scanner;

class RecebeDados {
  public static void main(String[] args) {
    String nome;
    Scanner entrada = new Scanner(System.in);
    System.out.println("Digite seu nome: ");
    nome = entrada.nextLine();
    System.out.println("Olá, " + nome + "! É um prazer te conhecer!");

    entrada.close();

  }
}