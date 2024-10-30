package moves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Stat;

public class ShadowBall extends SpecialMove {
    public ShadowBall(double power, double acc) {
        super(Type.GHOST, power, acc);
    }

    @Override
    protected String describe() {
        return "использует Shadow Ball";
    }

    @Override
    protected void applyOppEffects(Pokemon def) {
        if (0.2 > Math.random()){
            def.setMod(Stat.SPECIAL_DEFENSE, -1);
        }
    }
}