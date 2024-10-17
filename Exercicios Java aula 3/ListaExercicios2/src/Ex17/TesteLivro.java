package Ex17;

public class TesteLivro {
    public static void main(String[] args) {
        Livro livro = new Livro("As longas tranças de um careca", "Careca", "750mb");

        System.out.println("Título: " + livro.getTitulo());
        System.out.println("Autor: " + livro.getAutor());
        System.out.println("Tamanho Arquivo: " + livro.getTamanhoArquivo());

        livro.abrir();
        livro.fechar();
    }
}
