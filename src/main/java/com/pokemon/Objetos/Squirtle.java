package com.pokemon.Objetos;

/**
 * Clase final que representa a Squirtle, subclase permitida por la clase
 * sellada.
 * 
 * @author Christian Llerena
 */
public final class Squirtle extends Pokemon {
    public Squirtle() {
        super("Squirtle", 65, 13);
    }

    /**
     * Método único y exclusivo de Squirtle para el downcasting.
     */
    public void hidrobombaMortal(Pokemon objetivo) {
        System.out.println("¡¡¡Squirtle usa HIDROBOMBA MORTAL de manera exclusiva!!!");
        objetivo.recibirDanio(22);
    }
}