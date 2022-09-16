package Binary_Search;

public class Floor_Of_a_Number_In_Array {
    public static void main(String[] args) {

        int[] arr={2,3,5,9,14,16,18};
        int target=15;
        System.out.println(cellingNumber(arr,target));

    }

    static int cellingNumber(int[] nums ,int targetValue) {

        if(targetValue<nums[0]){
            return -1;
        }

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (targetValue > nums[mid]) {
                start = mid + 1;
            }
            else if (targetValue < nums[mid]) {
                end = mid - 1;
            }
            else{
                return mid;

            }

        }
        return nums[end];

    }


}


