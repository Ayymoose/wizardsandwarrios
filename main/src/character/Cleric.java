package character;

public class Cleric extends BaseCharacter {

    private int hp;

    public Cleric(int strength, int dexterity, int constitution, int intelligence, int wisdom, String type, String name, int hp) {
        super(strength, dexterity, constitution, intelligence, wisdom, type, name);
        this.hp = hp;
    }
}
