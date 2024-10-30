package pokemons;

import ru.ifmo.se.pokemon.Type;

import moves.DarkPulse;

public final class Crawdaunt extends Corphish {
    public Crawdaunt(String name, int level) {
        super(name, level);

        this.setType(Type.WATER,Type.DARK);

        this.setStats(63,120,85,90,55,55);
        
        DarkPulse darkPulse = new DarkPulse(80,100);
        this.addMove(darkPulse);
        
    }
}