package praticando01;

import java.util.Scanner;

public class ContaBancaria {
	private String numeroConta;
	private double saldo;
	private String titular;
	Scanner entrada = new Scanner(System.in);
	
	
	public ContaBancaria() {
		this.numeroConta = "";
		this.saldo = 0;
		this.titular = "";
	}
	
	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}
	
	public String getNumeroConta() {
		return numeroConta;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setTitular(String titular) {
		this.titular = titular; 
	}
	
	public String getTitular() {
		return titular;
	}
	
	public void depositar() {
		System.out.print("Digite o valor do depósito: ");
		double deposito = entrada.nextDouble();
		entrada.nextLine();
		
		if(deposito >= 0) {
			setSaldo(getSaldo() + deposito);
		} else {
			System.out.println("Valor inválido!");
		}
	}
	
	public void sacar() {
		System.out.print("Digite o valor que deseja sacar: ");
		double saque = entrada.nextDouble();
		entrada.nextLine();
		
		if(saque >= 0 && saque <= getSaldo()) {
			setSaldo(getSaldo() - saque);
		} else {
			System.out.println("Valor de saque inválido ou saldo insuficiente!");
		}
	}
	
}
