package Array;

import java.util.Arrays;

public class How_Many_Numbers_Are_Smaller_Than_the_Current_Number {
    public static void main(String[] args) {
        int[] arr1={8,1,2,2,3};
        int[] arr2={6,5,4,8};
        int[] arr3={7,7,7,7};

        System.out.println(Arrays.toString(newArray(arr1)));
        System.out.println(Arrays.toString(newArray(arr2)));
        System.out.println(Arrays.toString(newArray(arr3)));

    }

    static int[] newArray(int[] nums){
        int[] New=new int[nums.length];

        for(int i =0;i<nums.length;i++){
            int count=0;
            for (int j=0 ;j<nums.length;j++){
                if(nums[i]>nums[j]){
                    count++;
                }
            }
            New[i]=count;
        }
        return New;
    }
}


