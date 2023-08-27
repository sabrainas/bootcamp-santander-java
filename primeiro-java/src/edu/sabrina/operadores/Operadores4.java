package edu.sabrina.operadores;

public class Operadores4 {
    public static void main(String[] args) throws Exception{
        String resultado;
        int a = 5, b = 6;
        if(a==b){
            resultado = "verdadeiro";
        }else{
            resultado = "falso";
        }
        resultado = a==b?"verdadeiro":"falso";
        System.out.println(resultado);
    }
}