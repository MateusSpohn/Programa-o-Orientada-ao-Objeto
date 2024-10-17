package Ex2;

public class TesteCelular {
    public static void main(String[] args) {
        Celular celular = new Celular("Sansung", "Galaxy S23", 3785);
        Celular celular2 = new Celular("Iphone", "Iphone 15 pro max", 4441);

        System.out.println(celular.toString());
        System.out.println(celular2.toString());
    }
}
