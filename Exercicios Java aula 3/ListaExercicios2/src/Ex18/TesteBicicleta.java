package Ex18;

public class TesteBicicleta {
    public static void main(String[] args) {
        Bicicleta bicicleta = new Bicicleta("oggi", "20", "Hacker");
        System.out.println("Marca: " + bicicleta.getMarca());
        System.out.println("Tamanho da Roda: " + bicicleta.getTamanhoRoda());
        System.out.println("Modelo: " + bicicleta.getModelo());

        bicicleta.pedalar();
        bicicleta.freiar();
    }
}
