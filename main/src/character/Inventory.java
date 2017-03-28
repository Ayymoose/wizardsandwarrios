package character;

import java.util.ArrayList;
import java.util.Iterator;

public class Inventory {
	
	private ArrayList<Item> inventory = new ArrayList<Item>();
	
	public Inventory() {
		// Default inventory 
		inventory.add(new Item("Broken Sword","This is as useless as a blunt knife. But you can still do some damage with it..."));
		inventory.add(new Item("Magic Potion","Ooh! A mysterious magic potion! Who knows what it does?"));
		inventory.add(new Item("Pile of Ash","Why did you even pick this up?"));
		inventory.add(new Item("Map","Your trusty map!"));
		inventory.add(new Item("Apprentice's Staff","Basic staff for Clerics but not much use to others..."));
		inventory.add(new Item("Bottle of Slime","Eww this kicks up a stink but it seems effective against the undead..."));
	}
	
	// Add an item to the inventory 
	public void add(String name, String description) {
		inventory.add(new Item(name, description));
	}
	
	public void remove(int itemid) {
		inventory.remove(itemid);
	}
	
	
	public String toString() {
        Iterator iterator = inventory.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        return "";
	}

}


// Skeleton Marauder - Undead 
// Keltir            - Animal 

// Opal Beast        - Beast 
// Salamander        - Spirit

// Dire Wyrm         - Dragon
// Nightmare Lord    - Demon

