package OopsProject;

import java.util.HashMap;

public class Q6 {
    public static int countVowels(String input){
        int count = 0;
        String vowels = "aeiouAEIOU";

        for(char ch : input.toCharArray()){
            if(vowels.indexOf(ch) != -1){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        // Create a method to count how many vowels are present in a string “documentation”

        String word = "documentation";
        System.out.println(countVowels(word));

    }
}
