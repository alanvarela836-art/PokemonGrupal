package pokemonjade;
/**
 * Parte de Jade.
 */
public class ArenaPokemon {
    static{
        System.out.println("¡BIENVENIDO A LA ARENA POKÉMON!");
    }
    {
        System.out.println("Se creó una nueva arena.");
    }
    public static void main(String[] args){
        Pokemon pikachu=new Pokemon("Pikachu",100);
        AccionCombate baya=new AccionCombate(){
            /** Cura 30 HP. */
            public void ejecutar(Pokemon p){
                p.setVida(p.getVida()+30);
                System.out.println("La Baya Misteriosa curó 30 HP.");
            }
        };
        baya.ejecutar(pikachu);
        System.out.println("Vida final: "+pikachu.getVida());
    }
}
