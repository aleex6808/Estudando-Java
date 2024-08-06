
package aula05;

import java.util.Scanner;
import java.io.IOException;
import java.util.ArrayList;

public class Banco {
	Scanner entrada = new Scanner(System.in);
	ArrayList<ContaBanco> contas = new ArrayList<>();
	public static void main(String[] args) {
		
		Banco banco = new Banco();
		banco.executar();
		
	}
	
	public void executar(){
		 int opcao;
		do {
			 clearScreen();
			 menu();
			 opcao = entrada.nextInt();
			 switch(opcao) {
				case 1:
					abrirConta();
					break;
				case 2:
					depositar();
					break;
				case 3:
					sacar();
					break;
				case 4:
					fecharConta();
					break;
				case 5:
					verConta();
					break;
				case 6:
					System.out.println(" --Fim do programa--");
					break;
				default:
					System.out.println(" Opção inválida");
					break;
			 }
		
		 } while (opcao != 6);
	 }
	
	public void menu() {
		ContaBanco conta = new ContaBanco();
		conta.menu();
	}
	
	public void abrirConta() {
		ContaBanco conta = new ContaBanco();
		conta.abrirConta();
		contas.add(conta);
		System.out.println("Conta criada com sucesso!");
		pause(2);
	}
	
	public void depositar() {
		ContaBanco conta = selecionarConta();
		if (conta != null) {
			conta.depositar();
			pause(2);
		}
	}
	
	public void sacar() {
		ContaBanco conta = selecionarConta();
			if(conta != null) {
				conta.sacar();
				pause(2);
			}
		}
	
	public void verConta() {
		ContaBanco conta = selecionarConta();
			if(conta != null) {
				conta.verConta();
				pause(5);
			}
	}
	
	public void fecharConta() {
		ContaBanco conta =  selecionarConta();
		if(conta != null) {
			conta.fecharConta();
			pause(2);
		}
	}
	
	public void pagarMensal() {
		ContaBanco conta = selecionarConta();
		if(conta != null){
			conta.pagarMensal();
			pause(2);
		}
	}
	
	
	public ContaBanco selecionarConta() {
		System.out.println("Digite o número da conta: ");
		int numConta = entrada.nextInt();
		for (ContaBanco conta : contas) {
			if (conta.getNumconta() == numConta) {
				return conta;
			}
		}
		System.out.println("Conta não encontrada.");
		pause(2);
		return null;
	}
	
	public static void clearScreen() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        } catch (IOException | InterruptedException ex) {
            ex.printStackTrace();
        }
    }  
	
	public void pause(int seconds) {
	    try {
	        Thread.sleep(seconds * 1000);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
	}
	
}


