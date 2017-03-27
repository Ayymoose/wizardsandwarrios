package character.classes;

import character.BaseCharacter;

import java.util.Random;

public class Fighter extends BaseCharacter {

    private int hp;

    public Fighter(int strength, int dexterity, int constitution, int intelligence, int wisdom, String type, String name) {
        super(strength, dexterity, constitution, intelligence, wisdom, type, name);
        this.hp = (int) (RandomNumber() + (constitution * .2));
    }

    private int RandomNumber() {
        int min = 0;
        int max = 12;
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }
}
