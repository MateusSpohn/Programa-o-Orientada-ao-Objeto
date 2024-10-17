import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num;
        int resultado = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número inteiro:");
        num = sc.nextInt();


        System.out.println("O fatorial utilizando versão iterativa de " + num + " é igual a " + fatorialIterativa(num, resultado));
        System.out.println("O fatorial utilizando versão recursiva de " + num + " é igual a " + fatorialRecursivo(num));

    }

    public static int fatorialIterativa(int num, int resultado)
    {
        for (int i = num; i > 0; i--) {
            resultado =  resultado * i;
        }
        return resultado;
    }

    public static int fatorialRecursivo(int num)
    {
        if (num == 0 || num == 1) {
            return 1;
        }
        else
        {
            return num * fatorialRecursivo(num - 1);
        }
    }
}