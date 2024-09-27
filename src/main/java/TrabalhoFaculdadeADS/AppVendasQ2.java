package TrabalhoFaculdadeADS;
import java.util.Scanner;

public class AppVendasQ2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String sabor, tamanho, outroPedido = "";
        float soma = 0, bap = 16, bam = 18, bag = 22, ffp = 15, ffm = 17, ffg = 21;
        
        // Exibe o cardápio
        System.out.println("----- Bem vindos a loja de marmitas do Alexander de Almeida Fortuna -----");
        System.out.println("-------------------------------- Cardápio -------------------------------");
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("---|    Tamanho   |   Bife Acebolado(BA)   |   Fíle de Frango(FF)    |---");
        System.out.println("---|       P      |         R$16.00        |       R$ 15.00          |---");
        System.out.println("---|       M      |         R$18.00        |       R$ 17.00          |---");
        System.out.println("---|       G      |         R$22.00        |       R$ 21.00          |---");
        System.out.println("-------------------------------------------------------------------------");
        
        // Início do laço para novos pedidos
        while(!outroPedido.equalsIgnoreCase("N")) {
            System.out.print("Entre com o sabor desejado (BA/FF): ");
            sabor = entrada.next();
            entrada.nextLine();
            
            // Validação do sabor
            while(!sabor.equalsIgnoreCase("BA") && !sabor.equalsIgnoreCase("FF")) {
                System.out.println("Sabor inválido. Tente novamente: ");
                System.out.print("\nEntre com o sabor desejado (BA/FF): ");
                sabor = entrada.next();
                entrada.nextLine();
            }
            
            System.out.print("Entre com o tamanho desejado (P/M/G): ");
            tamanho = entrada.next();
            entrada.nextLine();
            
            // Validação do tamanho
            if(!tamanho.equalsIgnoreCase("P") && !tamanho.equalsIgnoreCase("M") && !tamanho.equalsIgnoreCase("G")) {
                System.out.println("Tamanho inválido. Tente novamente.");
                continue;  // Pula a iteração atual e solicita o sabor novamente
            }
            
            // Exibe o pedido atual
            if(sabor.equalsIgnoreCase("BA")) {
                System.out.print("Você pediu um Bife Acebolado ");
            } else {
                System.out.print("Você pediu um Filé de Frango ");
            }
            
            if(tamanho.equalsIgnoreCase("P")) {
                System.out.print("no tamanho P: ");
            } else if(tamanho.equalsIgnoreCase("M")) {
                System.out.print("no tamanho M: ");
            } else {
                System.out.print("no tamanho G: ");
            }
            
            // Adiciona o preço ao total com base no sabor e tamanho
            if(sabor.equalsIgnoreCase("BA") && tamanho.equalsIgnoreCase("P")) {
                System.out.print("R$ 16.00");
                soma = soma + bap;
            } else if(sabor.equalsIgnoreCase("BA") && tamanho.equalsIgnoreCase("M")) {
                System.out.print("R$ 18.00");
                soma = soma + bam;
            } else if(sabor.equalsIgnoreCase("BA") && tamanho.equalsIgnoreCase("G")) {
                System.out.print("R$ 22.00");
                soma = soma + bag;
            } else if(sabor.equalsIgnoreCase("FF") && tamanho.equalsIgnoreCase("P")) {
                System.out.print("R$ 15.00");
                soma = soma + ffp;
            } else if(sabor.equalsIgnoreCase("FF") && tamanho.equalsIgnoreCase("M")) {
                System.out.print("R$ 17.00");
                soma = soma + ffm;
            } else if(sabor.equalsIgnoreCase("FF") && tamanho.equalsIgnoreCase("G")) {
                System.out.print("R$ 21.00");
                soma = soma + ffg;
            }
        
            System.out.println("\nDeseja pedir mais alguma coisa? (S/N)");
            outroPedido = entrada.nextLine();
            
            // Finaliza o laço se a resposta for "N"
            if(outroPedido.equalsIgnoreCase("N")) {
                break;  // Sai do laço
            }
        }
        
        // Exibe o valor total a ser pago
        System.out.println("Valor total a ser pago: R$" + soma);
    }
}
