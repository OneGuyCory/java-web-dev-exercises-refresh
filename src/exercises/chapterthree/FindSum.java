package exercises.chapterthree;

import java.util.ArrayList;

public class FindSum {

    public static int evenSum(ArrayList<Integer> numbers) {
        int sum = 0;
        for (int number : numbers) {
            if (number % 2 ==0) {
                sum += number;
            }
        }
        return sum;
    }
}
