package ArrayList_ex03;

public class Main {
	
	public static void main(String[] args) {
		GerenciadorDeTarefas gerenciadorDeTarefas = new GerenciadorDeTarefas();
		
		Tarefa t1 = new Tarefa("Levar o lixo", 1, "Pendente");
		Tarefa t2 = new Tarefa("Estudar", 3, "Em progresso");
		Tarefa t3 = new Tarefa("Fazer meus trabalhos", 3, "Concluída");
		
		gerenciadorDeTarefas.adicionarTarefa(t1);
		gerenciadorDeTarefas.adicionarTarefa(t2);
		gerenciadorDeTarefas.adicionarTarefa(t3);
		
		System.out.println("Tarefas: ");
		gerenciadorDeTarefas.listarTarefas();
		
		gerenciadorDeTarefas.removerTarefa(t3);
		System.out.println();
		System.out.println("Após remover a t3");
		gerenciadorDeTarefas.listarTarefas();
		
		System.out.println();
		System.out.println("Buscando pelo status ''Em progresso'' " );
		
		gerenciadorDeTarefas.buscarTarefas("Em progresso");
		
		gerenciadorDeTarefas.buscarTarefas("Não");
	}

}
