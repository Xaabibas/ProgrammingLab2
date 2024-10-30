package pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

import moves.IceBeam;
import moves.Scald;

public class Poliwag extends Pokemon {
    public Poliwag(String name, int level) {
        super(name, level);

        this.setType(Type.WATER);

        this.setStats(40,50,40,40,40,90);
        
        IceBeam iceBeam = new IceBeam(90,100);
        this.addMove(iceBeam);
        
        Scald scald = new Scald(80,100);
        this.addMove(scald);
        
    }
}