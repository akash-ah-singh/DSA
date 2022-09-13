package Array;

import java.util.Arrays;

public class Build_Array_from_Permutation {
    public static void main(String[] args) {
//        int[] arr={0,2,1,5,3,4};
        int[] arr={5,0,1,2,3,4};
        System.out.println(Arrays.toString(array(arr)));
    }


    static int[] array(int[] nums){
        int[] a1=new int[nums.length];
        for (int i = 0; i <nums.length ; i++) {
            a1[i]=nums[nums[i]];

        }
        return a1;

    }

}
