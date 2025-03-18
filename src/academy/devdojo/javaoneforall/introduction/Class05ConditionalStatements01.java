package academy.devdojo.javaoneforall.introduction;

public class Class05ConditionalStatements01 {
    public static void main(String[] args) {
        int idade = 15;
        boolean isAutorizadoComprarBebida = idade >= 18;
        // !

        if (isAutorizadoComprarBebida != false) {
            System.out.println("Autorizado a comprar bebida alcólica");
        } else {
            System.out.println("Não autorizado a comprar bebida alcólica");
        }

        boolean c = false;
        if (c == true) {
            System.out.println("Dentro de algo que nunca deve ser feito");
        }
        System.out.println("Fora do if");
    }

    public static class Class05ConditionalStatement01 {
        public static void main(String[] args) {
            // Imprima todos os números pares de 0 até 1000000

            for (int i = 0; i <= 1000000; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        }
    }
}
