package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasdeRepeticao04 {
    public static void main(String[] args) {
        // Dado o valor de um carro descubra em quantas vezes ele pode ser parcelado
        // condição: valor parcela >= 1000

        double valorCarro = 30000;

        for (int parcela = 0; parcela < valorCarro ; parcela++) {
            double valorParcela = valorCarro / parcela;
            if (valorParcela >= 1000) {
                System.out.println("Parcela " + parcela + "R$ " + valorParcela);
            } else {
                break;
            }
            System.out.println("Fora do if, mas dentro do for " +
                   parcela);
        }
    }
}
