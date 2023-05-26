package dto;

import enums.Destinos;
import utils.ArquivosUtils;

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

        // tem um loop nessa aula enquanto ele explica a linha o comando load
        // também tem um loop nessa aula enquanto ele explica a conversão de string para inteiro
        // o copy path que é comentado é o caminho relativo do arquivo de propriedades criado anteriormente

        // Início do comentário
        // Código antes da refatoração comentada no vídeo
        //
        // Properties propriedades = new Properties();
        // propriedades.load(new FileInputStream("src/main/resources/application.properties"));
        // int limiteDeAcompanhantes = Integer.parseInt(propriedades.getProperty("viagem.nacional.acompanhantes.limite"));
        // Fim do comentário

        int limiteDeAcompanhantes = Integer.parseInt(ArquivosUtils.getPropriedade("viagem.nacional.acompanhantes.limite"));

        if (acompanhantes.size() <= limiteDeAcompanhantes) {
            super.setAcompanhantes(acompanhantes);
        } else {
            throw new Exception("Viagens nacionais não permitem mais que " + limiteDeAcompanhantes + " acompanhantes");
        }
    }
}
