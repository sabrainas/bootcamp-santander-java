package edu.sabrina.metodos;

public class Usuario {
    public static void main(String[] args) throws Exception{
        Tv tv = new Tv();
        tv.ligar();

        tv.diminuirVolume();
        tv.diminuirVolume();
        tv.mudarCanal(50);
        System.out.println("A TV esta ligada? " + tv.ligada);
        System.out.println("A TV esta no volume " + tv.volume);
        System.out.println("A TV esta no canal " + tv.canal);

        
    }
}
