package org.launchcode;

import java.util.HashMap;
import java.util.Map;
public class CountingCharacters {

    public static void main(String[] args) {
        
        String phrase = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero " +
                "to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be " +
                "factored allowing that side of the equation to equal zero. Once you've done that, it's pretty straightforward from there.";

        //Converts phrase to an array of characters
        char[] charactersInString = phrase.toCharArray();

        //Initialize HashMap which will keep track of character counts
        HashMap<Character, Integer> counts = new HashMap<>();


        //Loop through charactersInString and push each character to key, counting each iteration in value
        for (char c : charactersInString) {
            if (!counts.containsKey(c)) {
                counts.put(c, 1);
            } else {
                int currentCount = counts.get(c);
                counts.put(c, currentCount + 1);
            }
        }
        for (Map.Entry<Character, Integer> count : counts.entrySet()) {
            System.out.println(count.getKey() + " :: " + count.getValue());
        }   
    }
}
