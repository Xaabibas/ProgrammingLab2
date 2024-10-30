package moves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class DarkPulse extends SpecialMove {
    public DarkPulse(double power, double acc) {
        super(Type.DARK, power, acc);
    }

    @Override
    protected String describe() {
        return "использует Dark Pulse";
    }

    @Override
    protected void applyOppEffects(Pokemon def) {
        if (0.2 > Math.random()){
            def.confuse();
        }
    }
}