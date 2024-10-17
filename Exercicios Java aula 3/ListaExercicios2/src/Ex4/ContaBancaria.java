package Ex4;

public class ContaBancaria {
    public int numConta;
    public double saldo;

    public ContaBancaria(int numConta, double saldo) {
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) {
            this.saldo -= valor;
    }

    @Override
    public String toString()
    {
        return "Conta{ " +
                "numero='" + numConta + '\'' +
                ", saldo='" + saldo +
                "}";
    }
}
