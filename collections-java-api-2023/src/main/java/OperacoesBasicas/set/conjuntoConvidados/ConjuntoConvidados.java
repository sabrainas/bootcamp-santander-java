package main.java.OperacoesBasicas.set.conjuntoConvidados;

import java.util.HashSet;
import java.util.Set;

//o metodo Set só aceita elementos diferentes
public class ConjuntoConvidados {
    //atributo
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados(){
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidadoParaRemover = null;
        for(Convidado c : convidadoSet){
            if(c.getCodigoConvite() == codigoConvite){
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidados(){
        return convidadoSet.size();
    }

    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        conjuntoConvidados.adicionarConvidado("Sabrina", 1234);
        conjuntoConvidados.adicionarConvidado("Sabrina", 1235);
        conjuntoConvidados.adicionarConvidado("Camila", 1236);
        conjuntoConvidados.adicionarConvidado("Julia", 1237);
        conjuntoConvidados.adicionarConvidado("Sofia", 1238);

        conjuntoConvidados.exibirConvidados();
        System.out.println(conjuntoConvidados.contarConvidados());

        conjuntoConvidados.removerConvidadoPorCodigoConvite(1235);conjuntoConvidados.exibirConvidados();
        System.out.println(conjuntoConvidados.contarConvidados());


    }
}
