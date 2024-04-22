package org.launchcode;

//import java.util.Scanner;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice {


    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();
        //Loop through to add each integer 1-10 to nums ArrayList
        for (int i = 1; i < 11; i++) {
            nums.add(i);
        }

        System.out.println(nums);
        System.out.println(sumEven(nums));

        ArrayList<String> words = new ArrayList<>();
        words.add("cat");
        words.add("fish");
        words.add("sheep");
        words.add("ferret");
        words.add("penguin");
        words.add("squirrel");

        System.out.println(words);
        System.out.println(wordsOfFive(words));

    }
    public static int sumEven(ArrayList<Integer> arr) {
        int total = 0;
        for (int integer : arr) {
            if (integer % 2 == 0) {
                total += integer;
            }
        }
        return total;
    }
    
    public static String wordsOfFive(ArrayList<String> arr) {
        String word = "";

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word length: ");
        int numChars = input.nextInt();

        for (String string : arr) {
            if (string.length() == numChars) {
                word = string;
            } else {
                System.out.println("Invalid word length.");
                break;
            }
        }
        return word;
    }
}
