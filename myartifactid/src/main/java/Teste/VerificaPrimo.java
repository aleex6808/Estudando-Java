/*
Algoritmo que verifica se o número é primo
Rascunho:
- solicitar informações ao usúario
- utilizar loop, até encontrar um número que não seja divisivel por além dele mesmo ou 1 continua o programa, um numero nunca será divisivel (exato) por um número maior que ele, então só preciso percorrer de 1 ate ele mesmo

Bom, esse é um código mais simples do que eu imaginei que seria, mas eu gostei de fazer, porque na minha época de estudos de lógica (mais no início) eu sofri bastante pra desenvolver esse algoritmo e usei muito mais de cálculos do propriamente de lógica, desta forma, fica bem mais simples e intuitivo. E mostra pra mim mesmo da minha melhora :) 
*/

import java.util.Scanner;

class VerificaPrimo {
  public static void main(String[] args){
    Scanner entrada = new Scanner(System.in);
    int i, numero, contprimo = 0;

    System.out.println("Digite o número: ");
    numero = entrada.nextInt();

    for (i = 1; i <= numero; i++) {
      if(numero % i == 0){
        contprimo++;
      }
    }
    
    if (contprimo == 2){
      System.out.println("\nEste número é primo!! ");
    } else {
      System.out.println("\nEste número não é primo!! ");
    }
    
    entrada.close();
  }
}