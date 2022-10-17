package Sorting;

import java.util.Arrays;

public class Bubble_sort {
    public static void main(String[] args) {
        int []  arr= {-11 ,-3 ,5, 3, 7, -10};
        BS(arr);

    }


    static void BS(int[] nums){

        for (int i = 0; i < nums.length ; i++) {
            for (int j = 1; j < nums.length-i; j++) {
                if(nums[j]<nums[j-1]){
                    int temp=nums[j];
                    nums[j]=nums[j-1];
                    nums[j-1]=temp;

                }

            }

        }
        System.out.println(Arrays.toString(nums));
    }

}
