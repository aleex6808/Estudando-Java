package POO.Exercicios.Exercicio03;

public class Moto extends Veiculo {
	private boolean temCarroLateral;

	public boolean isTemCarroLateral() {
		return temCarroLateral;
	}

	public void setTemCarroLateral(boolean temCarroLateral) {
		this.temCarroLateral = temCarroLateral;
	}

	@Override
	public String exibirDetalhes() {
		return super.exibirDetalhes() + 
				"\n CarroLateral: " + this.isTemCarroLateral() + 
				"\n ---------------------";
	}

}
