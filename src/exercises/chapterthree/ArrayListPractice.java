package exercises.chapterthree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<String> words = new ArrayList<>();

        Collections.addAll(words, "Susie", "Cory", "Bye", "Hi", "A");
        Collections.addAll(numbers, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 );

        System.out.println("What length word would you like to print?");
        int searchLength = input.nextInt();

        System.out.println(FindSum.evenSum(numbers));
        System.out.println(FindWord.printWord(words, searchLength));

    }
}
