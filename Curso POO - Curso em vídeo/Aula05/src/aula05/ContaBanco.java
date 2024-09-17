package aula05;

import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class ContaBanco {
	
	 public Scanner entrada = new Scanner(System.in);
	 private ArrayList<ContaBanco> contas = new ArrayList<>();
	 
	 public int numconta;
	 protected String tipo; 
	 private String dono;
	 private float saldo;
	 private boolean status;
	 
	 public Random rand = new Random();
	 public int upperbound = 10;
	 
	 public ContaBanco() {
		status = false;
		saldo = 0;
	}
	 
	 
	 public void menu() {
		System.out.println(" Menu:");
		System.out.println(" 1 - Abrir conta ");
		System.out.println(" 2 - Depositar ");
		System.out.println(" 3 - Sacar ");
		System.out.println(" 4 - Fechar conta ");
		System.out.println(" 5 - Ver conta");
		System.out.println(" 6 - Sair");
		System.out.print(" Digite aqui: ");
		}
	 
	 
	 public void abrirConta() {
		 
		 // Solicita o nome do dono..
		 System.out.print("Digite o nome do dono: ");
		 dono = entrada.nextLine();
		 setDono(dono);
		 
		// Solicita o tipo da conta..
		 System.out.println("Informe o tipo da conta sendo CC para Conta Corrente e CP para Conta Poupança: ");
		 setTipo(entrada.nextLine());
		 
		 // Se o tipo da conta não for corrente nem poupança informa que o tipo é inválido..
		 if (tipo.equalsIgnoreCase("CC") || tipo.equalsIgnoreCase("CP")) {
		 setTipo(tipo);
		 setStatus(true);
	} else {
		 System.out.println("Tipo inválido!!");
	}
		 
		 // Se o tipo for CC recebe 50 e se for CP 150..
		 if(tipo.equalsIgnoreCase("CC")) {
			 saldo = 50;
			 
		 } else {
			 saldo = 150;
		 }
		 
		 do {
		 setNumconta(rand.nextInt(upperbound)); //Gera um número aleatório e o atribui para a variável numconta
		 }while (getNumconta() == 0);	 
		 System.out.println("Número da conta: " + this.getNumconta());
	 }
	 
	 
	 public void fecharConta() {
		if(saldo > 0 || status == false) {
			System.out.println("Para fechar a conta é necessário estar com saldo vazio e com uma conta aberta.");
		} else if(saldo < 0 || status == false) {
			System.out.println("Para fechar a conta é necessário estar adimplente e com uma conta aberta.");
		} else {
			setStatus(false);
			System.out.println("Conta fechada com sucesso.");
		}
	}
	 
	 
	 public void depositar() {
		 if(status == false) {
			 System.out.println("Necessário conta aberta.");
		 } else {
			 System.out.println("Escolha a quantia que deseja depositar: ");
			 float deposito = entrada.nextFloat();
			 setSaldo(saldo + deposito);
			 System.out.println("Depósito realizado com sucesso.");
		}
	 }
	 
	 
	 public void sacar(){
		 if(status == false) {
			 System.out.println("Necessário conta aberta.");
		 } else {
			 System.out.println("Digite a quantia que deseja sacar");
			 float saque = entrada.nextFloat();
			 
			 	if (saque > saldo) {
			 		System.out.println("Saldo indisponível para essa transação");
			 	} else {
			 		setSaldo(saldo - saque);
			 		System.out.println("Saque realizado com sucesso.");
			 	}
		 }
			 
	 }
	 
	 
	 public void pagarMensal() {
		if(this.tipo.equalsIgnoreCase("cc")) {
			setSaldo(saldo - 12);
		} else {
			setSaldo(saldo - 20);
		}
	}
	 
	 
	 public void verConta() {
		 if(!status) {
			 System.out.println("Conta não encontrada.");
		 } else {
		 System.out.println("Digite o número da conta: ");
		 System.out.println("Dados da conta: ");
		 System.out.println("Número da conta: " + this.getNumconta());
		 System.out.println("Tipo: " + this.getTipo());
		 System.out.println("Saldo: R$" + this.saldo);
		 System.out.println("Dono: " + this.dono);
		 System.out.println("Status: " + this.status);
		 }
	 }
	 
	 
	public int getNumconta() {
		return numconta;
	}
	
	
	public void setNumconta(int numconta) {
		this.numconta = numconta;
	}
	
	
	public String getTipo() {
		return tipo;
	}
	
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	public String getDono() {
		return dono;
	}
	
	
	public void setDono(String dono) {
		this.dono = dono;
	}
	
	
	public float getSaldo() {
		return saldo;
	}
	
	
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	
	public boolean isStatus() {
		return status;
	}
	
	
	public void setStatus(boolean status) {
		this.status = status;
	}
	 
}
