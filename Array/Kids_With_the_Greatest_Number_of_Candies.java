package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Kids_With_the_Greatest_Number_of_Candies {
    public static void main(String[] args) {

        int[] arr={2,3,5,1,7};
        int target=3;
//        int[] arr={4,2,1,1,2};
//        int target=1;
//        int[] arr = {12, 1, 12};
//        int target = 10;


//        System.out.println(Arrays.toString(list(arr,target)));
        System.out.println(xyz(arr, target));

    }


    static List<Boolean>  xyz(int[] candies, int extraCandies) {


        int max = 0;
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > max) {
                max = candies[i];
            }
        }
        ArrayList<Boolean> list = new ArrayList<>();
        for (int j = 0; j < candies.length; j++) {
            if (candies[j] + extraCandies >= max) {
                list.add(true);
            } else {
                list.add(false);
            }
        }
        return list;
    }

//    static boolean[] list(int[] nums, int targetValue) {
//
//
//        boolean[] New = new boolean[nums.length];
//        for (int i = 0; i < nums.length; i++) {
//            int mul = nums[i] + targetValue;
//            for (int j = 0; j < nums.length; j++) {
//                if (mul >= nums[j]) {
//
//                    New[i] = true;
//                }
//
//                else {
//
//                    New[i] = false;
//
//                }
//
//            }
//
//
//        }
//
//        return New;
//    }


}


