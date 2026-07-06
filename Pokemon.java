package pokemonjade;
/** Representa un Pokémon. */
public class Pokemon{
 private String nombre; private int vida;
 /** Crea un Pokémon. */
 public Pokemon(String nombre,int vida){this.nombre=nombre;this.vida=vida;}
 public int getVida(){return vida;}
 public void setVida(int vida){this.vida=vida;}
 public String getNombre(){return nombre;}
}
