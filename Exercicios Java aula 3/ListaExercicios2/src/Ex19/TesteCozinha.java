package Ex19;

public class TesteCozinha {
    public static void main(String[] args) {
        Cozinha cozinha = new Cozinha("Rustica", 10, "Marrom");

        System.out.println("Tipo: " + cozinha.getTipo());
        System.out.println("Quantidade de pessoas: " + cozinha.getQntdPessoas());
        System.out.println("Cor: " + cozinha.getCor());

        cozinha.cozinhar();
        cozinha.limpar();
    }
}
