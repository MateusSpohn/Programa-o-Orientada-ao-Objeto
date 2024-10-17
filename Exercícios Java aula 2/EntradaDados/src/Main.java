import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String nome;
        int idade;
        System.out.println("Digite seu nome: ");
        Scanner sc = new Scanner(System.in);
        nome = sc.nextLine();
        System.out.println("Digite sua idade: ");
        idade = sc.nextInt();

        System.out.println("Nome: " + nome + " | " + "Idade: " + idade);

    }
}