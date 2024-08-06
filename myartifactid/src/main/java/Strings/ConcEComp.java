/*
Exercício 01: 

Crie duas strings e concatene-as. Em seguida, exiba o comprimento da string resultante.
*/

class ConcEComp {
  public static void main(String[] args) {
    String palavra1 = "Bom dia,";
    String palavra2 = "Flor do dia!";
    String palavra3 = palavra1.concat(" ").concat(palavra2);
    
    System.out.print("\nString concatenada: " + palavra3);
    System.out.print("\nComprimento da String: " + palavra3.length());
  }
}