package dto;

import enums.Destinos;

public class Viagem {
    // atributos da classe
    private Destinos destino;

    // construtor da classe
    public Viagem(Destinos lugarDeDestino) {
        this.destino = lugarDeDestino;
    }

    // métodos da classe
    public Destinos getDestino() {
        return this.destino;
    }

    public void setDestino(Destinos lugarDeDestino) {
        this.destino = lugarDeDestino;
    }
}