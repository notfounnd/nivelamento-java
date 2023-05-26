package dto;

import enums.Destinos;
import utils.ArquivosUtils;

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

        // tem um loop nessa aula enquanto ele explica a linha o comando load
        // também tem um loop nessa aula enquanto ele explica a conversão de string para inteiro
        // o copy path que é comentado é o caminho relativo do arquivo de propriedades criado anteriormente

        // Início do comentário
        // Código antes da refatoração comentada no vídeo
        //
        // Properties propriedades = new Properties();
        // propriedades.load(new FileInputStream("src/main/resources/application.properties"));
        // int limiteDeAcompanhantes = Integer.parseInt(propriedades.getProperty("viagem.internacional.acompanhantes.limite"));
        // Fim do comentário

        int limiteDeAcompanhantes = Integer.parseInt(ArquivosUtils.getPropriedade("viagem.internacional.acompanhantes.limite"));

        if (acompanhantes.size() <= limiteDeAcompanhantes) {
            super.setAcompanhantes(acompanhantes);
        } else {
            throw new Exception("Viagens internacionais não podem ter mais que " + limiteDeAcompanhantes + " acompanhante");
        }
    }
}
