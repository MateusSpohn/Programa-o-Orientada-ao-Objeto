package Ex12;

public class TesteFilme {
    public static void main(String[] args) {
        Filme meufilme = new Filme("Exterminador do Futuro", "Michael Jackson", "2:20");

        System.out.println("Título: " + meufilme.getTitulo());
        System.out.println("Diretor: " + meufilme.getDiretor());
        System.out.println("Duração: " + meufilme.getDuracao());

        meufilme.iniciar();
        meufilme.parar();
    }
}
