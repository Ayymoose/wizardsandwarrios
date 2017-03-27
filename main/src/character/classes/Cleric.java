package character.classes;

import character.BaseCharacter;

import java.util.Random;

public class Cleric extends BaseCharacter {

    private int hp;

    public Cleric(int strength, int dexterity, int constitution, int intelligence, int wisdom, String type, String name) {
        super(strength, dexterity, constitution, intelligence, wisdom, type, name);
        this.hp = (int) (RandomNumber() + (constitution * .2));
    }

    private int RandomNumber() {
        int min = 0;
        int max = 8;
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }

    //@Override
    public void PrintCharacterStats() {
        super.PrintCharacterStats();
        System.out.println("HP: " + hp);
    }
}
