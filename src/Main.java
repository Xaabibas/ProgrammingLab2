import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;

import java.lang.reflect.InvocationTargetException;

public class Main {
    static final String[] teams = {"ally", "foe"};

    public static boolean is_team(String team) {
        for (String i : teams) {
            if (i.equals(team.toLowerCase())) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        // Данный вводим в формате Class Team Name Level
        // Class - класс покемона
        // Team - команда покемона
        // Name - имя покемона
        // Level - уровень покемона

        Battle b = new Battle();

        int counter = 0;
        boolean correct = true;
        boolean ally = false;
        boolean foe = false;
        String[] data = new String[4];

        for (String i : args) {
            switch (counter) {
                case 0:
                    data[counter] = i.substring(0, 1).toUpperCase() + i.substring(1).toLowerCase();
                    break;
                case 1:
                    correct = is_team(i.toLowerCase());
                    if (correct) {
                        data[counter] = i.toLowerCase();
                    }
                    break;
                case 2:
                    data[counter] = i;
                    break;
                case 3:
                    for (char j : i.toCharArray()) {
                        if (!Character.isDigit(j)) {
                            correct = false;
                            break;
                        }
                    }
                    data[counter] = i;
                    break;
            }
            counter++;
            if (!correct) {
                System.out.println("Введен неверный формат данных!!!");
                break;
            }
            if (counter == 4) {
                counter = 0;

                try {
                    Class<?> myClass = Class.forName("pokemons." + data[0]);
                    Pokemon pokemon = (Pokemon) myClass.getConstructor(String.class, int.class).newInstance(data[2],
                            Integer.parseInt(data[3]));
                    if (data[1].equals("ally")) {
                        ally = true;
                        b.addAlly(pokemon);
                    } else {
                        foe = true;
                        b.addFoe(pokemon);
                    }
                } catch (ClassNotFoundException | InvocationTargetException | InstantiationException |
                         IllegalAccessException | NoSuchMethodException e) {
                    throw new RuntimeException(e);
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