/*
Exercícios

Concatenação e Comprimento
Crie duas strings e concatene-as. Em seguida, exiba o comprimento da string resultante.

Busca e Substring
Crie uma string e peça ao usuário para digitar uma palavra. Verifique se a palavra está presente na string. Se estiver, exiba a posição inicial da palavra e uma substring começando dessa posição até o final da string.

Comparação de Strings
Peça ao usuário para digitar duas strings e compare-as usando equals e compareTo. Exiba os resultados.

Substituição e Split
Crie uma string com várias palavras separadas por espaços. Substitua todos os espaços por vírgulas e divida a string em um array de palavras usando o método split.
*/
        
package Strings;

class ManipulacaoDeStrings {
    public static void main(String[] args) {
        
        // Criação de strings
        String frase = "A programação em Java é poderosa.";
        System.out.println("Frase original: " + frase);

        // Concatenação
        String adicionaTexto = frase.concat(" Você pode fazer muitas coisas!");
        System.out.println("Após concatenação: " + adicionaTexto);

        // Comprimento da string
        System.out.println("Comprimento da frase: " + adicionaTexto.length());

        // Acesso a caracteres
        System.out.println("Caractere na posição 5: " + adicionaTexto.charAt(5));

        // Substring
        System.out.println("Substring (11, 14): " + adicionaTexto.substring(11, 14));

        // Comparação
        String outraFrase = "A programação em Java é poderosa.";
        System.out.println("Frases são iguais? " + frase.equals(outraFrase));

        // Busca em strings
        System.out.println("Posição de 'Java': " + adicionaTexto.indexOf("Java"));
        System.out.println("Última posição de 'a': " + adicionaTexto.lastIndexOf('a'));

        // Substituição
        String novaFrase = adicionaTexto.replace("Java", "Python");
        System.out.println("Após substituição: " + novaFrase);
    }
}
