package edu.sabrina.operadores;

public class Operadores {
    public static void main(String[] args) throws Exception{
        String nomeCompleto = " Linguagem " + "JAVA ";
        System.out.println(nomeCompleto);

        String concatenacao = "?";
        System.out.println(concatenacao);

        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);
        
        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao);
        
        concatenacao = 1+"1"+1+"1";
        System.out.println(concatenacao);
        
        concatenacao = "1"+1+1+1;
        System.out.println(concatenacao);
        
        concatenacao = "1"+(1+1+1);
        System.out.println(concatenacao);
    }
}
