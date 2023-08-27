package edu.sabrina.operadores;

public class Operadores5 {
    public static void main(String[] args) throws Exception{
        String nome = "SABRINA";
        String nome2 = new String("SABRINA");  

        System.out.println(nome.equals(nome2));

        String nome3 = "SABRINA";
        String nome4 = "SABRINA";
        System.out.println(nome3 == nome4);
    }
}