package main.java.OperacoesBasicas.set.agendaContatos;

import java.util.Objects;

public class Contato {
    private String nome;
    private int numTelefone;

    public Contato(String nome, int numTelefone) {
        this.nome = nome;
        this.numTelefone = numTelefone;
    }

    public String getNome() {
        return nome;
    }

    public int getNumTelefone() {
        return numTelefone;
    }

    public int setNumTelefone(int numTelefone){
        this.numTelefone = numTelefone;
        return numTelefone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contato contato)) return false;
        return Objects.equals(getNome(), contato.getNome());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome());
    }

    @Override
    public String toString() {
        return nome + '\'' +
        "," + numTelefone;
    }
}
