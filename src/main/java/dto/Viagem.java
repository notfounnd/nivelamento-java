package dto;

public class Viagem {
    // atributos da classe
    private String destino;

    // construtor da classe
    public Viagem(String lugarDeDestino) {
        this.destino = lugarDeDestino;
    }

    // métodos da classe
    public String getDestino() {
        return this.destino;
    }

    public void setDestino(String lugarDeDestino) {
        this.destino = lugarDeDestino;
    }
}