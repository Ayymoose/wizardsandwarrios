package battle;

import java.util.Random;
import java.util.Scanner;
import character.Character;
import enemy.Enemy;

public class Battle {
	
	private Character character;
	private Enemy enemy;
	
	public Battle(Character character, Enemy enemy) {
		this.character = character;
		this.enemy = enemy;
	}
	
	// Engages character and enemy in turn based battle
	public void engage() {
		System.out.println("You are now battling " + enemy.getName());

		// Print message depending on enemy 
		System.out.println(enemy.getName() + " stands before you exerting its pressure with flames erupting from it's mouth!");
		// ...
		
		printOptions();
		
		Scanner scanner = new Scanner(System.in);
		int action;
		
		//
	
		
		//
		
		// Battle loop (Player side)
        while (true) {
        	action = Integer.parseInt(scanner.nextLine()); 
            switch (action) {
            case 1: // Attack
            	System.out.println("You strike the " + enemy.getName());
            	
            	int damage = 4; 

            	// Decrement enemy HP 
            	enemy.setHP(enemy.getHp()-damage);
            	
            	// Damage 
            	System.out.println("You stike the " + enemy.getName());
            	
            	if (damage <= 2) {
            		System.out.println("It hardly did any damage..."); 
            	} else if (damage > 2 && damage <= 6) {
            		System.out.println("You struck a well aimed blow!"); 
            	} 
            	
            	
            	break;
            case 2: // Defend
            	System.out.println("You brace for impact...");
            	break;
            case 3: // Use some item from your inventory
            	
            	break;
            case 4: // Try to run/
                int min = 0;
                Random random = new Random();
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
            	System.out.println("You defeated the " + enemy.getName());
        		//System.out.println("It dropped " + enemy.getDrop());
            	break;
            }
            // Character died
            if (character.getHp() <= 0) {
            	System.out.println("Oh no... You were killed in battle...");
            	break;
            }
        }
		
	}
	
	private void printOptions() {
		System.out.println("What will you do?");
		System.out.println("------------------");
		System.out.println("1) Attack");
		System.out.println("2) Defend");
		System.out.println("3) Inventory");
		System.out.println("4) Run");
		System.out.println("------------------");
	}

}
