import adventure.Adventure;
import battle.Battle;
import character.Character;
import character.CharacterCreator;
import enemy.Enemy;
import enemy.EnemyCreator;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        Character character = CharacterCreator.Create();
        Enemy enemy = EnemyCreator.create(6);
        Battle battle = new Battle(character, enemy);
        battle.engage();
        //Adventure.startAdventure(new File("E:\\Work\\Projects\\wizardsandwarrios\\main\\src\\adventure\\levels\\Level1"));

    }
}
