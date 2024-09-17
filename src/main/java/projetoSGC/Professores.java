package projetoSGC;

import java.util.ArrayList;
import java.util.Scanner;

public class Professores {
	private ArrayList<Professor> professores;
	Scanner entrada = new Scanner(System.in);

	public Professores() {
		this.professores = new ArrayList<Professor>();
	}

	public void adicionarProfessor(Professor professor) {
		professores.add(professor);
	}

	public void removerProfessor() {

		if (professores.size() > 0) {
			System.out.println("Lista de professores: ");
			listarProfessores();
			System.out.println("Digite o nome do professor que desweja remover: ");
			String nomeRemover = entrada.nextLine();

			boolean encontrado = false;
			Professor professorParaRemover = null;
			for (Professor professor : professores) {
				if (professor.getNome().equalsIgnoreCase(nomeRemover)) {
					professorParaRemover = professor;
					encontrado = true;
					break;
				}
			}

			if (encontrado) {
				professores.remove(professorParaRemover);
				System.out.println("Professor removido com sucesso");
			} else {
				System.out.println("Professor não encontrado.");
			}
		} else {
			System.out.println("Nenhum professor cadastrado.");
		}

	}

	public void listarProfessores() {
		if (professores.size() > 0) {
			for (Professor professor : professores) {
				System.out.println(professor);
			}
		}
	}

	public void buscarProfessores() {
		System.out.println("Digite a especialização do professor que deseja buscar: ");
		String especializacao = entrada.nextLine();
		
		boolean encontrado = false;
		for (Professor professor : professores) {
			if (professor.getEspecializacao().equalsIgnoreCase(especializacao)) {
				System.out.println(professor);
				encontrado = true;
			}
		}
		
		if (!encontrado) {
			System.out.println("Professor não encontrado.");
		}

	}
}
