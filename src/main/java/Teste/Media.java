import java.util.Scanner;

class Media {
  public static void 
  main(String[] args) {
  float nota1, nota2, nota3, media;

  Scanner entrada = new Scanner(System.in);
  
  System.out.println("Digite a primeira nota: ");
  nota1 = entrada.nextFloat();

  System.out.println("Digite a segunda nota: ");
  nota2 = entrada.nextFloat();

  System.out.println("Digite a terceira nota: ");
  nota3 = entrada.nextFloat();

  media = (nota1 + nota2 + nota3) / 3 ;

  System.out.println("A média das notas é: " + media);

    entrada.close();
  }
}