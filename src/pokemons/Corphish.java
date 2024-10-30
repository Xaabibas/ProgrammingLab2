package pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

import moves.BubbleBeam;
import moves.Rest;
import moves.Waterfall;

public class Corphish extends Pokemon {
    public Corphish(String name, int level) {
        super(name, level);

        this.setType(Type.WATER);

        this.setStats(43,80,65,50,35,35);
        
        BubbleBeam bubbleBeam = new BubbleBeam(65,100);
        this.addMove(bubbleBeam);
        
        Rest rest = new Rest(0,100);
        this.addMove(rest);
        
        Waterfall waterfall = new Waterfall(80,100);
        this.addMove(waterfall);
        
    }
}