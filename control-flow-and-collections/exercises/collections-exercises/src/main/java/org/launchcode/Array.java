package org.launchcode;
import java.util.Arrays;
public class Array {
    public static void main(String [] args) {
        int[] array = {1, 1, 2, 3, 5, 8};

        for (int i : array) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }


        String phrase = "I would not, could not, in a box. I would not, " +
                "could not, with a fox. I will not eat them in a house. " +
                "I will not eat them with a mouse.";

        String[] wordArray = phrase.split(" ");
        System.out.println(Arrays.toString(wordArray));

        String[] phraseArray = phrase.split("\\.");
        System.out.println(Arrays.toString(phraseArray));
    }
}
