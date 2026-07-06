package com.pokemon.Recursos;

import com.pokemon.Objetos.Bulbasaur;
import com.pokemon.Objetos.Charmander;
import com.pokemon.Objetos.Pikachu;
import com.pokemon.Objetos.Pokemon;
import com.pokemon.Objetos.Squirtle;

/**
 * Clase para controlar los enfrentamientos en la arena y aplicar las
 * habilidades únicas.
 * 
 * @author Christian Llerena
 */
public class Combate {

    /**
     * Método que inicia la pelea entre dos Pokémon usando Upcasting y Downcasting.
     */
    public void iniciarEnfrentamiento(Pokemon atacante, Pokemon defensor) {
        System.out
                .println("\n--- ¡Furia en la Arena: " + atacante.getNombre() + " VS " + defensor.getNombre() + "! ---");

        // Aquí aplicamos el Downcasting para revisar quién es el atacante y activar su
        // poder único
        if (atacante instanceof Pikachu) {
            // Convertimos la referencia genérica a una específica de Pikachu
            Pikachu pika = (Pikachu) atacante;
            pika.tackleadaTrueno(defensor);

        } else if (atacante instanceof Charmander) {
            // Convertimos a Charmander para usar su ataque de fuego
            Charmander charmy = (Charmander) atacante;
            charmy.pirotecniaFeroz(defensor);

        } else if (atacante instanceof Squirtle) {
            // Convertimos a Squirtle para activar su hidrobomba
            Squirtle squirt = (Squirtle) atacante;
            squirt.hidrobombaMortal(defensor);

        } else if (atacante instanceof Bulbasaur) {
            // Convertimos a Bulbasaur para usar sus látigos
            Bulbasaur bulba = (Bulbasaur) atacante;
            bulba.latigoCepaLoco(defensor);
        }

        // Al final de la ronda, mostramos cómo quedó el defensor usando los Getters
        System.out.println(
                "Resultado: A " + defensor.getNombre() + " le quedan " + defensor.getHp() + " puntos de vida.");
    }
}