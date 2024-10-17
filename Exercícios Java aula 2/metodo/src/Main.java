import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1, n2;
        System.out.println("Digite um número:");
        Scanner sc = new Scanner(System.in);
        n1 = sc.nextInt();
        System.out.println("Digite outro número:");
        n2 = sc.nextInt();

        System.out.println(n1 + " + " + n2 + " = " + soma(n1, n2));

    }

    public static int soma(int n1, int n2) {
        return n1 + n2;
    }

}