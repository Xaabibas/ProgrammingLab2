package moves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Waterfall extends PhysicalMove {
    public Waterfall(double power, double acc) {
        super(Type.WATER, power, acc);
    }

    @Override
    protected String describe() {
        return "использует Waterfall";
    }

    @Override
    protected void applyOppEffects(Pokemon def) {
        if (0.2 > Math.random()){
            def.confuse();
        }
    }
}