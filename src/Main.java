import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;

import java.lang.Class;
import java.lang.reflect.InvocationTargetException;

public class Main {
    static final String[] teams = {"ally", "foe"};
    static final String[] pokemons = {"castform", "corphish", "crawdaunt", "poliwag", "poliwhirl", "poliwrath"};

    public static boolean is_team(String team) {
        for (String i : teams) {
            if (i.equals(team.toLowerCase())) {
                return true;
            }
        }
        return false;
    }

    public static boolean is_pokemon(String pokemon) {
        for (String i : pokemons) {
            if (i.equals(pokemon.toLowerCase())) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        // Данный вводим в формате Class Team Name Level
        // Class - класс покемона
        // Team - команда покемона
        // Name - имя покемона
        // Level - уровень покемона

        Battle b = new Battle();

        int counter = 0;
        boolean correct = true;
        String type = "";
        String team = "";
        String name = "";
        int level = 1;
        boolean ally = false;
        boolean foe = false;
        Class<?>[] params = {String.class, int.class};

        for (String i : args) {
            switch (counter) {
                case 0:
                    if (is_pokemon(i)) {
                        type = i.substring(0, 1).toUpperCase() + i.substring(1).toLowerCase();
                        counter++;
                    } else {
                        correct = false;
                    }
                    break;
                case 1:
                    if (is_team(i)) {
                        team = i.toLowerCase();
                        counter++;
                    } else {
                        correct = false;
                    }
                    break;
                case 2:
                    name = i;
                    counter++;
                    break;
                case 3:
                    for (char j : i.toCharArray()) {
                        if (!Character.isDigit(j)) {
                            correct = false;
                            break;
                        }
                        level = Integer.parseInt(i);
                    }
                    counter++;
            }
            if (!correct) {
                System.out.println("Введен неверный формат данных!!!");
                break;
            }

            if (counter == 4) {
                counter = 0;

                Class<?> clazz = Class.forName("pokemons." + type);
                Pokemon pokemon = (Pokemon) clazz.getConstructor(params).newInstance(name, level);

                if (team.equals("ally")) {
                    ally = true;
                    b.addAlly(pokemon);
                } else {
                    foe = true;
                    b.addFoe(pokemon);
                }
            }
        }

        if (correct) {
            if (ally && foe) {
                b.go();
            } else {
                System.out.println("Одна из команд пуста!!!");
            }
        }
    }
}