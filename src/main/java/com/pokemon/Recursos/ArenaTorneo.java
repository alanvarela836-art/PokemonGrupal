package com.pokemon.Recursos;

/**
 * Clase para gestionar el mapa irregular de la arena del torneo.
 * @author Alan Varela
 */
public class ArenaTorneo {
    // Matriz bidimensional asimétrica: cada fila representa un bioma con diferente tamaño [cite: 11, 44, 141]
    private int[][] mapaCasillas;

    /**
     * Instancia el mapa de forma irregular según las casillas pasadas por parámetro.
     */
    public void definirEstructuraArena(int[] casillasPorBioma) {
        // Inicializamos las filas (cuántos biomas tendrá el mapa) [cite: 223]
        this.mapaCasillas = new int[casillasPorBioma.length][];
        
        // Bucle para darle el tamaño independiente a cada fila (columnas variables) [cite: 223]
        for (int i = 0; i < casillasPorBioma.length; i++) {
            this.mapaCasillas[i] = new int[casillasPorBioma[i]];
        }
    }

    // Getter para que los profes o tus panas puedan ver el mapa desde el Main
    public int[][] getMapaCasillas() {
        return this.mapaCasillas;
    }
}