import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numero = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um número inteiro:");
            numero[i] = sc.nextInt();
        }
        Arrays.sort(numero);
        System.out.println("Os numeros em ordem crescente são:");
        for (int i = 0; i < 5; i++) {
            System.out.println(numero[i]);
        }



    }
}