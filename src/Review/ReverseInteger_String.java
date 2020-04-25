package Review;

import java.util.*;

public class ReverseInteger_String{
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        Collections.sort(list, Comparator.reverseOrder());
        System.out.println(list);
        List<String> fruits = new ArrayList<>(List.of("Apple","Banana","Peach","Strawberry"));
        Collections.sort(fruits,Comparator.reverseOrder());
        System.out.println(fruits);
        String x="";
        for(int i=0 ; i < fruits.size() ; i++) {
            StringBuilder reversed = new StringBuilder(fruits.get(i));
            reversed.reverse();
            reversed.toString();
            x+=reversed;
            fruits.set(i,x);
            x="";
        }
        System.out.println(fruits);
    }
}

