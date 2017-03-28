package character;

public class Item {
	
	private String description;
	private String name;
	private int type;
	private int damage;
	private int health;
	
	// type 
	// 0 - Can't be used as a weapon
	// 1 - Can be used as a weapon
	// 2 - Used for status effects
	
	public Item(String name, String description, int type, int damage, int health) {
		this.name = name;
		this.description = description;
		this.type = type;
		this.damage = damage;
		this.health = health;
	}
	
	public String toString() {
		return name + "\t\t\t" + "Description: " + description;
	}
/*
	public lookup(int itemid) {
		
	}*/
}
