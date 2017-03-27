package character;


import character.classes.*;

import java.util.Random;
import java.util.Scanner;

public class CharacterCreator {

    public static BaseCharacter Create() {
        Scanner sc = new Scanner(System.in);
        String characterName;

        String[] characterTypes = {"Fighter", "Paladin", "Barbarian", "Cleric", "Rouge", "Druid"};
        int characterClass = ClassChooser();

        System.out.println("Enter the name of your character");
        characterName = sc.nextLine();

        BaseCharacter newCharacter = null;
        switch (characterClass) {
            case 1:
                newCharacter = new Fighter(RandomNumber(), RandomNumber(), RandomNumber(), RandomNumber(),
                        RandomNumber(), characterTypes[characterClass], characterName);
                break;
            case 2:
                newCharacter = new Paladin(RandomNumber(), RandomNumber(), RandomNumber(), RandomNumber(),
                        RandomNumber(), characterTypes[characterClass], characterName);
                break;
            case 3:
                newCharacter = new Barbarian(RandomNumber(), RandomNumber(), RandomNumber(), RandomNumber(),
                        RandomNumber(), characterTypes[characterClass], characterName);
                break;
            case 4:
                newCharacter = new Cleric(RandomNumber(), RandomNumber(), RandomNumber(), RandomNumber(),
                        RandomNumber(), characterTypes[characterClass], characterName);
                break;
            case 5:
                newCharacter = new Rouge(RandomNumber(), RandomNumber(), RandomNumber(), RandomNumber(),
                        RandomNumber(), characterTypes[characterClass], characterName);
                break;
            case 6:
                newCharacter = new Druid(RandomNumber(), RandomNumber(), RandomNumber(), RandomNumber(),
                        RandomNumber(), characterTypes[characterClass], characterName);
                break;
            default:
                System.out.println("Uh oh...");
                break;
        }

        System.out.println("Your character stats have been randomly rolled for you: ");
        System.out.println();
        System.out.println("You are the " + newCharacter.getType() + " who goes by the name " + newCharacter.getName());
        System.out.println("Your stats are:");
        newCharacter.PrintCharacterStats();

        return newCharacter;
    }

    private static int ClassChooser() {
        Scanner sc = new Scanner(System.in);
        String input;

        while (true) {
            System.out.println("Pick a character from the list (enter a number) ");
            System.out.println("1) Fighter");
            System.out.println("2) Paladin");
            System.out.println("3) Barbarian");
            System.out.println("4) Cleric");
            System.out.println("5) Rouge");
            System.out.println("6) Druid");
            input = sc.nextLine();

            if (Integer.parseInt(input) >= 1 && Integer.parseInt(input) <= 6) {
                break;
            } else {
                System.out.println("Please enter a number from the list");
                System.out.println();
            }
        }

        return Integer.parseInt(input) - 1;
    }

    private static int RandomNumber() {
        int min = 0;
        int max = 20;
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }
}
