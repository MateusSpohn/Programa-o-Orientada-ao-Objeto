package Ex3;

public class TestePessoa {
    public static void main(String[] args)
    {
        Pessoa pessoa = new Pessoa("Mateus", 18, 1.87);
        Pessoa pessoa2 = new Pessoa("João", 19, 1.80);

        System.out.println(pessoa.Apresenta());
        System.out.println(pessoa2.Apresenta());
    }
}
