package Review;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class BinaryToDecimal {
    public static void main(String[] args) {
            List<Integer> nums = new LinkedList<>(Arrays.asList(1,0,0,0,0,0));
            System.out.println(convertToDecimal(nums));

        }
        public static int convertToDecimal(List<Integer> nums){
            int result=0;
            List<Integer> powers = new ArrayList<>();
            for (int i = nums.size()-1; i >= 0 ; i--) {
                powers.add((int)Math.pow(2,i));
            }
            System.out.println(nums);
            System.out.println(powers);
            for(int i =0 ; i < nums.size() ; i++ ){
                result += nums.get(i)*powers.get(i);
            }
            return result;
        }
    }