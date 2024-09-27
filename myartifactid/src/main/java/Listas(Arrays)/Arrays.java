/*
Arrays em Java são uma estrutura de dados que permitem armazenar múltiplos valores do mesmo tipo em uma única variável. Os arrays têm um tamanho fixo que é definido quando o array é criado.

Como Funciona um Array em Java

Declaração de um Array:
int[] numeros;

Instanciação de um Array:
numeros = new int[5];

Ou, de forma combinada:
int[] numeros = new int[5];

Inicialização de um Array:
int[] numeros = {1, 2, 3, 4, 5};

Acesso aos Elementos de um Array:
int primeiroNumero = numeros[0]; // Acessa o primeiro elemento
numeros[1] = 10; // Modifica o segundo elemento

Exemplos de Utilização de Arrays

1. Armazenar Notas de Estudantes

public class ExemploNotas {
    public static void main(String[] args) {
        int[] notas = {90, 85, 78, 92, 88};
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota do estudante " + (i+1) + ": " + notas[i]);
        }
    }
}

2. Calcular a Média de Valores

public class CalcularMedia {
    public static void main(String[] args) {
        int[] valores = {10, 20, 30, 40, 50};
        int soma = 0;
        for (int i = 0; i < valores.length; i++) {
            soma += valores[i];
        }
        double media = soma / (double) valores.length;
        System.out.println("A média é: " + media);
    }
}

3. Encontrar o Maior e o Menor Valor

public class MaiorMenor {
    public static void main(String[] args) {
        int[] numeros = {5, 3, 8, 2, 7, 1, 4};
        int maior = numeros[0];
        int menor = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }
        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);
    }
}
*/

import java.util.Scanner;

class Arrays {
    public static void main(String[] args) {
        int opcao = 0;
        Scanner entrada = new Scanner(System.in);

        while (opcao != 4) {
            menu();
            opcao = entrada.nextInt();

            switch(opcao){
                case 1:
                    int notas[] = {90, 85, 78, 92, 88};
                    for (int i = 0; i < notas.length; i++) {
                        System.out.println("Nota do estudante " + (i+1) + ": " + notas[i]);
                    }
                    break;
                case 2:
                    int[] valores = {10, 20, 30, 40, 50};
                        int soma = 0;
                        for (int i = 0; i < valores.length; i++) {
                            soma += valores[i];
                        }
                        double media = soma / (double) valores.length;
                        System.out.println("A média é: " + media);
                    break;
                case 3:
                    int[] numeros = {5, 3, 8, 2, 7, 1, 4};
                    int maior = numeros[0];
                    int menor = numeros[0];
                    for (int i = 1; i < numeros.length; i++) {
                        if (numeros[i] > maior) {
                            maior = numeros[i];
                        }
                        if (numeros[i] < menor) {
                            menor = numeros[i];
                        }
                    }
                    System.out.println("Maior valor: " + maior);
                    System.out.println("Menor valor: " + menor);
                    break;
                default:
                    break;
            }
        }
        entrada.close();
    }

    public static void menu() {
        System.out.println("1. Armazenar notas de estudantes");
        System.out.println("2. Calcular média de valores");
        System.out.println("3. Encontrar o maior e o menor valor");
        System.out.println("4. Sair");
        
        System.out.println();

        System.out.print("Digite aqui a sua opção: ");
    }
}