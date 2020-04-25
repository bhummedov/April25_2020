package Review;

import java.util.*;

public class RemoveDublicate {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 1, 1, 12, 3));
        System.out.println(list);
        ArrayList<Integer> newList = removeDuplicates(list);
        System.out.println("Duplicates removed: " + newList);
    }

    public static <Integer> ArrayList<Integer> removeDuplicates(ArrayList<Integer> num) {
        ArrayList<Integer> newArr = new ArrayList<>();
        for (Integer number : num) {
            if (!newArr.contains(number)) {
                newArr.add(number);
            }
        }
        return newArr;
    }
}



