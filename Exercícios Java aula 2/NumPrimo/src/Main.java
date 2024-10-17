import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num;
        System.out.println("Informe um número: ");
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();

        if(primo(num) == true)
        {
            System.out.println("O Número " + num + " é primo!");
        }
        else
        {
            System.out.println("O Número " + num + " não é primo!");
        }
    }

    public static boolean primo(int num) {
        if(num <= 1)
        {
            return false;
        }

        for (int i = 2; i < num; i++) {
            if(num % i == 0) {
                return false;
            }
        }

        return true;
    }
}