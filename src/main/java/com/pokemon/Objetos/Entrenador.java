package com.pokemon.Objetos;

/**
 * Clase que modela al entrenador que controla la partida.
 * 
 * @author Alan Varela
 */
public class Entrenador {
    // Atributos privados para aplicar encapsulamiento y proteger los datos
    private String nombre;
    private int vidaArena;

    /**
     * Constructor para setear los datos obligatorios del entrenador al iniciar.
     */
    public Entrenador(String nombre, int vidaArena) {
        this.nombre = nombre;
        this.vidaArena = vidaArena;
    }

    // Getters y Setters para el acceso controlado de los atributos
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVidaArena() {
        return this.vidaArena;
    }

    // Validación del encapsulamiento: controlamos que la vida no quede en números
    // negativos
    public void recibirDanio(int cantidad) {
        this.vidaArena -= cantidad;
        if (this.vidaArena < 0) {
            this.vidaArena = 0; // Si el daño la baja de cero, la clavamos en cero
        }
    }
}