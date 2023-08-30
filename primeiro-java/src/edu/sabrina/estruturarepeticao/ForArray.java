package edu.sabrina.estruturarepeticao;
//import java.util.concurrent.ThreadLocalRandom;

public class ForArray {
    public static void main(String[] args) {
        String alunos[] = {"FELIPE", "JONAS", "JULIA", "MARCOS"};

        // for(int i = 0; i < alunos.length; i++){
        //     System.out.println("O aluno no indice x= " + i + " é " + alunos[i]);
        // }
        
        for(String aluno : alunos){
            System.out.println(alunos);
        }

    }
}
