import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BancoDeDadosDeFilmes banco = new BancoDeDadosDeFilmes();

        int opcao;

        do {
            System.out.println("\n--- Banco de Dados de Filmes ---");
            System.out.println("1. Adicionar Filme");
            System.out.println("2. Lista Filmes");
            System.out.println("3. Buscar Filme por Título");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer de entrada

            switch (opcao) {
                case 1:
                    System.out.print("Digite o título do filme: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Digite o gênero do filme: ");
                    String genero = scanner.nextLine();
                    System.out.print("Digite o ano de lançamento: ");
                    int ano = scanner.nextInt();
                    scanner.nextLine(); // Limpar o buffer
                    System.out.print("Digite a descrição do filme: ");
                    String descricao = scanner.nextLine();

                    Filme filme = new Filme(titulo, genero, ano, descricao);
                    banco.adicionarFilme(filme);
                    System.out.println("Filme adicionado com sucesso!");
                    break;

                case 2:
                    System.out.println("\nLista de Filmes:");
                    banco.listarFilmes();
                    break;

                case 3:
                    System.out.print("Digite o título do filme que deseja buscar: ");
                    String tituloBusca = scanner.nextLine();
                    banco.buscarFilmePorTitulo(tituloBusca);
                    break;

                case 4:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 4);

        scanner.close();
    }
}