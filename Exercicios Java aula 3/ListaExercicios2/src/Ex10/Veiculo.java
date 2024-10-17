package Ex10;

public class Veiculo {
    private String tipo;
    private String placa;
    private String cor;

    public Veiculo(String tipo, String placa, String cor) {
        this.tipo = tipo;
        this.placa = placa;
        this.cor = cor;
    }

    public String LavarCarro()
    {
        return ("O carro " + tipo + " com a placa " + placa + " da cor " + cor + " está limpo!");
    }

    public String Abastecer()
    {
        return ("O carro " + tipo + " com a placa " + placa + " da cor " + cor + " está com o tanque cheio!");
    }


}
