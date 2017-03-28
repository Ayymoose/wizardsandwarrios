import character.Character;
import character.CharacterCreator;
import enemy.Enemy;
import enemy.EnemyCreator;

public class Main {
    public static void main(String[] args) {
        Character character = CharacterCreator.Create();
        Enemy enemy = EnemyCreator.create(1);
        enemy.PrintCharacterStats();

    }
}
