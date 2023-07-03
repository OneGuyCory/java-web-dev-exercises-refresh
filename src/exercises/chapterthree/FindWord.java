package exercises.chapterthree;

import java.util.ArrayList;

public class FindWord {
    public static String printWord(ArrayList<String> words, int searchlength) {
        ArrayList<String> foundWords = new ArrayList<>();

        for (String word : words) {
            if (word.length() == searchlength) {
                foundWords.add(word);
            }
        }
        return foundWords.toString();

    }
}
