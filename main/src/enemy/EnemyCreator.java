package enemy;

import enemy.classes.*;

import java.util.Random;

public class EnemyCreator {

    public static Enemy create(int difficulty) {

        Enemy enemy = null;

        switch (difficulty) {
            case (1):
                enemy = new Undead(RandomNumber(0, 20), RandomNumber(0, 20), RandomNumber(0, 20), 6,
                        "Undead", "Skeleton Marauder");
                break;
            case (2):
                enemy = new Animal(RandomNumber(0, 20), RandomNumber(0, 20), RandomNumber(0, 20), 6,
                        "Animal", "Keltir");
                break;
            case (3):
                enemy = new Beast(RandomNumber(10, 20), RandomNumber(10, 20), RandomNumber(10, 20), 9,
                        "Beast", "Opal Beast");
                break;
            case (4):
                enemy = new Spirit(RandomNumber(10, 20), RandomNumber(10, 20), RandomNumber(10, 20), 9,
                        "Spirit", "Salamander");
                break;
            case (5):
                enemy = new Dragon(RandomNumber(15, 20), RandomNumber(15, 20), RandomNumber(15, 20), 12,
                        "Dragon", "Dire Wyrm");
                break;
            case (6):
                enemy = new Demon(RandomNumber(15, 20), RandomNumber(15, 20), RandomNumber(15, 20), 12,
                        "Demon", "Nightmare Lord");
                break;
            default:
                System.out.println("Uh oh...");
                break;
        }

        return enemy;
    }

    private static int RandomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }
}
