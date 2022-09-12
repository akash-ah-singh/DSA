package Linear_Search;

public class Even_Digits {
    public static void main(String[] args) {
        int[] arr={12,345,2,6,7896,34,45,321,9,-2468};
        System.out.println(evenDigit(arr));

    }


    static int evenDigit(int[] nums){
        int count=0;

        for (int i = 0; i < nums.length; i++) {
            if(even(nums[i])) {
                count++;
            }
        }
        return count;
    }



  static boolean even(int num1) {

        if(digitCount(num1)%2==0){
            return true;
        }
        return false;
    }



    static int digitCount(int num2){
        if(num2<0){
            num2=num2*-1;
        }
        if(num2==0){
            return 1;
        }

        int count=0;
        while (num2>0){
            count++;
            num2=num2/10;
        }
        return count;
    }
}
