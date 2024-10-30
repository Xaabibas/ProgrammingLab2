import pokemons.*;
import ru.ifmo.se.pokemon.Battle;


public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        Castform castform = new Castform("Castform", 15);
        Corphish corphish = new Corphish("Corphish", 12);
        Crawdaunt crawdaunt = new Crawdaunt("Crawdaunt", 12);
        Poliwag poliwag = new Poliwag("Poliwag", 1);
        Poliwhirl poliwhirl = new Poliwhirl("Poliwhirl", 53);
        Poliwrath poliwrath = new Poliwrath("Poliwrath", 53);
        b.addFoe(castform);
        b.addFoe(crawdaunt);
        b.addFoe(poliwhirl);
        b.addAlly(corphish);
        b.addAlly(poliwag);
        b.addAlly(poliwrath);
        b.go();
    }
}