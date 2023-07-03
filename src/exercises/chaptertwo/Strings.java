package exercises.chaptertwo;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String alice = "Alice was beginning to get very tired of sitting by her sister on the bank," +
                " and of having nothing to do: once or twice she had peeped into the book her sister" +
                " was reading, but it had no pictures or conversations in it, 'and what is the use" +
                " of a book,' thought Alice 'without pictures or conversation?'";
        String alicePhrase = alice.toLowerCase();

        System.out.println("What word would you like to search for?");
        String userTerm = input.nextLine();

        if (alicePhrase.contains(userTerm)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        int index = alicePhrase.indexOf(userTerm);
        String newPhrase = alicePhrase.replace(userTerm, "");

        System.out.println("Your term is at index " + index + " and has a length of " + userTerm.length());
        System.out.println(newPhrase);

    }
}
