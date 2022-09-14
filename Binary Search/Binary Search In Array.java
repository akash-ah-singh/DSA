package Binary_Search;

public class Binary_search_in_Array {
    public static void main(String[] args) {
        int[] arr={-9,-7,-3,0,2,6,8,10,15,23,45};
        int target=10;
//        int[] arr={98,87,76,65,54,32,21,11,8,5,1};
//        int target=5;
        System.out.println("Index number where element found is : "+binarySearch(arr,target));

    }

    // return the index
    // return -1 if it does not exist


    static int binarySearch(int[] nums ,int targetValue){
        if(nums[0]<nums[nums.length-1]){
            //For Ascending order sorted array
            int start=0;
            int end=nums.length-1;
            while(start<=end){
                // find the middle element
                // int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
                int mid=start+(end-start)/2;

                if(targetValue<nums[mid]){
                    end=mid-1;
                }
                else if (targetValue > nums[mid]) {
                    start=mid+1;
                }
                else{
                    // answer found  // mid is an index number where element is found
                    return mid;
                }
            }
            return -1;
        }

        else{
            //For descending order sorted array
            int start=0;
            int end=nums.length-1;
            while(start<=end){
                // find the middle element
                // int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
                int mid=start+(end-start)/2;

                if(targetValue>nums[mid]){
                    end=mid-1;
                }
                else if (targetValue < nums[mid]) {
                    start=mid+1;
                }
                else{
                    // answer found  // mid is an index number where element is found
                    return mid;
                }
            }
            return -1;
        }
    }

}
