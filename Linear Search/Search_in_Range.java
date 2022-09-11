package Linear_Search;

public class Search_in_Range {
    public static void main(String[] args) {
        int[] arr= {12,3,23,34,45,56,67,78,11};
        int LowerRange=1;
        int UpperRange=7;
        int targetValue=56;
        System.out.println(range(arr ,LowerRange ,UpperRange ,targetValue));

    }

    static boolean range(int[] nums ,int lower ,int upper ,int target){
        if(nums.length==0){
            return false;

        }
        for (int i =lower+1; i <upper ; i++) {
            if(target==nums[i]){
                return true;
            }

        }
        return false;

    }
}


