package Exercicios.ex003;

public class Main {
    public static void main(String[] args) {
        // Instancia a classe estoque
        Estoque estoque = new Estoque();
        
        // Cria alguns objetos 'Produto' 
        Produto produto1 = new Produto("Item 1", 10); // Nome e quantidade
        Produto produto2 = new Produto("Item 2", 5);
        Produto produto3 = new Produto("Item 3", 20);

        // Adiciona os objetos ao mapa com códigos genéricos (ex: 001, 002, 003)
        estoque.adicionarProduto("001", produto1);
        estoque.adicionarProduto("002", produto2);
        estoque.adicionarProduto("003", produto3);
        
        // Listar todos os objetos
        System.out.println("Listando todos os itens:");
        estoque.listarProdutos();

        // Consultar um objeto específico
        System.out.println("\nConsultando item com código 002:");
        Produto itemBuscado = estoque.buscarProduto("002");
        if (itemBuscado != null) {
            System.out.println("Item encontrado: " + itemBuscado);
        } else {
            System.out.println("Item não encontrado.");
        }

        // Remover um item e listar novamente
        System.out.println("\nRemovendo item com código 001 e listando novamente:");
        estoque.removerProduto("001");
        estoque.listarProdutos();
        
        // Testar consulta de um item que não existe
        System.out.println("\nConsultando item inexistente (código 004):");
        Produto itemInexistente = estoque.buscarProduto("004");
        if (itemInexistente != null) {
            System.out.println("Item encontrado: " + itemInexistente);
        } else {
            System.out.println("Item não encontrado.");
        }
    }
}
