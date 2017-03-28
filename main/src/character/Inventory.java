package character;

import java.util.ArrayList;
import java.util.Iterator;

public class Inventory {
	
	private ArrayList<Item> inventory = new ArrayList<Item>();
	
	public Inventory() {
		// Default inventory 
		inventory.add(new Item("Broken Sword","This is as useless as a blunt knife. But you can still do some damage with it...",1,5,0));
		inventory.add(new Item("Magic Potion","Ooh! A mysterious magic potion! Who knows what it does?",2,0,10));
		inventory.add(new Item("Pile of Ash","Why did you even pick this up?",1,1,0));
		inventory.add(new Item("Map","Your trusty map!",0,0,0));
		inventory.add(new Item("Apprentice's Staff","Basic staff for Clerics but not much use to others...",1,2,0));
		inventory.add(new Item("Bottle of Slime","Eww this kicks up a stink but it seems effective against the undead...",1,8,0));
	}
	
	// Add an item to the inventory 
	public void add(String name, String description, int type, int damage, int health) {
		inventory.add(new Item(name, description,type,damage, health));
	}
	
	public void remove(int itemid) {
		inventory.remove(itemid);
	}
	
	
	public String toString() {
        Iterator iterator = inventory.iterator();
        int i = 1;
        while (iterator.hasNext()) {
            System.out.println((i++)+ ") " + iterator.next());
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

