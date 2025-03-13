package academy.devdojo.maratonajava.introducao;
//Dado um determinado salario anual qual o valor de taxa que terá que ser pago?

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        double salarioAnual = 70000;
        double taxaAnual;
        String mensagem;
        if (salarioAnual >= 0 && salarioAnual <= 34712) {
            taxaAnual =  salarioAnual * (9.70 / 100);
            mensagem = "Com o salário de €" + salarioAnual + " você terá que pagar €" + taxaAnual + " de taxa :)";
        } else if (salarioAnual > 34713 && salarioAnual <= 68507) {
            taxaAnual = salarioAnual * (37.35 / 100);
            mensagem = "Com o salário de €" + salarioAnual + " você terá que pagar €" + taxaAnual + " de taxa :)";
        } else {
            taxaAnual = salarioAnual * (49.50 / 100);
            mensagem = "Com o salário de €" + salarioAnual + " você terá que pagar €" + taxaAnual + " de taxa :)";
        }
        System.out.println(mensagem);
    }


}
