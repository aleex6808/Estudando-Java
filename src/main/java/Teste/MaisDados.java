import java.util.Scanner;

class MaisDados {
  public static void
  main(String[] args) {
    String nome;
    int idade;
    float altura;
    Scanner entrada = new Scanner(System.in);
      System.out.println("Digite seu nome: ");
      nome = entrada.nextLine();

      System.out.println("Digite sua idade: ");
      idade = entrada.nextInt();
    
      System.out.println("Digite sua altura: ");
      altura = entrada.nextFloat();

      System.out.println("Dados do usuário: ");
      System.out.println("Nome: " + nome);
      System.out.println("Idade: " + idade);
      System.out.println("Altura: " + altura);
      entrada.close();
    
  }
}