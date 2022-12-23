package Sorting;

public class First_Missing_Positive {
    public static void main(String[] args) {
        int[] arr={3,4,-1,1};
        System.out.println(firstMissingPositive(arr));

    }
    public static int firstMissingPositive(int[] nums){

        int i = 0;
        while ( i <nums.length ) {
            int correct =nums[i]-1;
            if(nums[i]>0 && nums[i]<=nums.length && nums[i]!=nums[correct]){
                swap(nums, i , correct );
            }
            else{
                i++;
            }

        }
        // case 1
        for (int j = 0; j < nums.length; j++) {
            if(nums[j]!=j+1){
                return j+1;
            }

        }
        // case 2
        return nums.length+1;
    }


    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
