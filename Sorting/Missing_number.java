package Sorting;

import java.util.Arrays;

public class Missing_number {

    public static void main(String[] args) {
        int[] arr={0,1,2,4};
        System.out.println(missingNumber(arr));
    }

    public static int missingNumber(int[] nums){

        int i = 0;
        while ( i <nums.length ) {
            int correct =nums[i];
            if(nums[i]<nums.length && nums[i]!=nums[correct]){
                swap(nums, i , correct );
            }
            else{
                i++;
            }

        }
        // case 1
        for (int j = 0; j < nums.length; j++) {
            if(nums[j]!=j){
                return j;
            }

        }
        // case 2
        return nums.length;
    }


    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
