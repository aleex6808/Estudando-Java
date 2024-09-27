/*
Substituição e Split
Crie uma string com várias palavras separadas por espaços. Substitua todos os espaços por vírgulas e divida a string em um array de palavras usando o método split.
*/

package Strings;

class SubsESplit {
  public static void main(String[] args){
    String palavra = "Hora de acordar e espalhar algumas blasfêmias.", novaString; //Criando a String
    

    novaString = palavra.replace(" " , ","); // Substituindo os espaços por vírgulas

    System.out.println("Nova String com vírgulas ao invés de espaços: " + "' " + novaString + " '"); // Imprime a nova String

    
    String[] palavra2 = novaString.split(","); // Dividindo a String no limite das vírgulas e armazenando em um array

    System.out.println("\nPalavra dividida: ");
    
    for (int i = 0; i < palavra2.length; i++) { 
      System.out.println("\n"+ palavra2[i]); // Imprime as palavras divididas para o usuário
    }
    
  }
}