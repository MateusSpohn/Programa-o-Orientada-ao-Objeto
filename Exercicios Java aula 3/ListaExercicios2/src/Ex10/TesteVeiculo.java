package Ex10;

public class TesteVeiculo {
    public static void main(String[] args) {
    Veiculo veiculo = new Veiculo("Camaro", "abcd564", "Azul");

        System.out.println(veiculo.LavarCarro());
        System.out.println(veiculo.Abastecer());
    }
}
