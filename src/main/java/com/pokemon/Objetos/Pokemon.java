package com.pokemon.Objetos;

/**
 * Clase abstracta y sellada base para los Pokémon del torneo.
 * 
 * @author Maicky Jativa & Jade Taipe
 */
public abstract sealed class Pokemon permits Pikachu, Charmander, Squirtle, Bulbasaur {
    private String nombre;
    private int hp;
    private int fuerza;

    // Bloque Estático: carga la infraestructura del juego una sola vez al iniciar
    // la clase
    static {
        System.out.println("[Sistema] Cargando base de datos e infraestructura Pokémon...");
    }

    // Bloque de Instancia: se ejecuta por cada objeto creado, antes del constructor
    {
        System.out.println("[Data] Asignando parámetros base y verificando estado de salud...");
    }

    public Pokemon(String nombre, int hp, int fuerza) {
        this.nombre = nombre;
        this.hp = hp;
        this.fuerza = fuerza;
    }

    // Métodos encapsulados para obtener los datos
    public String getNombre() {
        return nombre;
    }

    public int getHp() {
        return hp;
    }

    public void recibirDanio(int cantidad) {
        this.hp -= cantidad;
        if (this.hp < 0)
            this.hp = 0; // Validación para evitar HP negativo
    }
}
