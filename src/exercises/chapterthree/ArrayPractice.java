package exercises.chapterthree;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] numArr = {1, 1, 2, 3, 5, 8};
        String phrase = "I would not, could not, in a box. I would not, could not with a fox. " +
                "I will not eat them in a house. I will not eat them with a mouse.";

        for (int num : numArr) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }

        String[] strArr = phrase.split(" ");
        String[] sentences = phrase.split("\\.");

        System.out.println(Arrays.toString(strArr));
        System.out.println(Arrays.toString(sentences));

    }
}
