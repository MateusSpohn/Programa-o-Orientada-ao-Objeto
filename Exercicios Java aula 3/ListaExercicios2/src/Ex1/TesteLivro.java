package Ex1;

public class TesteLivro {

    public static void main(String[] args) {
        Livro livro = new Livro("Harry Potter e a Pedra Filosofal", "J. K. Rowling", 264);
        Livro livro2 = new Livro("O Senhor dos Anéis", "J. R. R. Tolkien", 1568);

        System.out.println(livro.toString());
        System.out.println(livro2.toString());
    }

}

