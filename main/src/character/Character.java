package character;

public class Character {

    private int strength;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int wisdom;
    private int hp;
    private int defence;
    private String type;
    private String name;
    private Inventory inventory = new Inventory();

    public Character(int strength, int dexterity, int constitution, int intelligence, int wisdom, int hp, int defence, String type, String name) {
        this.strength = strength;
        this.dexterity = dexterity;
        this.constitution = constitution;
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.hp = hp;
        this.defence = defence;
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

    public int getIntelligence() {
        return intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }
    
    public void setHP(int hp) {
    	this.hp = hp;
    }

    public int getDefence() {
        return defence;
    }

    public String getInventory() {
    	return inventory.toString();
    }

    public void PrintCharacterStats() {
        System.out.println("Strength: " + strength);
        System.out.println("Dexterity: " + dexterity);
        System.out.println("Constitution: " + constitution);
        System.out.println("Intelligence: " + intelligence);
        System.out.println("Wisdom: " + wisdom);
        System.out.println("Hp: " + hp);
    }
}
