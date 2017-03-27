package character;

public class Item {
	
	private String description;
	private String name;
	
	public Item(String name, String description) {
		this.name = name;
		this.description = description;
	}
	
	public String toString() {
		return "Name: " + name + "\t\t\t" + "Description: " + description;
	}
/*
	public lookup(int itemid) {
		
	}*/
}
