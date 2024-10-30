package moves;

import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove {
    public Rest(double power, double acc) {
        super(Type.PSYCHIC, power, acc);
    }

    @Override
    protected String describe() {
        return "использует Rest";
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        pokemon.restore();
        pokemon.setCondition(new Effect().turns(2).condition(Status.SLEEP));
    }
}