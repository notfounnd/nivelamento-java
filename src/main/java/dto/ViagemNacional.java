package dto;

import enums.Destinos;
import interfaces.CalculadoraDePrevisao;
import utils.ArquivosUtils;

import java.util.List;

public class ViagemNacional extends Viagem implements CalculadoraDePrevisao {
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
        int limiteDeAcompanhantes = Integer.parseInt(ArquivosUtils.getPropriedade("viagem.nacional.acompanhantes.limite"));

        if (acompanhantes.size() <= limiteDeAcompanhantes) {
            super.setAcompanhantes(acompanhantes);
        } else {
            throw new Exception("Viagens nacionais não permitem mais que " + limiteDeAcompanhantes + " acompanhantes");
        }
    }

    // implementando o metodo da interface
    public int calcularPrevisaoDeDiasParaRetorno() {
        int quantidadeDeDias = 0;

        switch (this.getDestino()) {
            case MANAUS: quantidadeDeDias = 4; break;
            case RECIFE: quantidadeDeDias = 3; break;
            case GOIAS: quantidadeDeDias = 2; break;
            case MARINGA: quantidadeDeDias = 1; break;
            case OSASCO: quantidadeDeDias = 0; break;
        }

        return quantidadeDeDias;
    }
}
