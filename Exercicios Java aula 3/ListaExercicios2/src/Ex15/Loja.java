package Ex15;

public class Loja {
    public String nome;
    public String endereco;
    public int telefone;

    public Loja(String nome, String endereco, int telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public int getTelefone() {
        return telefone;
    }

    public void abrir(){
        System.out.println("A " + getNome() + " está aberta");
    }

    public void fechar(){
        System.out.println("A " + getNome() + " está fechada");
    }
}
