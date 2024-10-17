package Ex18;

public class Bicicleta {
    public String marca;
    public String modelo;
    public String tamanhoRoda;

    public Bicicleta(String marca, String tamanhoRoda, String modelo) {
        this.marca = marca;
        this.tamanhoRoda = tamanhoRoda;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getTamanhoRoda() {
        return tamanhoRoda;
    }

    public void pedalar(){
        System.out.println("Você pedalou");
    }

    public void freiar(){
        System.out.println("Você freiou");
    }
}
