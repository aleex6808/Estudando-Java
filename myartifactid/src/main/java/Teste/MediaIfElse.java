import java.util.Scanner;

class MediaIfElse {
  public static void 
    main(String[] args) {
      float nota1, nota2, nota3, media;
      Scanner entrada = new Scanner(System.in);

      System.out.println("Digite a primeira nota:");
      nota1 = entrada.nextFloat();

      System.out.println();

      System.out.println("Digite a segunda nota: ");
      nota2 = entrada.nextFloat();

      System.out.println();

      System.out.println("Digite a terceira nota: ");
      nota3 = entrada.nextFloat();

      System.out.println();

      media = (nota1 + nota2 + nota3) / 3;

      System.out.println("A média é: " + media);

      System.out.println();
      
      if (media >= 7){
        System.out.println("Aprovado!");
      }else{
        System.out.println("Reprovado!");
      }
   }
}