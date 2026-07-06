package com.pokemon.Principal;

import com.pokemon.Objetos.Charmander;
import com.pokemon.Objetos.Entrenador;
import com.pokemon.Objetos.Pikachu;
import com.pokemon.Objetos.Pokemon;
import com.pokemon.Recursos.AccionCombate;
import com.pokemon.Recursos.ArenaPokemon;
import com.pokemon.Recursos.Combate;

/**
 * Clase principal que ejecuta y conecta la lógica de todos los integrantes.
 * 
 * @author Alan, Maicky, Jade, Christian
 */
public class Main {
    // Bloque estático en la clase principal para mostrar el mensaje de bienvenida
    static {
        System.out.println("=================================================");
        System.out.println("      ¡BIENVENIDO A MINI POKÉMON ARENA!          ");
        System.out.println("=================================================\n");
    }

  public static void main(String[] args) {
        // --- PARTE 1: DEMOSTRACIÓN DE ARREGLOS ASIMÉTRICOS Y ENCAPSULAMIENTO (ALAN VARELA) ---
        System.out.println("--- 1. Inicialización de la Arena Irregular ---");
        ArenaPokemon arena = new ArenaPokemon();
        
        int[] configBiomas = {2, 4, 3};
        arena.definirEstructuraArena(configBiomas);
        System.out.println("Mapa generado. Biomas activos en el torneo: " + arena.getMapaCasillas().length);

        Entrenador jugador = new Entrenador("Alan", 100);
        System.out.println("Entrenador listo: " + jugador.getNombre() + " | HP inicial: " + jugador.getVidaArena());
        
        // --- PARTE 2 Y 3: JERARQUÍA DE CARGA Y CLASES ANÓNIMAS (MAICKY JATIVA Y JADE TAIPE) ---
        System.out.println("\n--- 2. Aparición de Pokémon y Eventos en el Mapa ---");
        Pokemon pika = new Pikachu(); 
        
        AccionCombate eventoBaya = new AccionCombate() {
            @Override
            public void ejecutar(Pokemon objetivo) {
                System.out.println("¡Pisaste una casilla con una Baya Misteriosa!");
                System.out.println("Efecto: Se restauran 20 puntos de salud a " + objetivo.getNombre());
            }
        };
        eventoBaya.ejecutar(pika);

        // ===================================================================================
        // AQUÍ ES EL CAMBIO (AL FINAL DEL MAIN)
        // --- PARTE 4: MOTOR DE COMBATE, UPCASTING Y DOWNCASTING (CHRISTIAN LLERENA) ---
        // ===================================================================================
        System.out.println("\n--- 3. Fase de Combate y Habilidades Únicas ---");
        
        // Guardamos los objetos hijos en variables de la superclase abstracta (Upcasting)
        Pokemon miPika = new Pikachu();
        Pokemon rivalCharmander = new Charmander();
        
        // Instanciamos el controlador de peleas de Christian
        Combate torneo = new Combate();
        
        // Mandamos a los pokes a darse de quiños en la arena
        torneo.iniciarEnfrentamiento(miPika, rivalCharmander);
        torneo.iniciarEnfrentamiento(rivalCharmander, miPika);
    }
}