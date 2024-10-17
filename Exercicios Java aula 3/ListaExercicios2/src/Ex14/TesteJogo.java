package Ex14;

public class TesteJogo {
    public static void main(String[] args) {
        Jogo meujogo = new Jogo("Minecraft", "Sandbox", 120);

        System.out.println("Nome do jogo: " + meujogo.getNome());
        System.out.println("Gênero do jogo: " + meujogo.getGenero());
        System.out.println("Preço do jogo: " + meujogo.getPreco());

        meujogo.iniciar();
        meujogo.pausar();
    }
}
