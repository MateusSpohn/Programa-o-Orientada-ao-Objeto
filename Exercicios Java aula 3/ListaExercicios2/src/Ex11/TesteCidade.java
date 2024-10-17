package Ex11;

import Ex10.Veiculo;

public class TesteCidade {
    public static void main(String[] args) {
        Cidade cidade = new Cidade("Palotina", 40000, "Paraná");

        System.out.println(cidade.AumentarHabitantes(20000));
        System.out.println(cidade.DiminuirHabitantes(10000));
    }
}
