import java.util.Scanner;
class Temperatura {
  public static void 
  main(String[] args) {
    float celsius, fahrenheit;

    System.out.println("Digite a temperatura em Celsius: ");
    Scanner entrada = new Scanner(System.in);
    celsius = entrada.nextFloat();
    fahrenheit = (celsius * 9/5) + 32;
    System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);
    entrada.close();
    
  }

}