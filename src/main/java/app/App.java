package app;

import dto.Acompanhante;
import dto.Viagem;
import dto.ViagemInternacional;
import dto.ViagemNacional;
import enums.Destinos;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Viagem viagem = new Viagem(Destinos.OSASCO);

        viagem.setDestino(Destinos.RECIFE);

        viagem.setDestino(Destinos.MARINGA);

        Acompanhante acompanhante1 = new Acompanhante();
        acompanhante1.setNome("Priscila");
        acompanhante1.setConfirmouCadastro(true);

        Acompanhante acompanhante2 = new Acompanhante();
        acompanhante2.setNome("Isabelle");
        acompanhante2.setConfirmouCadastro(true);

        List<Acompanhante> acompanhantes = new ArrayList<Acompanhante>();
        acompanhantes.add(acompanhante1);
        acompanhantes.add(acompanhante2);
        // adicionando mais acompanhantes para forçar o erro
        acompanhantes.add(acompanhante2);
        acompanhantes.add(acompanhante2);
        acompanhantes.add(acompanhante2);

        try {
            viagem.setAcompanhantes(acompanhantes);
        } catch (Exception excecao) {
            System.out.println("Ocorreu um erro: ");
            System.out.println(excecao.getMessage());
        }

        System.out.println(viagem.getDestino().getCidade());
        System.out.println(viagem.getAcompanhantes().size());

        for (Acompanhante acompanhante : viagem.getAcompanhantes()) {
            System.out.println(acompanhante.getNome());
            System.out.println(acompanhante.isConfirmouCadastro());
        }

        // Início do comentário
        // Trabalhando com a herança codificada
        ViagemNacional viagemNacional = new ViagemNacional(Destinos.GOIAS);
        try {
            viagemNacional.setAcompanhantes(acompanhantes);
        } catch (Exception excecao) {
            System.out.println("Ocorreu um erro: ");
            System.out.println(excecao.getMessage());
        }
        viagemNacional.setCpf("11122233377");

        ViagemInternacional viagemInternacional = new ViagemInternacional(Destinos.MIAMI);
        try {
            viagemInternacional.setAcompanhantes(acompanhantes);
        } catch (Exception excecao) {
            System.out.println("Ocorreu um erro: ");
            System.out.println(excecao.getMessage());
        }
        viagemInternacional.setPassaporte("11111-5");

        System.out.println(viagemNacional.getDestino().getCidade());
        System.out.println(viagemInternacional.getDestino().getCidade());

        System.out.println(viagemNacional.getCpf());
        System.out.println(viagemInternacional.getPassaporte());
        // Fim do comentário
    }
}