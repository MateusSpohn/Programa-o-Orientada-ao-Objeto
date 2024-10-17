//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] numero = new int[5];
        numero[0] = 1;
        numero[1] = 2;
        numero[2] = 3;
        numero[3] = 4;
        numero[4] = 5;

        for (int i = 0; i < 5; i++) {
            System.out.println("numero["+i+"] = " + numero[i]);
        }
    }
}