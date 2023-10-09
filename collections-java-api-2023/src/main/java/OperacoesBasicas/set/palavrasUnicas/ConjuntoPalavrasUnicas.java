package main.java.OperacoesBasicas.set.palavrasUnicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> palavrasUnicasSet;

    public ConjuntoPalavrasUnicas() {
        this.palavrasUnicasSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        palavrasUnicasSet.add(palavra);
    }

    public void removerPalavra(String palavra){
        if(palavrasUnicasSet.contains(palavra)){
            palavrasUnicasSet.remove(palavra);
        }else {
            System.out.println("Palavra nao encontrada no conjunto");
        }
    }

    public boolean verificarPalavra(String palavra){
        return palavrasUnicasSet.contains(palavra);
    }

    public void exibirPalavrasUnicas(){
        System.out.println(this.palavrasUnicasSet);
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();

        conjuntoPalavrasUnicas.adicionarPalavra("Java");
        conjuntoPalavrasUnicas.adicionarPalavra("Python");
        conjuntoPalavrasUnicas.adicionarPalavra("C#");
        conjuntoPalavrasUnicas.adicionarPalavra("C");
        conjuntoPalavrasUnicas.adicionarPalavra("JavaScript");
        conjuntoPalavrasUnicas.adicionarPalavra("PHP");

        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        conjuntoPalavrasUnicas.removerPalavra("PHP");

        System.out.println("A linguagem 'PHP' está no conjunto? " + conjuntoPalavrasUnicas.verificarPalavra("PHP"));

        conjuntoPalavrasUnicas.exibirPalavrasUnicas();
    }
}
