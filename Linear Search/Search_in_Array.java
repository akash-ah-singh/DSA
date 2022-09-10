
package Linear_Search;

public class Search_in_array {
    public static void main(String[] args) {
        int[] arr={12,3,45,23,56,2};
        int target=-1;
        System.out.println(LinearSearch(arr ,target));

    }

// using loop (to get index number)


    static int LinearSearch(int[] nums , int targetValue){
        if (nums.length==0){
            return -1;
        }
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==targetValue){
                return i;
            }
        }
        return -1;
    }
}



// using for each loop


//    static int LinearSearch(int[] nums , int targetValue){
//        if (nums.length==0){
//            return -1;
//        }
//        for (int element : nums ) {
//            if(element ==targetValue){
//                return element ;
//            }
//        }
          //  ( Used max value because if -1 found in array then we don't confuse it with return -1 )
//        return  Integer.MAX_VALUE;
//    }
//}



// using 'return type'  as Boolean


//    static boolean LinearSearch(int[] nums , int targetValue){
//        if (nums.length==0){
//            return false;
//        }
//        for (int i = 0; i < nums.length; i++) {
//            if(nums[i]==targetValue){
//                return true;
//            }
//        }
//        return false;
//    }
//}

