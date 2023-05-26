package enums;

public enum Destinos {
    OSASCO("Osasco"),
    MARINGA("Maringá"),
    GOIAS("Goiás"),
    RECIFE("Recife"),
    MANAUS("Manaus");

    // atributo do enum
    private String cidade;

    // construtor do enum
    Destinos(String cidade) {
        this.cidade = cidade;
    }

    // metodo do enum
    public String getCidade() {
        return this.cidade;
    }
}
