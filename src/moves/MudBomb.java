package moves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Stat;

public class MudBomb extends SpecialMove {
    public MudBomb(double power, double acc) {
        super(Type.GROUND, power, acc);
    }

    @Override
    protected String describe() {
        return "использует Mud Bomb";
    }

    @Override
    protected void applyOppEffects(Pokemon def) {
        if (0.3 > Math.random()){
            def.setMod(Stat.ACCURACY, -1);
        }
    }
}