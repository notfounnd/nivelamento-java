package dto;

public class Acompanhante {
    // atributos da classe
    private String nome;
    private boolean confirmouCadastro;

    // métodos da classe
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isConfirmouCadastro() {
        return this.confirmouCadastro;
    }

    public void setConfirmouCadastro(boolean confirmouCadastro) {
        this.confirmouCadastro = confirmouCadastro;
    }
}
