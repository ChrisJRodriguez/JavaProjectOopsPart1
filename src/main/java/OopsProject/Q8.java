package OopsProject;

import java.util.ArrayList;
import java.util.List;

public class Q8 {
    public static void main(String[] args) {
        // You have a list of strings and you want to keep only those that start with “A” and you want to
        //return them in lower case".

        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("Apple");
        list.add("Goodbye");
        list.add("Also");
        list.add("Hello");
        list.add("Arc");

        list.removeIf(x->x.startsWith("A"));

        System.out.println(list);
    }
}
