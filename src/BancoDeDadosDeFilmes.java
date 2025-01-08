import java.util.ArrayList;
import java.util.List;

public class BancoDeDadosDeFilmes {
    private List<Filme> filmes;

    // Construtor
    public BancoDeDadosDeFilmes() {
        this.filmes = new ArrayList<>();
    }

    // Adicionar um filme
    public void adicionarFilme(Filme filme) {
        filmes.add(filme);
    }

    // Listar todos os filmes
    public void listarFilmes() {
        if (filmes.isEmpty()) {
            System.out.println("Não há filmes cadastrados.");
        } else {
            for (Filme filme : filmes) {
                System.out.println(filme);
            }
        }
    }

    // Buscar filmes por título
    public void buscarFilmePorTitulo(String titulo) {
        boolean encontrado = false;
        for (Filme filme : filmes) {
            if (filme.getTitulo().equalsIgnoreCase(titulo)) {
                System.out.println(filme);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Filme não encontrado.");
        }
    }
}