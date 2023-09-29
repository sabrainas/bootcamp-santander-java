package main.java.OperacoesBasicas;

public class Item {
    private String nome;
    private double preco;
    private int qtd;

    public Item(String nome, double preco, int qtd) {
        this.nome = nome;
        this.preco = preco;
        this.qtd = qtd;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    @Override
    public String toString() {
        return "Item " +
                "nome = ' " + nome + '\'' +
                ", preco = " + preco +
                ", qtd = " + qtd +
                '}';
    }
}
