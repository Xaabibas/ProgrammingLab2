package moves;

import ru.ifmo.se.pokemon.*;

public class PoisonJab extends PhysicalMove {
    public PoisonJab(double power, double acc) {
        super(Type.POISON, power, acc);
    }

    @Override
    protected String describe() {
        return "использует Poison Jab";
    }

    @Override
    protected void applyOppEffects(Pokemon def) {
        def.setCondition(new Effect().chance(0.3).condition(Status.POISON));
    }
}