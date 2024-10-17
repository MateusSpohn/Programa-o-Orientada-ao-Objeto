package Ex16;

public class TesteAnimal {
    public static void main(String[] args) {
        Animal animal = new Animal("Galinha", 1, "2kg");

        System.out.println("Espécie: " + animal.getEspecie());
        System.out.println("Idade: " + animal.getIdade());
        System.out.println("Peso: " + animal.getPeso());

        animal.alimentar();
        animal.dormir();
    }
}
