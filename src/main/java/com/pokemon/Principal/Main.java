package com.pokemon.Principal;

import java.util.Scanner;
import com.pokemon.Objetos.Charmander;
import com.pokemon.Objetos.Entrenador;
import com.pokemon.Objetos.Pikachu;
import com.pokemon.Objetos.Pokemon;
import com.pokemon.Recursos.AccionCombate;
import com.pokemon.Recursos.ArenaPokemon;
import com.pokemon.Recursos.Combate;

/**
 * Clase principal que ejecuta y conecta la lógica de todos los integrantes mediante un menú.
 * @author Alan, Maicky, Jade, Christian
 */
public class Main {
    // Bloque estático: Le da la bienvenida al usuario apenas arranca el programa
    static {
        System.out.println("=================================================");
        System.out.println("      ¡BIENVENIDO A MINI POKÉMON ARENA!          ");
        System.out.println("=================================================\n");
    }

    public static void main(String[] args) {
        // Instanciamos el Scanner para leer datos por teclado
        Scanner teclado = new Scanner(System.in);
        int opcion = 0; 

        // Declaramos las variables globales del torneo
        ArenaPokemon arena = new ArenaPokemon();
        Entrenador jugador = new Entrenador("Alan", 100);
        
        System.out.println("\n[Fase de Preparación] Inscribiendo competidores...");
        
        // Upcasting: Guardamos a los hijos en variables de la superclase
        Pokemon miPika = new Pikachu(); 
        Pokemon rivalCharmander = new Charmander();
        Combate torneo = new Combate();
        
        // Validación rápida con instanceof en el Main
        if (miPika instanceof Pikachu) {
            System.out.println(">> ¡El sistema de la arena ha validado que el retador es un Pikachu!");
        }
        if (rivalCharmander instanceof Charmander) {
            System.out.println(">> ¡Peligro! El sistema detectó un Charmander de fuego como rival.");
        }

        System.out.println("Entrenador oficial: " + jugador.getNombre() + " | HP: " + jugador.getVidaArena());

        // Bucle DO-WHILE: El menú interactivo
        do {
            System.out.println("\n=================================================");
            System.out.println("          MENÚ INTERACTIVO DEL TORNEO            ");
            System.out.println("=================================================");
            System.out.println("1. Construir Arena Irregular ");
            System.out.println("2. Explorar mapa y usar Baya Misteriosa ");
            System.out.println("3. Iniciar Combate Oficial");
            System.out.println("4. Salir del Juego");
            System.out.print("Elige una opción: ");
            
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    // --- PARTE 1: ARREGLOS ASIMÉTRICOS Y ENCAPSULAMIENTO ---
                    System.out.println("\n--- 1. Inicialización de la Arena Irregular ---");
                    int[] configBiomas = {2, 4, 3}; 
                    arena.definirEstructuraArena(configBiomas); 
                    
                    System.out.println("¡Mapa generado con éxito!");
                    System.out.println("Biomas activos en el torneo: " + arena.getMapaCasillas().length);
                    System.out.println("La salud del entrenador se mantiene segura por encapsulamiento: " + jugador.getVidaArena() + " HP.");
                    break;

                case 2:
                    // --- PARTE 2 y 3: CLASES ANÓNIMAS Y EVENTOS ---
                    System.out.println("\n--- 2. Aparición de Eventos Aleatorios ---");
                    
                    AccionCombate eventoBaya = new AccionCombate() {
                        @Override
                        public void ejecutar(Pokemon objetivo) {
                            System.out.println("¡Caminando por la arena pisaste una Baya Misteriosa!");
                            System.out.println("Efecto instantáneo: Se restauran 20 puntos de salud a " + objetivo.getNombre());
                        }
                    };
                    eventoBaya.ejecutar(miPika);
                    break;

                case 3:
                    // --- PARTE 4: MOTOR DE COMBATE ---
                    System.out.println("\n--- 3. Fase de Combate y Habilidades Únicas ---");
                    System.out.println("¡Los entrenadores lanzan sus Pokéballs!");
                    
                    torneo.iniciarEnfrentamiento(miPika, rivalCharmander);
                    
                    System.out.println("\n¡El rival contraataca!");
                    torneo.iniciarEnfrentamiento(rivalCharmander, miPika);
                    break;

                case 4:
                    System.out.println("\n¡Gracias por jugar! Guardando partida y saliendo del torneo...");
                    break;

                default:
                    System.out.println("\n[Error] Opción inválida. Ingresa un número del 1 al 4.");
                    break;
            }
        
        } while (opcion != 4);

        teclado.close();
    }
}
