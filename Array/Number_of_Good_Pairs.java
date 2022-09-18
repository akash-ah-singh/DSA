package Array;

public class Number_of_Good_Pairs {
    public static void main(String[] args) {
        int[] arr1 = {1, 1, 1, 1};
        int[] arr2 = {1, 2, 3};
        int[] arr3 = {1, 2, 3, 1, 1, 3};

        System.out.println(goodPair(arr1));
        System.out.println(goodPair(arr2));
        System.out.println(goodPair(arr3));


    }

    static int goodPair(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
        }
        return count;

    }
}


