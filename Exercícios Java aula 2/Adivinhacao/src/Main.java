import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int num, chute;
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        num = rand.nextInt(101);
        System.out.println("Olá, e estou pensando em um número entre 0 e 100, vamos lá, tente adivinhar!");
        do
        {
            chute = sc.nextInt();
            if(chute > num)
            {
                System.out.println("O número que eu estou pensando é menor que " + chute);
            }
            else if (chute < num)
            {
                System.out.println("O número que eu estou pensando é maior que " + chute);
            }

        }while (chute != num);

        System.out.println("Parabéns! Você adivinhou, o número era " + num);
    }
}