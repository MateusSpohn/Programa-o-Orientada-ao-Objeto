package Ex13;

public class TesteTime {
    public static void main(String[] args) {
        Time meutime = new Time("Ibis Sport Club", "João", 24);

        System.out.println("Nome do time: " + meutime.getNome());
        System.out.println("Técnico do time: " + meutime.getTecnico());
        System.out.println("Número de Jogadores: " + meutime.getNumJogadores());

        meutime.remove();
        meutime.adicionar();
    }
}
