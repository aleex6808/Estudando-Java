package TrabalhoFaculdadeADS;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class AppvendasQ4 {

    // Scanner para entrada de dados
    static Scanner entrada = new Scanner(System.in);
    
    // Lista de dicionários para armazenar funcionários
    static ArrayList<HashMap<String, Object>> lista_funcionarios = new ArrayList<HashMap<String, Object>>();
    
    // Variáveis globais
    static int id_global = 4854698, opcao = 0;

    public static void main(String[] args) {
        int menu = 0;
        System.out.println("Bem vindos a empresa de Alexander de Almeida Fortuna");

        // Loop principal do menu
        while (menu != 4) {
            System.out.println("\nMENU");
            System.out.println("1 - Cadastrar Funcionário");
            System.out.println("2 - Consultar Funcionário");
            System.out.println("3 - Remover Funcionário");
            System.out.println("4 - Encerrar Programa");
            System.out.print("Digite aqui: ");
            menu = entrada.nextInt();
            entrada.nextLine(); // Consumir a quebra de linha pendente

            switch (menu) {
                case 1:
                    cadastrarFuncionario(id_global);
                    id_global++;
                    break;
                case 2:
                    consultar_funcionarios();
                    break;
                case 3:
                    remover_funcionario();
                    break;
                case 4:
                    System.out.println("\nFim do programa.");
                    break;
                default:
                    System.out.println("\nOpção inválida.");
                    break;
            }
        }
    }

    // Método para cadastrar um novo funcionário
    public static void cadastrarFuncionario(int id) {
        HashMap<String, Object> funcionario = new HashMap<String, Object>();

        System.out.print("Digite o nome do funcionário: ");
        String nome = entrada.nextLine();

        System.out.print("\nDigite o setor do funcionário: ");
        String setor = entrada.nextLine();

        System.out.print("\nInforme o salário do funcionário: ");
        float salario = entrada.nextFloat();
        entrada.nextLine();

        // Adiciona os dados do funcionário ao dicionário
        funcionario.put("ID", id_global);
        funcionario.put("Nome", nome);
        funcionario.put("Setor", setor);
        funcionario.put("Salário", salario);

        // Adiciona o dicionário à lista de funcionários
        lista_funcionarios.add(funcionario);
    }

    // Método para consultar funcionários
    public static void consultar_funcionarios() {
        boolean funcionarioEncontrado = false;
        opcao = 0;

        while (opcao != 4) {
            System.out.println("\nO que deseja?");
            System.out.println("1 - Consultar todos.");
            System.out.println("2 - Consultar por ID.");
            System.out.println("3 - Consultar por Setor.");
            System.out.println("4 - Retornar ao menu.");
            System.out.print(">> ");
            opcao = entrada.nextInt();

            if (opcao == 1) {
                funcionarioEncontrado = false;
                System.out.println("\nLista de Funcionários:");

                // Itera sobre a lista de funcionários e exibe os dados
                for (HashMap<String, Object> funcionario : lista_funcionarios) {
                    int id = (Integer) funcionario.get("ID");
                    String nome = (String) funcionario.get("Nome");
                    String setor = (String) funcionario.get("Setor");
                    float salario = (Float) funcionario.get("Salário");

                    System.out.println("ID: " + id);
                    System.out.println("Nome: " + nome);
                    System.out.println("Setor: " + setor);
                    System.out.printf("Salário: R$%.2f\n", salario);
                    System.out.println("--------------------");

                    funcionarioEncontrado = true;
                }

                if (!funcionarioEncontrado) {
                    System.out.println("Sem funcionários cadastrados.");
                }

            } else if (opcao == 2) {
                funcionarioEncontrado = false;
                System.out.print("Informe o ID: ");
                int id = entrada.nextInt();
                entrada.nextLine();

                // Itera sobre a lista de funcionários e exibe o funcionário com o ID especificado
                for (HashMap<String, Object> funcionario : lista_funcionarios) {
                    if (funcionario.get("ID").equals(id)) {
                        id = (Integer) funcionario.get("ID");
                        String nome = (String) funcionario.get("Nome");
                        String setor = (String) funcionario.get("Setor");
                        float salario = (Float) funcionario.get("Salário");

                        System.out.println("ID: " + id);
                        System.out.println("Nome: " + nome);
                        System.out.println("Setor: " + setor);
                        System.out.printf("Salário: R$%.2f\n", salario);
                        System.out.println("--------------------");

                        funcionarioEncontrado = true;
                    }
                }

                if (!funcionarioEncontrado) {
                    System.out.println("Funcionários com id " + id + " não encontrados na lista.");
                }

            } else if (opcao == 3) {
                funcionarioEncontrado = false;
                System.out.print("Informe o Setor: ");
                String setor = entrada.nextLine();
                setor = entrada.nextLine();

                // Itera sobre a lista de funcionários e exibe os funcionários do setor especificado
                for (HashMap<String, Object> funcionario : lista_funcionarios) {
                    if (setor != null && funcionario.get("Setor").equals(setor)) {
                        int id = (Integer) funcionario.get("ID");
                        String nome = (String) funcionario.get("Nome");
                        setor = (String) funcionario.get("Setor");
                        float salario = (Float) funcionario.get("Salário");

                        System.out.println("ID: " + id);
                        System.out.println("Nome: " + nome);
                        System.out.println("Setor: " + setor);
                        System.out.printf("Salário: R$%.2f\n", salario);
                        System.out.println("----------------------");

                        funcionarioEncontrado = true;
                    }
                }

                if (!funcionarioEncontrado) {
                    System.out.println("Funcionários do setor " + setor + " não encontrados na lista.");
                }

            } else if (opcao == 4) {
                // Retorna ao menu principal
            } else {
                System.out.println("Opção inválida.");
            }
        }
    }

    // Método para remover um funcionário pelo ID
    public static void remover_funcionario() {
        System.out.print("Digite o ID do funcionário a ser removido: ");
        int id = entrada.nextInt();
        entrada.nextLine();

        // Utiliza um iterator para remover o funcionário de forma segura
        Iterator<HashMap<String, Object>> iterator = lista_funcionarios.iterator();

        while (iterator.hasNext()) {
            HashMap<String, Object> funcionario = iterator.next();
            int idFuncionario = (Integer) funcionario.get("ID");
            if (idFuncionario == id) {
                iterator.remove();
                System.out.println("Funcionário com ID " + id + " removido com sucesso.");
                return;
            }
        }
        System.out.println("ID inválido ou funcionário não encontrado.");
    }
}
