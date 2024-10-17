package Ex1;

public class Livro {

    public String titulo;
    public String autor;
    public Integer numeroPaginas;
    public Integer paginaPercorrida;
    private boolean livroAberto;

    public Livro(String titulo, String autor, int numPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numPaginas;
    }

    public void lerPagina(int pagina)
    {
        this.paginaPercorrida = pagina;
    }

    public void abrirLivro() {
        this.livroAberto = true;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", numeroPaginas=" + numeroPaginas +
                "}";
    }
}



