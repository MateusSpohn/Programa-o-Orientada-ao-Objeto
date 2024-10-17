package Ex20;

public class TesteEmpresa {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("QUA-TI", "64716471", 10000);

        System.out.println("Nome da Empresa: " + empresa.getNome());
        System.out.println("CNPJ: " + empresa.getCnpj());
        System.out.println("Número de funcionários: " + empresa.getNumFuncionarios());

        empresa.contratar();
        empresa.demitir();
    }
}
