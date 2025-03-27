package OopsProject;

import java.util.HashMap;

public class Q9 {
    public static void main(String[] args) {
        // Find the First Non-Repeating Character in a String: Given a string, find and return the first nonrepeating
        // character. For example, in the string "abracadabra", the first non-repeating character is 'c'.

        String str = "abracadabra";
        int [] freq = new int[256];

        for(char ch : str.toCharArray()){
            freq[ch]++;
        }

        for(char ch : str.toCharArray()){
            if(freq[ch] == 1){
                System.out.println(ch);
                break;
            }
        }
    }
}
