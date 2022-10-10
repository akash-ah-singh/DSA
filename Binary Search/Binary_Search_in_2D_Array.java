package Binary_Search;

import java.util.Arrays;

public class Binary_Search_in_2D_Array {
    public static void main(String[] args) {
        int [][] arr={
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50}
        };

        int targetValue=37;
        
        System.out.println(Arrays.toString(multiDimArray(arr,targetValue)));


//        int [][] arr={
//                {10,20,40},
//                {15,25,45},
//                {28,29,49},
//                {33,34,50}
//        };
//
//        int targetValue=34;
//        System.out.println(Arrays.toString(multiDimArray(arr,targetValue)));

    }

// when no of rows==no of column

    static int[] multiDimArray(int [][] arr, int target ){
        int r=0;
        int c=arr.length-1;

        while(r<arr.length && c>=0){
            if(arr[r][c]==target){
                return new int[] {r,c};
            }
            if(arr[r][c]<target){
                r++;
            }
            else{
                c--;
            }
        }
        return new int[] {-1,-1};


    }


//    when no of rows != no of column

//    static int[] multiDimArray(int [][] arr, int target ){
//        int r=0;
//        int c=arr.length-2;
//
//        while(r<arr.length && c>=0){
//            if(arr[r][c]==target){
//                return new int[] {r,c};
//            }
//            if(arr[r][c]<target){
//                r++;
//            }
//            else{
//                c--;
//            }
//        }
//        return new int[] {-1,-1};
//
//
//    }


}
