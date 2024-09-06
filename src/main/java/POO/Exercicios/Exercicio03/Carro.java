package POO.Exercicios.Exercicio03;

public class Carro extends Veiculo {
	private int numeroPortas;

	public int getNumeroPortas() {
		return numeroPortas;
	}

	public void setNumeroPortas(int numeroPortas) {
		this.numeroPortas = numeroPortas;
	}

	@Override
	public String exibirDetalhes() {
		return super.exibirDetalhes() + 
				"\n NumeroPortas=" + this.getNumeroPortas() + 
				"\n ----------------------";
	}

	
	

}
