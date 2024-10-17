package Ex11;

public class Cidade {
    private String nome;
    private int populacao;
    private String estado;

    public Cidade(String nome, int populacao, String estado) {
        this.nome = nome;
        this.populacao = populacao;
        this.estado = estado;
    }

    public String AumentarHabitantes(int parQuantidadeAumentar)
    {
        populacao += parQuantidadeAumentar;
        return ("A cidade " + nome + " do estado do  " + estado + " agora possui " + populacao + " habitantes!");
    }

    public String DiminuirHabitantes(int parQuantidadeDiminuir)
    {
        populacao -= parQuantidadeDiminuir;
        return ("A cidade " + nome + " do estado do  " + estado + " agora possui " + populacao + " habitantes!");
    }
}
