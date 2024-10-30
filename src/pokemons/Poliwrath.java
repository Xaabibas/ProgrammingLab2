package pokemons;

import ru.ifmo.se.pokemon.Type;

import moves.PoisonJab;

public final class Poliwrath extends Poliwag {
    public Poliwrath(String name, int level) {
        super(name, level);

        this.setType(Type.WATER,Type.FIGHTING);

        this.setStats(90,95,95,70,90,70);
        
        PoisonJab poisonJab = new PoisonJab(80,100);
        this.addMove(poisonJab);
        
    }
}