package com.trabajogrupal;

public class Combate {
    
      public void iniciarCombate(Pokemon atacante, Pokemon defensor) {

        atacante.atacar();
    //DOWCASTING (explicito)
        if (atacante instanceof Pikachu) {
            ((Pikachu) atacante).impactrueno();

        } else if (atacante instanceof Charmander) {
            
            ((Charmander) atacante).lanzallamas();
        }
    }
}
