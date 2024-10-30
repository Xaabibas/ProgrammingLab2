package moves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;


public class BubbleBeam extends SpecialMove {
    public BubbleBeam(double power, double acc) {
        super(Type.WATER, power, acc);
    }

    @Override
    protected String describe() {
        return "использует Bubble Beam";
    }

    @Override
    protected void applyOppEffects(Pokemon def) {
        if (0.1 > Math.random()){
            def.setMod(Stat.SPEED, -1);
        }
    }
}