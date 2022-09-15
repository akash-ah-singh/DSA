package Array;

import java.util.Arrays;

public class Shuffle_the_Array {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,4,3,2,1};
//        int[] arr={2,5,1,3,4,7};
//        int[]  arr={1,1,2,2};
        int middle=arr.length/2;  // middle index number of array


        System.out.println(Arrays.toString(Shuffeld(arr,middle)));

    }

    static int[] Shuffeld(int[] nums , int mid){

        int Shu[] = new int[nums.length];
        Shu[0]=nums[0];
        Shu[1]=nums[mid];


        for (int i = 2; i<nums.length ; i++) {
            if(i%2!=0 ){
                Shu[i]=nums[mid+1];
                mid++;
            }
            else{
                Shu[i]=nums[i/2];

            }
        }
        return Shu;
    }
}
