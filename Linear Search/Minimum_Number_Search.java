package Linear_Search;

public class Minimum_Number_Search {
    public static void main(String[] args) {
        int[] arr={12,23,34,45,11,45,-3,56,7};
        System.out.println("Minimum value in the array is : "+MinimumValue(arr));
    }
// Using for Loop

    static int MinimumValue(int[] nums){
        int temp=Integer.MAX_VALUE;
        if(nums.length==0){
            return -1;
        }
        for (int i = 0; i <nums.length ; i++) {
            if(nums[i]<temp){
                temp=nums[i];
            }
        }
        return temp;
    }
}


// Using for each loop

//    static int MinimumValue(int[] nums){
//        int temp=Integer.MAX_VALUE;
//        if(nums.length==0){
//            return -1;
//        }
//        for (int element : nums) {
//            if(element <temp){
//                temp=element;
//            }
//        }
//        return temp;
//    }
//}

