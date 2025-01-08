public class Filme {
    private String titulo;
    private String genero;
    private int ano;
    private String descricao;

    // Construtor
    public Filme(String titulo, String genero, int ano, String descricao) {
        this.titulo = titulo;
        this.genero = genero;
        this.ano = ano;
        this.descricao = descricao;
    }

    // Getters e Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Título: " + titulo + "\n" +
                "Gênero: " + genero + "\n" +
                "Ano: " + ano + "\n" +
                "Descrição: " + descricao + "\n";
    }
}