/*
Exercício 01: Calcular a área de um Retângulo

Crie um método calcularAreaRetangulo que receba a largura e a altura de um retângulo e retorne a área.
a = b * h
*/
package Funções;

import java.util.Scanner;

class AreaRetangulo{
  public static void
  main(String[] args){
    float largura, altura;
    Scanner entrada = new Scanner(System.in);
    System.out.println("Digite a largura: ");
    largura = entrada.nextFloat();
    System.out.println();
    System.out.println("Digite a altura: ");
    altura = entrada.nextFloat();
    float resultado = mult(largura, altura);
    System.out.println();
    
    System.out.println("A área desse retângulo: " + resultado);
  }

  public static float mult(float a, float b){
    return a * b;
}
}

