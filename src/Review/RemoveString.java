package Review;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveString {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Java","again", "Java", "give", "us", "a", "break", "this", "month"));
        System.out.println(list);
        removeDuplicates(list);
    }
    public static void removeDuplicates(ArrayList<String> str) {
        ArrayList<String> newArr = new ArrayList<>();
        for (String word : str) {
            if (!newArr.contains(word)) {
                newArr.add(word);
            }
        }
        System.out.println(newArr);
    }
}

