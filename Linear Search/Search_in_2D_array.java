package Linear_Search;

import java.util.Arrays;

public class Search_in_2D_array {
    public static void main(String[] args) {
        int[][] arr_2D={
                {1,2,3},
                {12,23,34,45},
                {55,56,67,78,89},
                {11,43,54}
        };
        int targetValue=11;
        System.out.println(search_in_2D(arr_2D,targetValue));

//        //  using for loop with return type 1D array of index number
//        System.out.println(Arrays.toString(search_in_2D(arr_2D,targetValue)));

    }

// using for loop with return type boolean

    static boolean search_in_2D(int[][] arr ,int target){
        if(arr.length==0){
            return false;
        }
        int row= arr.length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < arr[j].length ; j++) {
                if(arr[i][j]==target){
                    return true;
                }
            }
        }
        return false;
    }
}




// using for loop with return type int


//    static int search_in_2D(int[][] arr ,int target){
//        if(arr.length==0){
//            return -1;
//        }
//        int row= arr.length;
//        for (int i = 0; i < row; i++) {
//            for (int j = 0; j < arr[j].length ; j++) {
//                if(arr[i][j]==target){
//                    return target;
//                }
//            }
//        }
//        return -1;
//    }
//}




// using for loop with return type 1D array of index number {row,col} ----> 1D Array


//    static int[] search_in_2D(int[][] arr ,int target){
//        int row= arr.length;
//        for (int i = 0; i < row; i++) {
//            for (int j = 0; j < arr[j].length ; j++) {
//                if(arr[i][j]==target){
//                    // here we have to add an objet of array for return type " new int[] " before print {row,col} ----> array 1D
//                    return new int[] {i,j};
//                }
//            }
//        }
//        return new int[] {-1,-1};
//    }
//}