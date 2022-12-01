package Sorting;
import java.util.Arrays;


public class Cyclic_sort {
    public static void main(String[] args) {
        int[] arr={3,5,2,1,4};
        sort(arr);
        System.out.println(Arrays.toString(arr));


    }

    static void sort(int[] nums){

        int i = 0;
        while ( i <nums.length ) {
            int correct =nums[i]-1;

            if(nums[i]!=nums[correct]){
                swap(nums, i , correct );
            }
            else{
                i++;
            }

        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }



//    Using for-loop --------------------------->


//    static void sort(int[] nums){
//
//        for (int i = 0; i <nums.length ;) {
//            int correct =nums[i]-1;
//
//            if(nums[i]!=nums[correct]){
//                swap(nums, i , correct );
//            }
//            else {
//                i++;
//            }
//
//        }
//        System.out.println(Arrays.toString(nums));
//    }


//    static void swap(int[] arr, int first, int second) {
//        int temp = arr[first];
//        arr[first] = arr[second];
//        arr[second] = temp;
//    }

}
