import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int num;
        System.out.println("Digite um número inteiro:");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        if (num % 2 == 0)
        {
            System.out.println("O número informado é par!");
        }
        else
        {
            System.out.println("O número informado é ímpar!");
        }
    }
}