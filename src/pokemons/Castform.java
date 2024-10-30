package pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

import moves.ShadowBall;
import moves.Headbutt;
import moves.WaterGun;
import moves.Rest;

public final class Castform extends Pokemon {
    public Castform(String name, int level) {
        super(name, level);

        this.setType(Type.NORMAL);

        this.setStats(70,70,70,70,70,70);
        
        ShadowBall shadowBall = new ShadowBall(80,100);
        this.addMove(shadowBall);
        
        Headbutt headbutt = new Headbutt(70,100);
        this.addMove(headbutt);
        
        WaterGun waterGun = new WaterGun(40,100);
        this.addMove(waterGun);
        
        Rest rest = new Rest(0,100);
        this.addMove(rest);
        
    }
}