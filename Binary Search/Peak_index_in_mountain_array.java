package Binary_Search;

public class Peak_index_in_mountain_array {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,3,2,1};
//        int[] arr={0,1,0};
//        int[] arr={0,2,1,0};
//        int[] arr={0,10,5,2};
        System.out.println(peak(arr));

    }

//     // Binary Search Algorithm

    static int peak(int[] nums){
        int start=0;
        int end=nums.length-1;
        while(start < end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (nums[mid] < nums[mid+1]) {
                // you are in asc part of array
                start = mid + 1; // because we know that mid+1 element > mid element
            }
            else {
                // you are in dec part of array
                // this may be the ans, but look at left
                // this is why end != mid - 1
                end = mid;

            }
        }
        // in the end, start == end and pointing to the largest number because of the 2 checks above
        // start and end are always trying to find max element in the above 2 checks
        // hence, when they are pointing to just one element, that is the max one because that is what the checks say
        // more elaboration: at every point of time for start and end, they have the best possible answer till that time
        // and if we are saying that only one item is remaining, hence cuz of above line that is the best possible ans
        return start; // or return end as both are =

    }





//   // Linear Search algorithm

//    static int peak(int[] nums){
//        int temp=0;
//        for (int i = 0; i <nums.length-1 ; i++) {
//            if(nums[i]>nums[i+1]){
//                temp=i;
//                break;
//
//            }
//
//
//        }
//        return temp;
//
//    }



}
