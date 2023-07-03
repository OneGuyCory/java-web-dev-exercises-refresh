package exercises.chapterthree;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newStudent;

        System.out.println("Enter your students or ENTER to finish: ");

        do {
            System.out.println("Student: ");
            newStudent = input.nextLine();

            if(!newStudent.equals("")) {
                System.out.println("Student ID");
                Integer newId = input.nextInt();
                students.put(newId,newStudent);

                input.nextLine();
            }
        } while (!newStudent.equals(""));

        System.out.println("\nClass roster: ");

        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println(student.getValue() + " : " + student.getKey());
        }

    }
}
