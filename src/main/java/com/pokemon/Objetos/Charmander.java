package com.pokemon.Objetos;

/**
 * Clase final que representa a Charmander, subclase permitida por la clase
 * sellada.
 * 
 * @author Christian Llerena
 */
public final class Charmander extends Pokemon {
    public Charmander() {
        super("Charmander", 55, 17);
    }

    /**
     * Método único y exclusivo de Charmander para el downcasting.
     */
    public void pirotecniaFeroz(Pokemon objetivo) {
        System.out.println("¡¡¡Charmander usa PIROTECNIA FEROZ de manera exclusiva!!!");
        objetivo.recibirDanio(28);
    }
}