package org.launchcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {

    public static void main(String[] args) {

        HashMap<String, Integer> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newStudent;

        System.out.println("Enter your students (or ENTER to finish): ");

        //Get student names and IDs
        do {

            System.out.println("Student: ");
            newStudent = input.nextLine();

            if (!newStudent.equals("")) {
                System.out.print("Student ID: ");
                Integer newId = input.nextInt();
                students.put(newStudent, newId);

                //Read in the newLine before looping back
                input.nextLine();
            }
        } while(!newStudent.equals(""));
        input.close();

        //Print class roster
        System.out.println("\nClass Roster: ");
        double sum = 0.0;

        for (Map.Entry<String, Integer> student : students.entrySet()) {
            System.out.println(student.getKey() + " :: " + student.getValue());
            sum += student.getValue();
        }

    }
}
