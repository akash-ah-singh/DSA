package Binary_Search;

import java.util.Arrays;

public class Find_first_and_last_position_of_element_in_sorted_array {
    public static void main(String[] args) {

        int[] arr = {2,7,7, 7, 7, 8, 8, 10};
        int target = 7;

        int[] ans = {-1,-1};

        ans[0]=F_L_Position(arr, target, true);
        if(arr[0]!=-1){
            ans[1]=F_L_Position(arr, target, false);
        }


        System.out.println(Arrays.toString(ans));

    }

    static int F_L_Position(int[] nums, int targetValue, boolean firstPos) {

        int ans = -1;
        int start = 0;
        int end = nums.length-1;


        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (targetValue < nums[mid]) {
                end = mid - 1;
            } else if (targetValue > nums[mid]) {
                start = mid + 1;
            } else {
                ans = mid;
                if (firstPos) {
                    end = mid - 1;

                } else {
                    start = mid + 1;
                }

            }

        }
        return ans;

    }
}
