import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            System.out.println("Selecione uma operação:");
            System.out.println("1-Somar");
            System.out.println("2-Subtrair");
            System.out.println("3-Multiplicar");
            System.out.println("4-Dividir");
            Scanner sc = new Scanner(System.in);
            int op = sc.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Digite o primeiro valor: ");
                    double num1 = sc.nextDouble();
                    System.out.println("Digite o segundo valor: ");
                    double num2 = sc.nextDouble();
                    System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Digite o primeiro valor: ");
                    double num3 = sc.nextDouble();
                    System.out.println("Digite o segundo valor: ");
                    double num4 = sc.nextDouble();
                    System.out.println(num3 + " - " + num4 + " = " + (num3 - num4));
                    break;
                case 3:
                    System.out.println("Digite o primeiro valor: ");
                    double num5 = sc.nextDouble();
                    System.out.println("Digite o segundo valor: ");
                    double num6 = sc.nextDouble();
                    System.out.println(num5 + " * " + num6 + " = " + (num5 * num6));
                    break;
                case 4:
                    System.out.println("Digite o primeiro valor: ");
                    double num7 = sc.nextDouble();
                    System.out.println("Digite o segundo valor: ");
                    double num8 = sc.nextDouble();
                    System.out.println(num7 + " / " + num8 + " = " + (num7 / num8));
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
    }
}