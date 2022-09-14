package Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Concatenation_of_Array {
    public static void main(String[] args) {
//        int[] arr={1,2,1};
        int[] arr={1,3,2,1};
        System.out.println(Arrays.toString(new_array(arr)));

    }

    static int[] new_array(int[] arr1){
        int[] nums=new int[arr1.length + arr1.length];

        for (int i = 0; i <arr1.length; i++) {
            nums[i]=arr1[i];
            nums[i+arr1.length]=arr1[i];
        }

        return nums;
    }

}
