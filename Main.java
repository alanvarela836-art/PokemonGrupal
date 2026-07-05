package com.trabajogrupal;

public class Main {

    public static void main(String[] args) {
          Pokemon atacante = new Pikachu();      // Upcasting (implicito)
        Pokemon defensor = new Charmander();   // Upcasting (implicito)

        Combate combate = new Combate();
        combate.iniciarCombate(atacante, defensor);


    } 
}