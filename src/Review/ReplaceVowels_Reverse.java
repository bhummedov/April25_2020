package Review;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ReplaceVowels_Reverse {
    public static void main(String[] args) {
        String str = "umbrella";
        char[] word = str.toCharArray();
        List<Character> lst = new LinkedList<>();
        for (char a : word)
            lst.add(a);
        Collections.reverse(lst);
        System.out.println(lst);
        for (char c : str.toCharArray()) {
            if (c=='a') {
                str+= '0';
            }
            else if ( c=='e') {
                str += '1';
            }
           else if (c=='o') {
                str+= '3';
            }
            else if (c=='u') {
                str += '3';
            }

            else
                str+=c;
        }
        System.out.println("\t"+str);
        System.out.println(str+"aca");

        }
    }


