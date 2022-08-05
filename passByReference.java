package Conditional_Loops;

import java.util.Arrays;

public class passByReference {
    public static void main(String[] args) {

        // Pass by reference

        int[] arr={1,2,3,4,5};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }


    static void change(int [] arr1){
        arr1[0]=10;

    }
}
