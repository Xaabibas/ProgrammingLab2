package pokemons;

import ru.ifmo.se.pokemon.Type;

import moves.MudBomb;

public class Poliwhirl extends Poliwag {
    public Poliwhirl(String name, int level) {
        super(name, level);

        this.setType(Type.WATER);

        this.setStats(65,65,65,50,50,90);
        
        MudBomb mudBomb = new MudBomb(65,85);
        this.addMove(mudBomb);
        
    }
}