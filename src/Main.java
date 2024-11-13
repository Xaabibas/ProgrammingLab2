import pokemons.*;
import ru.ifmo.se.pokemon.Battle;

public class Main {
    static final String[] teams = {"ally", "foe"};
    static final String[] pokemons = {"castform", "corphish", "crawdaunt", "poliwag", "poliwhirl", "poliwrath"};

    public static boolean is_team(String team){
        for (String i : teams){
            if (i.equals(team.toLowerCase())){
                return true;
            }
        }
        return false;
    }

    public static boolean is_pokemon(String pokemon){
        for (String i : pokemons){
            if (i.equals(pokemon.toLowerCase())){
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
        String Class = "";
        String team = "";
        String name = "";
        int level = 1;
        boolean ally = false;
        boolean foe = false;

        for (String i : args){
            switch (counter){
                case 0:
                    if (is_pokemon(i)){
                        Class = i.toLowerCase();
                        counter++;
                    }
                    else{
                        correct = false;
                    }
                    break;
                case 1:
                    if (is_team(i)){
                        team = i.toLowerCase();
                        counter++;
                    }
                    else{
                        correct = false;
                    }
                    break;
                case 2:
                    name = i;
                    counter++;
                    break;
                case 3:
                    for (char j : i.toCharArray()){
                        if (!Character.isDigit(j)){
                            correct = false;
                            break;
                        }
                    level = Integer.parseInt(i);
                    }

                if (!correct){
                    System.out.println("Введен неверный формат данных!!!");
                    break;
                }

                if (counter == 3){
                    counter = 0;
                    if (team.equals("ally")){
                        ally = true;
                    }
                    else{
                        foe = true;
                    }
                    switch (Class){
                        case "castform":
                             if (team.equals("ally")){
                                 b.addAlly(new Castform(name, level));
                             }
                             else{
                                 b.addFoe(new Castform(name, level));
                             }
                             break;
                        case "corphish":
                            if (team.equals("ally")){
                                b.addAlly(new Corphish(name, level));
                            }
                            else{
                                b.addFoe(new Corphish(name, level));
                            }
                            break;
                        case "crawdaunt":
                            if (team.equals("ally")){
                                b.addAlly(new Crawdaunt(name, level));
                            }
                            else{
                                b.addFoe(new Crawdaunt(name, level));
                            }
                            break;
                        case "poliwag":
                            if (team.equals("ally")){
                                b.addAlly(new Poliwag(name, level));
                            }
                            else{
                                b.addFoe(new Poliwag(name, level));
                            }
                            break;
                        case "poliwhirl":
                            if (team.equals("ally")){
                                b.addAlly(new Poliwhirl(name, level));
                            }
                            else{
                                b.addFoe(new Poliwhirl(name, level));
                            }
                            break;
                        case "poliwrath":
                            if (team.equals("ally")){
                                b.addAlly(new Poliwrath(name, level));
                            }
                            else{
                                b.addFoe(new Poliwrath(name, level));
                            }
                    }
                }
            }
        }
        if (correct){
            if (ally&&foe){
                b.go();
            }
            else{
                System.out.println("Одна из команд пуста!!!");
            }
        }
    }
}