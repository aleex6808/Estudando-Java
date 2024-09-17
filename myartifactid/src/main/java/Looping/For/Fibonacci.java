/* Exercício 3: Imprimir uma sequência de Fibonacci.

Solicite ao usuário um número n e imprima os primeiros n números da sequência de Fibonacci. */

import java.util.Scanner;

public class Fibonacci{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número de termos na sequência de Fibonacci: ");
        int n = scanner.nextInt();

        int a = 0, b = 1;
        System.out.print("Sequência de Fibonacci: " + a + " " + b);

        for (int i = 3; i <= n; i++) {
            int c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }

        System.out.println();
        scanner.close();
    }
}

/* import java.util.Scanner;

public class ExercicioFor3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número de termos na sequência de Fibonacci: ");
        int n = scanner.nextInt();

        int a = 0, b = 1;
        System.out.print("Sequência de Fibonacci: " + a + " " + b);

        for (int i = 3; i <= n; i++) {
            int c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }

        System.out.println();
        scanner.close();
    }
}
 */
