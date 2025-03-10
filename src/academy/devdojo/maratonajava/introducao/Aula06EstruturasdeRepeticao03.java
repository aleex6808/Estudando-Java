package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasdeRepeticao03 {
    // Imprima os primeiros 25 números de um dado valor, por exemplo, 50
    public static void main(String[] args) {
        int i = 0;
        int num = 50;
        for (i = 0; i < num; i++) {
            if (i <= 25) {
                System.out.println(i);
            } else {
                break;
            }
        }
    }
}
