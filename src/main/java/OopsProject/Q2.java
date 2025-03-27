package OopsProject;

public class Q2 {
    public static void main(String[] args) {
        // Find out how many alpha characters are present in a string?

        String str = "Hello World5#@%#@431...";
        int count = 0;

        for(char ch : str.replaceAll("[^a-zA-z]","").toCharArray()){
            count++;
        }
        System.out.println(count);
    }
}
