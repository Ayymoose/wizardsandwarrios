package character;

public class Item {
	
	private String description;
	private String name;
	private int id;
	private int type;
	private int damage;
	private int health;
	
	// type 
	// 0 - Can't be used as a weapon
	// 1 - Weapon
	// 2 - Used for status effects
	
	public Item(String name, String description, int id, int type, int damage, int health) {
		this.name = name;
		this.description = description;
		this.type = type;
		this.damage = damage;
		this.health = health;
		this.id = id;
	}
	
	public String toString() {
    	String format = "%-5s%-20s%s%n";
    	System.out.printf(format,id, name, description);
    	return "";
		//return name + "\t\t\t" + "Description: " + description;
	}
	
	public String getName() {
		return name;
	}
	
	public int getType() {
		return type;
	}
	
	public int getDamage() {
		return damage;
	}
	
	public int getHealth() {
		return health;
	}
/*
	public lookup(int itemid) {
		
	}*/
}
