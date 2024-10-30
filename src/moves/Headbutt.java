package moves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Headbutt extends PhysicalMove {
    public Headbutt(double power, double acc) {
        super(Type.NORMAL, power, acc);
    }

    @Override
    protected String describe() {
        return "использует Headbutt";
    }

    @Override
    protected void applyOppEffects(Pokemon def) {
        if (0.3 > Math.random()) {
            def.confuse();
        }

    }
}