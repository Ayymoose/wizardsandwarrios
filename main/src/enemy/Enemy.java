package enemy;

import character.Inventory;

public class Enemy {

    private int strength;
    private int dexterity;
    private int constitution;
    private int hp;
    private int defence;
    private String type;
    private String name;
    private Inventory droplist;

    public Enemy(int strength, int dexterity, int constitution, int hp, int defence, String type, String name) {
        this.strength = strength;
        this.dexterity = dexterity;
        this.constitution = constitution;
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

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }
    
    public void setHP(int hp) {
    	this.hp = hp;
    }

    public int getHp() {
        return hp;
    }

    /*
    public Item getDrop() {
    	return droplist.
    }*/

    public int getDefence() {
        return defence;
    }

    public void PrintCharacterStats() {
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Strength: " + strength);
        System.out.println("Dexterity: " + dexterity);
        System.out.println("Constitution: " + constitution);
        System.out.println("Hp: " + hp);
    }
}

