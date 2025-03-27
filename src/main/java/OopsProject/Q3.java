package OopsProject;

public class Q3 {
    public static void main(String[] args) {
        // Reverse a String: Write a function to reverse a given string. For example, given the input "Hello",
        //the output should be "olleH"

        String str = "Hello";
        StringBuilder strNew = new StringBuilder(str);

        strNew.reverse();
        System.out.println(strNew.toString());

    }
}
