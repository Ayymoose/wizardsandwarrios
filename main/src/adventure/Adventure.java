package adventure;

import java.io.*;
import java.util.ArrayList;

public class Adventure {

    public static void startAdventure(File file) {

        ArrayList<String> options = new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new FileReader(file))) {
            for(String line; (line = br.readLine()) != null; ) {
                System.out.println(line);
                options = parseLine(line);

                for (String option: options) {
                    System.out.println(option);
                }
                System.out.println("line end");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static ArrayList<String> parseLine(String line) {

        ArrayList<String> options = new ArrayList<>();

        String[] words = line.split("\\s+");
        for (int i = 0; i < words.length; i++) {
            if (words[i].contains("|")) {
                options.add(words[i].replace("|", ""));
            }
        }

        return options;
    }
}
