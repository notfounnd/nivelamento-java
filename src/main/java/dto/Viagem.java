package dto;

import enums.Destinos;

import java.util.List;

public class Viagem {
    // atributos da classe
    private Destinos destino;
    private List<Acompanhante> acompanhantes;

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

    public List<Acompanhante> getAcompanhantes() {
        return this.acompanhantes;
    }

    public void setAcompanhantes(List<Acompanhante> acompanhantes) throws Exception {
        this.acompanhantes = acompanhantes;
    }
}