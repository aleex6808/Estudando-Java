package academy.devdojo.javaoneforall.introduction;

public class Class02PrimitiveTypes {
    public static void main(String[] args) {
        //int, double, char, byte, short, long, boolean
        int idade = 10;
        long numeroGrande = (long) 155.23;
        double salarioDouble =  2000.0D;
        float salarioFloat = (float) 2500.0D;
        byte idadeByte = 127;
        short idadeShort = 32000;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = '\u0041';

        String nome = "Goku";
        System.out.println("A idade é: " + idade + " anos");
        System.out.println(falso);
        System.out.println("char: " + caractere);
        System.out.println(numeroGrande);
        System.out.println("Oi meu nome é: " + nome);
    }
}
