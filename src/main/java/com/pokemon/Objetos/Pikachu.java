package com.pokemon.Objetos;

/**
 * Clase final que representa a Pikachu, subclase permitida por la clase
 * sellada.
 * 
 * @author Christian Llerena
 */
public final class Pikachu extends Pokemon {
    public Pikachu() {
        super("Pikachu", 60, 15);
    }

    /**
     * Método exclusivo de la subclase para evidenciar el Downcasting en la
     * exposición.
     */
    public void tackleadaTrueno(Pokemon objetivo) {
        System.out.println("¡¡¡Pikachu usa TACKLEADA TRUENO de manera exclusiva!!!");
        objetivo.recibirDanio(25);
    }
}