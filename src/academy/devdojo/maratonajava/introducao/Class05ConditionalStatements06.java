package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        // Utilizando switch e Dado os valores de 1 a 7 imprima se é dia util ou final de semana
        // Considerando 1 como domingo
        byte dia = 7;

        switch (dia) {
            case 1:
                System.out.println("Final de semana");
                break;
            case 2:
                System.out.println("Dia útil");
                break;
            case 3:
                System.out.println("Dia útil");
                break;
            case 4:
                System.out.println("Dia útil");
                break;
            case 5:
                System.out.println("Dia útil");
                break;
            case 6:
                System.out.println("Dia útil");
                break;
            case 7:
                System.out.println("Final de semana");
                break;
        }
    }
}
