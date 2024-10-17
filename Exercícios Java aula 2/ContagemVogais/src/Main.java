import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String palavra;
        int contaVogal = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma palavra:");
        palavra = sc.nextLine();
        for (int i = 0; i < palavra.length(); i++) {
            if(palavra.toLowerCase().charAt(i) == 'a' || palavra.toLowerCase().charAt(i) == 'e' || palavra.toLowerCase().charAt(i) == 'i' || palavra.toLowerCase().charAt(i) == 'o' || palavra.toLowerCase().charAt(i) == 'u')
            {
                contaVogal++;
            }
        }

        System.out.println("A palavra " + palavra + " possui " + contaVogal + " vogais");
    }
}