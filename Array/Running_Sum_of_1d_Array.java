package Array;

import java.util.Arrays;

public class Running_Sum_of_1d_Array {
    public static void main(String[] args) {
        int[]  arr={1,2,3,4,5};
        System.out.println(Arrays.toString(sumArray(arr)));

    }

    static int[] sumArray(int[] nums){
        int[] num=new int[nums.length];
        num[0]=nums[0];
        for (int i = 1; i < nums.length; i++) {
            num[i]=nums[i]+num[i-1];

        }
        return num;
    }


}

