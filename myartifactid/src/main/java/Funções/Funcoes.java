/* Como funcionam funções em java:
Em Java, funções são conhecidas como métodos. Um método é um bloco de código que realiza uma tarefa específica. Métodos ajudam a organizar e reutilizar o código, tornando-o mais modular e legível.

Estrutura de um método:

A estrutura básica de um método em Java é o seguinte

public static returnType
methodName(parameters) {
    // Corpo do método 
}

1.Modificadores de Acesso: Define quem pode acessar o método ( public, private, protected )
2.Modificador static: Se presente, o método pode ser chamado sem criar uma instância da classe.
3.Tipo de retorno: O tipo de dado que o método retorna (void se não retornar nada).
4.Nome do método: Nome do método.
5.Parâmetros: Valores que o método recebe. Podem ser múltiplos, separados por vírgulas.

Exemplos de métodos:

Aqui estão alguns exemplos de métodos em Java:
*/

package Funções;

class Funcoes {
    public static void main(String[] args) {
        System.out.println("Função");
        sayHello();
        String greeting = greet("Alex");
        System.out.println(greeting);
        int soma = add(5, 10);
        System.out.println("Soma: " + soma);
    }

    // Método que retorna um inteiro e recebe dois parâmetros inteiros
    public static int add(int a, int b) {
        return a + b;
    }

    // Método que não retorna nada e não recebe parâmetros
    public static void sayHello() {
        System.out.println("Hello");
    }

    // Metódo que retorna uma string e recebe um parâmetro string

    public static String greet(String name) {
        return "Hello, " + name + "!";
    }

}