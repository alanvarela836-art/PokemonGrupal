package com.pokemon.Principal;

// Importamos Scanner para poder leer lo que el usuario teclea en la consola
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
    // Bloque estático: Le da la bienvenida al usuario apenas arranca el programa, antes de todo
    static {
        System.out.println("=================================================");
        System.out.println("      ¡BIENVENIDO A MINI POKÉMON ARENA!          ");
        System.out.println("=================================================\n");
    }

    public static void main(String[] args) {
        // Instanciamos el Scanner para habilitar la lectura de datos por teclado
        Scanner teclado = new Scanner(System.in);
        int opcion = 0; // Variable que guardará la opción que elija el usuario

        // PRE-SETUP: Declaramos las variables globales del torneo antes de entrar al menú
        ArenaPokemon arena = new ArenaPokemon();
        Entrenador jugador = new Entrenador("Alan", 100);
        
        // Al crear los objetos, saltarán los bloques estáticos y de instancia automáticamente
        System.out.println("\n[Fase de Preparación] Inscribiendo competidores...");
        Pokemon miPika = new Pikachu(); 
        Pokemon rivalCharmander = new Charmander();
        Combate torneo = new Combate();
        
        System.out.println("Entrenador oficial: " + jugador.getNombre() + " | HP: " + jugador.getVidaArena());

        // Bucle DO-WHILE: El menú se va a repetir una y otra vez hasta que aplasten el 4 (Salir)
        do {
            // Imprimimos las opciones del menú en la consola
            System.out.println("\n=================================================");
            System.out.println("          MENÚ INTERACTIVO DEL TORNEO            ");
            System.out.println("=================================================");
            System.out.println("1. Construir Arena Irregular (Parte de Alan)");
            System.out.println("2. Explorar mapa y usar Baya Misteriosa (Parte Jade/Maicky)");
            System.out.println("3. Iniciar Combate Oficial (Parte de Christian)");
            System.out.println("4. Salir del Juego");
            System.out.print("Elige una opción, pana: ");
            
            // Leemos el número que el usuario digitó y lo guardamos en 'opcion'
            opcion = teclado.nextInt();

            // Usamos un SWITCH para ejecutar un bloque de código diferente según el número ingresado
            switch (opcion) {
                case 1:
                    // --- PARTE 1: ARREGLOS ASIMÉTRICOS Y ENCAPSULAMIENTO ---
                    System.out.println("\n--- 1. Inicialización de la Arena Irregular ---");
                    int[] configBiomas = {2, 4, 3}; // 3 zonas con tamaños diferentes
                    arena.definirEstructuraArena(configBiomas); // Llamamos a tu método
                    
                    System.out.println("¡Mapa generado con éxito!");
                    System.out.println("Biomas activos en el torneo: " + arena.getMapaCasillas().length);
                    // Comprobamos el encapsulamiento imprimiendo la vida sin poder modificarla
                    System.out.println("La salud del entrenador se mantiene segura por encapsulamiento: " + jugador.getVidaArena() + " HP.");
                    break;

                case 2:
                    // --- PARTE 2 y 3: CLASES ANÓNIMAS, INTERFACES Y EVENTOS ---
                    System.out.println("\n--- 2. Aparición de Eventos Aleatorios ---");
                    
                    // Instanciamos la clase anónima "al vuelo" para un efecto temporal
                    AccionCombate eventoBaya = new AccionCombate() {
                        @Override
                        public void ejecutar(Pokemon objetivo) {
                            System.out.println("¡Caminando por la arena pisaste una Baya Misteriosa!");
                            System.out.println("Efecto instantáneo: Se restauran 20 puntos de salud a " + objetivo.getNombre());
                        }
                    };
                    // Ejecutamos el efecto sobre nuestro Pikachu
                    eventoBaya.ejecutar(miPika);
                    break;

                case 3:
                    // --- PARTE 4: UPCASTING, DOWNCASTING Y COMBATE ---
                    System.out.println("\n--- 3. Fase de Combate y Habilidades Únicas ---");
                    System.out.println("¡Los entrenadores lanzan sus Pokéballs!");
                    
                    // Mandamos a pelear a los Pokémon. 
                    // El método 'iniciarEnfrentamiento' hace el Downcasting por dentro
                    torneo.iniciarEnfrentamiento(miPika, rivalCharmander);
                    
                    // Simulación de un contraataque
                    System.out.println("\n¡El rival contraataca!");
                    torneo.iniciarEnfrentamiento(rivalCharmander, miPika);
                    break;

                case 4:
                    // Opción para romper el bucle y terminar el programa limpio
                    System.out.println("\n¡Gracias por jugar! Guardando partida y saliendo del torneo...");
                    break;

                default:
                    // Si el usuario mete un 5 o un 9, el switch cae aquí para evitar que se caiga el sistema
                    System.out.println("\n[Error] Opción inválida. Ingresa un número del 1 al 4.");
                    break;
            }
        
        // La condición del bucle: "Mientras la opción NO SEA 4, repite el menú"
        } while (opcion != 4);

        teclado.close();
    }
}
