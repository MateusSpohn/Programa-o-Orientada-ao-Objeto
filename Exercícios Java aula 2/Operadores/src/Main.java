import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double n1, n2;
        double som, sub, div, mult;
        System.out.println("Digite um número:");
        Scanner sc = new Scanner(System.in);
        n1 = sc.nextDouble();
        System.out.println("Digite outro número:");
        n2 = sc.nextDouble();
        som = n1 + n2;
        sub = n1 - n2;
        div = n1 / n2;
        mult = n1 * n2;

        System.out.println("Soma: " + som);
        System.out.println("Subtracao: " + sub);
        System.out.println("Divisao: " + div);
        System.out.println("Multiplicacao: " + mult);


    }
}