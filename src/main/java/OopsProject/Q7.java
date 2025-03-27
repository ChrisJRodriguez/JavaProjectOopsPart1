package OopsProject;

public class Q7 {
    public static void main(String[] args) {
        // Count the Number of Words in a String: Write a function to count the number of words in a given
        //string. Words are separated by spaces or punctuation. For example, the input "Hello, world!"
        //should return 2.

        String str = "Hello, world!, How's it going?";

        String[] words = str.split("[^a-zA-Z0-9']+");
        System.out.println(words.length);
    }
}
