package aula07;

import java.util.Random;

public class Luta {
	private Lutador desafiado;
	private Lutador desafiante;
	private int rounds;
	private boolean aprovada;
	
	
	public Lutador getDesafiado() {
		return desafiado;
	}



	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}



	public Lutador getDesafiante() {
		return desafiante;
	}



	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}



	public int getRounds() {
		return rounds;
	}



	public void setRounds(int rounds) {
		this.rounds = rounds;
	}



	public boolean isAprovada() {
		return aprovada;
	}



	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}



	public void marcarLuta(Lutador l1, Lutador l2) {
		if(l1.getCategoria() .equalsIgnoreCase(l2.getCategoria())
				&& l1 != l2) {
			this.aprovada = true;
			this.desafiado = l1;
			this.desafiante = l2;
		} else {
			this.aprovada = false;
			this.desafiado = null;
			this.desafiante = null;
		}
	}
	 public void lutar() {
		 if (this.aprovada) {
			 System.out.println("--- Desafiado ---");
			 System.out.println(this.desafiado.Apresentar());
			 System.out.println("--- Desafiante ---");
			 System.out.println(this.desafiante.Apresentar());
			 
			 Random aleatorio = new Random();
			 int vencedor = aleatorio.nextInt(3);
			 System.out.println("====== RESULTADO DA LUTA ======");
			 switch(vencedor) {
			 case 0: // Empate
				 System.out.println("Empatou!");
				 this.desafiado.empatarLuta();
				 this.desafiante.empatarLuta();
				 break;
			 case 1: // Desafiado vence
				 System.out.println("Desafiado venceu a luta!");
				 System.out.println("Vitória " + this.desafiado.getNome());
				 this.desafiado.ganharLuta();
				 this.desafiante.perderLuta();
				 break;
			 case 2: // Desafiante vence
				 System.out.println("Desafiante venceu a luta!");
				 System.out.println("Vitória " + this.desafiante.getNome());
				 this.desafiante.ganharLuta();
				 this.desafiado.perderLuta();
				 break;
			 }
			 System.out.println("========================");
		 } else {
			 System.out.println("A luta não pode acontecer");
		 }
	 }
}
