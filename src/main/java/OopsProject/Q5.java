package OopsProject;

import java.util.HashMap;

public class Q5 {
    public static void main(String[] args) {
        // Check if Two Strings are Anagrams: Given two strings, determine if they are anagrams, meaning
        //they contain the same characters in a different order. For example, "listen" and "silent" are
        //anagrams.

        String str1 = "listen";
        String str2 = "silent";

        if (str1.length() != str2.length()) {
            System.out.println("The strings are not anagrams.");
        }else {
            HashMap<Character, Integer> charCount = new HashMap<>();
            for (char ch : str1.toCharArray()) {
                if (charCount.containsKey(ch)) {
                    charCount.put(ch, charCount.get(ch) + 1);
                } else {
                    charCount.put(ch, 1);
                }
            }
            for (char ch : str2.toCharArray()) {
                if (!charCount.containsKey(ch) || charCount.get(ch) == 0) {
                    System.out.println("The strings are not anagrams");
                    return;
                }
                charCount.put(ch, charCount.get(ch) - 1);
            }
            System.out.println("The strings are anagrams");
        }
    }
}