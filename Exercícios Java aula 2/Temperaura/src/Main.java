import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int op;
        double temp, tempConvertido;
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual operação você deseja fazer:");
        System.out.println("1- Celsius -> Fahrenheit");
        System.out.println("2- Fahrenheit -> Celsius");
        op = sc.nextInt();
        switch (op) {
            case 1:
                System.out.println("Qual a temperatura em celsius?");
                temp = sc.nextInt();
                tempConvertido = (temp * 9/5) + 32;
                System.out.printf("%.0f° Celsius = %.1f° Fahrenheit\n", temp, tempConvertido);
                break;
            case 2:
                System.out.println("Qual a temperatura em Fahrenheit?");
                temp = sc.nextInt();
                tempConvertido = (temp - 32) * 5/9;
                System.out.printf("%.0f° Fahrenheit = %.1f° Celsius\n", temp, tempConvertido);
                break;
            default:
                System.out.println("Opção Invalida");
                break;
        }


    }
}