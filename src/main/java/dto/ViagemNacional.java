package dto;

import enums.Destinos;

import java.util.List;

public class ViagemNacional extends Viagem {
    // atributos da classe
    private String cpf;

    // construtor da classe
    public ViagemNacional(Destinos lugarDeDestino) {
        super(lugarDeDestino);
    }

    // métodos da classe
    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    // polimorfismo
    @Override
    public void setAcompanhantes(List<Acompanhante> acompanhantes) throws Exception {
        if (acompanhantes.size() <= 4) {
            super.setAcompanhantes(acompanhantes);
        } else {
            throw new Exception("Viagens nacionais não permitem mais que 4 acompanhantes");
        }
    }
}
