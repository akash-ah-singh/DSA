package Sorting;
import java.util.Arrays;

public class Inseration_sort {
    public static void main(String[] args) {
        int[] arr={5,3,4,1,2};
        insertion(arr);


    }

    static void insertion(int[] arr){
        for (int i = 0; i < arr.length-1 f; i++) {
            for (int j = i+1; j > 0 ; j--) {  // loop work in descending order and comparing elements
                if(arr[j]<arr[j-1]){
                    swap(arr, j ,j-1);
                }
                else{
                    break;
                }

            }

        }
        System.out.println(Arrays.toString(arr));
    }


    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
