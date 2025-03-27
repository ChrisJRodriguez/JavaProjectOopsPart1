package OopsProject;

import java.util.ArrayList;
import java.util.HashSet;

public class Q10 {
    public static void main(String[] args) {
        // How can you remove all duplicates from ArrayList?

        ArrayList<String> duplicates = new ArrayList<>();
        duplicates.add("Hello");
        duplicates.add("Hello");
        duplicates.add("Hello");
        duplicates.add("Goodbye");
        duplicates.add("Yo");
        duplicates.add("What's up!");
        duplicates.add("No");

        HashSet<String> set = new HashSet<>(duplicates);
        set.clear();
        set.addAll(duplicates);

        System.out.println(set);
    }
}
