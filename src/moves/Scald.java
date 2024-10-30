package moves;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Status;

public class Scald extends SpecialMove {
    public Scald(double power, double acc) {
        super(Type.WATER, power, acc);
    }

    @Override
    protected String describe() {
        return "использует Scald";
    }

    @Override
    protected void applyOppEffects(Pokemon def) {
        def.setCondition(new Effect().chance(0.3).condition(Status.BURN));
    }
}