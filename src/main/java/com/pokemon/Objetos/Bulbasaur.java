package com.pokemon.Objetos;

/**
 * Clase final que representa a Bulbasaur, subclase permitida por la clase
 * sellada.
 * 
 * @author Christian Llerena
 */
public final class Bulbasaur extends Pokemon {
    public Bulbasaur() {
        super("Bulbasaur", 62, 14);
    }

    /**
     * Método único y exclusivo de Bulbasaur para el downcasting.
     */
    public void latigoCepaLoco(Pokemon objetivo) {
        System.out.println("¡¡¡Bulbasaur usa LÁTIGO CEPA LOCO de manera exclusiva!!!");
        objetivo.recibirDanio(24);
    }
}