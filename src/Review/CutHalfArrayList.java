package Review;

import java.util.ArrayList;
import java.util.Arrays;

public class CutHalfArrayList {
    public static void main(String[] args) {
        // Cut half ArrayList
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        System.out.println("Integer in ArrayList= " + list);
        ArrayList<Integer> listLeft = new ArrayList<Integer>();
        ArrayList<Integer>listRight = new ArrayList<>();
        for (int i = 0; i < list.size() / 2; i++) {
            listLeft.add(list.get(i));
        }
        System.out.println(listLeft);

    // Combine Two ArrayList
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(4,5,6,7));
        list1.addAll(list2);
        System.out.println(list1);
    }
}

