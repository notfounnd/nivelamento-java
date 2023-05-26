package app;

import dto.Viagem;

public class App {
    public static void main(String[] args) {
        Viagem viagem = new Viagem("Osasco");

        viagem.setDestino("Maringá");

        viagem.setDestino("Miami");

        System.out.println(viagem.getDestino());
    }
}
