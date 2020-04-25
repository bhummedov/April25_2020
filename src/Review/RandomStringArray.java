package Review;

import java.util.ArrayList;
import java.util.Iterator;

public class RandomStringArray {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<String>(10);
        String word;
        char rand;
        int num;
        for (int j = 0; j < 10; j++) {
            word = "";
            for (int i = 0; i < (int) (Math.random() * 11) + 1; i++) {
                num = (int) (Math.random() * 26) + 97;
                rand = (char) num;
                word += rand;
            }
            words.add(word);
        }
        //regular while
        int count = 0;
        while (count < words.size()) {
            System.out.println(words.get(count));
            count++;
        }
        //with Iterator
        System.out.println("-----------------");
        Iterator<String> iter = words.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}

