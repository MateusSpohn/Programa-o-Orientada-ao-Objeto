package Ex15;

public class TesteLoja {
    public static void main(String[] args) {
        Loja loja = new Loja("Bolsa", "Bairro União", 449996998);

        System.out.println("Nome: " + loja.getNome());
        System.out.println("Endereço: " + loja.getEndereco());
        System.out.println("Telefone: " + loja.getTelefone());

        loja.abrir();
        loja.fechar();
    }
}
