package moves;

import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class WaterGun extends SpecialMove {
    public WaterGun(double power, double acc) {
        super(Type.WATER, power, acc);
    }

    @Override
    protected String describe() {
        return "использует Water Gun";
    }

}