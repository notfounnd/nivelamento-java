package dto;

import enums.Destinos;
import interfaces.CalculadoraDePrevisao;
import utils.ArquivosUtils;

import java.util.List;

public class ViagemInternacional extends Viagem implements CalculadoraDePrevisao {
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
        int limiteDeAcompanhantes = Integer.parseInt(ArquivosUtils.getPropriedade("viagem.internacional.acompanhantes.limite"));

        if (acompanhantes.size() <= limiteDeAcompanhantes) {
            super.setAcompanhantes(acompanhantes);
        } else {
            throw new Exception("Viagens internacionais não podem ter mais que " + limiteDeAcompanhantes + " acompanhante");
        }
    }

    // implementando o metodo da interface
    public int calcularPrevisaoDeDiasParaRetorno() {
        if (this.getDestino().equals(Destinos.MIAMI)) {
            return 1;
        }

        return 0;
    }
}
