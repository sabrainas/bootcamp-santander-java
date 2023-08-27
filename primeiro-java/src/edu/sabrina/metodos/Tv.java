package edu.sabrina.metodos;

public class Tv {
    //criar um exemplo de uma classe para representar uma SmartTV
    boolean ligada = false;
    int canal = 1, volume = 25;

    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }

    public void aumentarVolume(){
        volume++;
    }
    public void diminuirVolume(){
        volume--;
    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }
}
