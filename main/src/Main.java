import adventure.Adventure;
import battle.Battle;
import character.Character;
import character.CharacterCreator;
import enemy.Enemy;
import enemy.EnemyCreator;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	System.out.println( " __          ___                  _                       _  __          __             _                ");
    	System.out.println(					" \\ \\        / (_)                | |                     | | \\ \\        / /            (_)               ");
    	System.out.println(					"  \\ \\  /\\  / / _ ______ _ _ __ __| |___    __ _ _ __   __| |  \\ \\  /\\  / /_ _ _ __ _ __ _  ___  _ __ ___ ");
    	System.out.println(					"   \\ \\/  \\/ / | |_  / _` | '__/ _` / __|  / _` | '_ \\ / _` |   \\ \\/  \\/ / _` | '__| '__| |/ _ \\| '__/ __|");
    	System.out.println(					"    \\  /\\  /  | |/ / (_| | | | (_| \\__ \\ | (_| | | | | (_| |    \\  /\\  / (_| | |  | |  | | (_) | |  \\__ \\");
    	System.out.println(					"     \\/  \\/   |_/___\\__,_|_|  \\__,_|___/  \\__,_|_| |_|\\__,_|     \\/  \\/ \\__,_|_|  |_|  |_|\\___/|_|  |___/");
    	Character character = CharacterCreator.Create();
        
    	System.out.println("You wake up at the dead of night by a noise.");
    	System.out.println("The ashes of your camp fire dimly light the surrounding area but you still cannot see.");
    	System.out.println("The noise grows louder and the bushes around you seem to be getter closer");
    	System.out.println("What do you do?");
    	System.out.println();
    	System.out.println("1) Go back to sleep. It's probably just the wind...");
    	System.out.println("2) Investigate! There's no such thing as 'It's just the wind'!");
    	System.out.println("3) Shout out into the darkness saying you have multiple people in your party hoping whatever is out there will call your bluff...");
        System.out.println("4) Impale on your sword");
    	
    	Scanner sc = new Scanner(System.in);
    	
    	while (true) {
	    	int option = Integer.parseInt(sc.nextLine());
	    	switch (option) {
	    	case 1:
	    		System.out.println("You go back to sleep. The strong wind howls and the growling grows even louder. You wake up and draw your sword but then you hear a quick slash and look up to see your headless body on the ground...");
	    		System.out.println("GAME OVER!");
	    		System.exit(0);
	    		break;
	    	case 2:
		    	System.out.println("You investigate!");
		    	System.out.println("Slowly drawing your sword, you thrust it into the bushes hoping it won't hurt any animals that are there.");
		    	System.out.println("The sword strikes something hard following by terrible growl.");
		    	System.out.println("Oh no! A monster springs out from the bushes!");
		      	Enemy enemy = EnemyCreator.create(6);
		        Battle battle = new Battle(character, enemy);
		        battle.engage();
		        System.out.println("Now you know that, there's no such thing as 'It's just the wind'!");
				System.out.println("THE END");
				System.exit(0);
				break;
	    	case 3: 
		    	System.out.println("The noise stops but suddenly turns into a terrible scream!");
		    	System.out.println("The last thing you ever remember was seeing the red eyes in the bushes devour your insides from your lifeless body...");
		    	System.out.println("GAME OVER!");
		    	System.exit(0);
				break;
	    	case 4:
		    	System.out.println("You draw your sword and thrust it into your stomach. Intense pain follows by blood pouring from your gaping wound. You bleed out. Now why did you do that?");
		    	System.out.println("GAME OVER!");
		    	System.exit(0);
				break;
		    default: break;
	    	}
    	}
    	
        //Adventure.startAdventure(new File("E:\\Work\\Projects\\wizardsandwarrios\\main\\src\\adventure\\levels\\Level1"));

    }
}
