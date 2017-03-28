package battle;

import java.util.Random;
import java.util.Scanner;
import character.Character;
import enemy.Enemy;

public class Battle {
	
	private Character character;
	private Enemy enemy;
	private Random random = new Random();
	
	public Battle(Character character, Enemy enemy) {
		this.character = character;
		this.enemy = enemy;
	}
	
	// Engages character and enemy in turn based battle
	public void engage() {
		int enemyHP = enemy.getHp();
		int playerHP = character.getHp();

		System.out.println("You are now battling " + enemy.getName() + "[" + enemy.getHp() + "/" + enemyHP + "]");
		
		// Enemy description
		String type = enemy.getType();
		if (type.equals("Undead")) {
			System.out.println(enemy.getName() + " brandishes his honed bone sword and shield!");
		} else if (type.equals("Animal")) {
			System.out.println(enemy.getName() + " unleashes a deadly howl that pierces the night sky!");
		} else if (type.equals("Beast")) {
			System.out.println(enemy.getName() + " bares its crystal fangs at you!");
		} else if (type.equals("Spirit")) {
			System.out.println("Flames openly spill over the back of the " + enemy.getName() + " onto the floor!");
		} else if (type.equals("Dragon")) {
			System.out.println(enemy.getName() + " flaps its vast wings that blows everything away!");
		} else if (type.equals("Demon")) {
			System.out.println(enemy.getName() + " stares into your soul with his red eyes!");
		}
	
		//
		Scanner scanner = new Scanner(System.in);
		int action;

		Random random = new Random();
		//
		
		// Battle loop (Player side)
        while (true) {
        	System.out.println(character.getName() + " [" + character.getHp() + "/" + playerHP + "]");
        	printOptions(); 
        	action = Integer.parseInt(scanner.nextLine()); 
            switch (action) {
            case 1: // Attack
            	int playerDamage = (character.getStrength() - random.nextInt(5)) + random.nextInt(5);
            	int enemyDamage =  random.nextInt(5) + ((enemy.getStrength() - random.nextInt(3)) + random.nextInt(20)) / character.getDefence() ;
            	playerAttack(playerDamage);
            	enemyAttack(enemyDamage);
            	break;
            case 2: // Defend
            	int defendDamage = ((enemy.getStrength() - random.nextInt(3)) + random.nextInt(20)) / (character.getDefence() * 2);
            	playerDefend(defendDamage);
            	break;
            case 3: // Use some item from your inventory
            	character.getInventory();
            	break;
            case 4: // Try to run/
                if (random.nextInt(5) == 2) {
                	System.out.println("You barely managed to run away!");
                	break;
                } else {
                	System.out.println("The " + enemy.getName() + " blocks your path and you cannot run!");
                }
            	break;
            default: printOptions(); break;
            }
            
            // Enemy died
            if (enemy.getHp() <= 0) {
            	System.out.println("You defeated the " + enemy.getName() + "!");
        		//System.out.println("It dropped " + enemy.getDrop());
            	break;
            } else {
            	System.out.println(enemy.getName() + "[" + enemy.getHp() + "/" + enemyHP + "]");
            }
            // Character died
            if (character.getHp() <= 0) {
            	System.out.println("Oh no... You were killed in battle...");
            	break;
            }
        }
		
	}
	
	private void enemyAttack(int damage) {
    	// Enemy attack 
    	System.out.println("The " + enemy.getName() + " attacks you!");
    	System.out.println("The " + enemy.getName() + " dealt " + damage + " damage to you!");
    	// Decrement player HP 
    	character.setHP(character.getHp()-damage);  
    	if (damage <= 2) {
    		System.out.println("It hardly did any damage..."); 
    	} else if (damage > 2 && damage <= 6) {
    		System.out.println("The attack dents your armour but you are still hurt!"); 
    	} else if (damage > 6) {
    		System.out.println("The overwhelming blow sweeps you off your feet!"); 
    	}
	}
	
	private void playerAttack(int damage) {
    	// Player attack 
    	System.out.println("You strike the " + enemy.getName() + "!");
    	System.out.println("You dealt " + damage + " damage!");
    	// Decrement enemy HP 
    	enemy.setHP(enemy.getHp()-damage);  
    	if (damage <= 2) {
    		System.out.println("It hardly did any damage..."); 
    	} else if (damage > 2 && damage <= 6) {
    		System.out.println("You struck a well aimed blow!"); 
    	} else if (damage > 6) {
    		System.out.println("The " + enemy.getName() + " staggers back from your attack!"); 
    	}
	}
	
	private void playerDefend(int damage) {
		System.out.println("You brace for impact...");
		enemyAttack(damage);
	}
	
	private void printOptions() {
		System.out.println("What will you do?");
		System.out.println("------------------");
		System.out.println("(1) Attack");
		System.out.println("(2) Defend");
		System.out.println("(3) Inventory");
		System.out.println("(4) Run");
		System.out.println("------------------");
	}
	

}
