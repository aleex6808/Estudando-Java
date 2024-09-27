package Exercicios.ex005;

public class Main {
	public static void main(String[] args) {
		// Cria a agenda
        Agenda agenda = new Agenda();

        // Adiciona alguns contatos
        Contato contato1 = new Contato("Alice", "123456789");
        Contato contato2 = new Contato("Bob", "987654321");
        Contato contato3 = new Contato("Carlos", "555666777");

        agenda.addContato(contato1);
        agenda.addContato(contato2);
        agenda.addContato(contato3);

        // Lista todos os contatos
        System.out.println("Lista de contatos:");
        agenda.listarContatos();

        // Busca um contato
        System.out.println("\nBuscando contato 'Bob':");
        agenda.buscarContato("Bob");

        // Remove um contato e lista novamente
        System.out.println("\nRemovendo 'Alice' e listando novamente:");
        agenda.delContato("Alice");
        agenda.listarContatos();

        // Testa busca de um contato que não existe
        System.out.println("\nBuscando contato inexistente 'Alice':");
        agenda.buscarContato("Alice");
    }
}