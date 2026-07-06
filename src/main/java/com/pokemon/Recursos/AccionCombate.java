package com.pokemon.Recursos;

import com.pokemon.Objetos.Pokemon;

/**
 * Interfaz que define el contrato para cualquier acción o evento en el juego.
 * 
 * @author Maicky Jativa
 */
public interface AccionCombate {
    // Método abstracto que todos están obligados a implementar para ejecutar un
    // efecto
    void ejecutar(Pokemon objetivo);
}