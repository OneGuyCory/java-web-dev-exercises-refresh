package org.launchcode.java.studios.countingcharacters;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingCharacters {
    public static void main(String[] args) throws IOException {
        HashMap<Character, Integer> countedCharacters = new HashMap();
        Scanner input = new Scanner(System.in);
        System.out.println("What phrase would you like to count?");
        String phrase = input.nextLine().toLowerCase();
//        String phrase = "If the product of two terms is zero then common sense says at least one of" +
//                " the two terms has to be zero to start with. So if you move all the terms over" +
//                " to one side, you can put the quadratics into a form that can be factored allowing" +
//                " that side of the equation to equal zero. Once you’ve done that, it’s pretty " +
//                "straightforward from there.";
        char[] charactersInPhrase = phrase.replaceAll("[^a-zA-Z]", "").toLowerCase().toCharArray();


        for (char character : charactersInPhrase) {
            if (!countedCharacters.containsKey(character)) {
                countedCharacters.put(character, 1);
            } else {
                countedCharacters.put(character, countedCharacters.get(character) + 1);
            }
        }

        for(Map.Entry<Character, Integer> letter : countedCharacters.entrySet()) {
            System.out.println(letter.getKey() + ":" + letter.getValue());
        }

    }
}
