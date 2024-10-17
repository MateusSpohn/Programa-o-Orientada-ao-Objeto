package Ex2;

public class Celular {
    public String marca;
    public String modelo;
    public Integer capacidadeBateria;
    private boolean celularLigado;

    public Celular(String marca, String modelo, Integer capacidadeBateria) {
        this.marca = marca;
        this.modelo = modelo;
        this.capacidadeBateria = capacidadeBateria;
    }

    public void ligarCelular() {
        this.celularLigado = true;
    }

    public void desligarCelular() {
        this.celularLigado = false;
    }

    @Override
    public String toString()
    {
        return "Celular{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", capacidade bateria=" + capacidadeBateria +
                "}";
    }
}
