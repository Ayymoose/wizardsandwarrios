package enemy;

public class Enemy {

    private int strength;
    private int dexterity;
    private int constitution;
    private int hp;
    private String type;
    private String name;

    public Enemy(int strength, int dexterity, int constitution, int hp, String type, String name) {
        this.strength = strength;
        this.dexterity = dexterity;
        this.constitution = constitution;
        this.hp = hp;
        this.type = type;
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public int getConstitution() {
        return constitution;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public void PrintCharacterStats() {
        System.out.println("Strength: " + strength);
        System.out.println("Dexterity: " + dexterity);
        System.out.println("Constitution: " + constitution);
        System.out.println("Hp: " + hp);
    }
}

