package moves;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Status;

public class IceBeam extends SpecialMove {
    public IceBeam(double power, double acc) {
        super(Type.ICE, power, acc);
    }

    @Override
    protected String describe() {
        return "использует Ice Beam";
    }

    @Override
    protected void applyOppEffects(Pokemon def) {
        def.setCondition(new Effect().chance(0.1).condition(Status.FREEZE));
    }
}