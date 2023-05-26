package dto;

import enums.Destinos;

import java.util.List;

public class ViagemInternacional extends Viagem {
    // atributos da classe
    private String passaporte;

    // construtor da classe
    public ViagemInternacional(Destinos lugarDeDestino) {
        super(lugarDeDestino);
    }

    // métodos da classe
    public String getPassaporte() {
        return this.passaporte;
    }

    public void setPassaporte(String passaporte) {
        this.passaporte = passaporte;
    }

    // polimorfismo
    @Override
    public void setAcompanhantes(List<Acompanhante> acompanhantes) throws Exception {
        if (acompanhantes.size() <= 1) {
            super.setAcompanhantes(acompanhantes);
        } else {
            throw new Exception("Viagens internacionais não podem ter mais que 1 acompanhante");
        }
    }
}
