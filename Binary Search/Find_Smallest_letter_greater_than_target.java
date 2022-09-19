package Binary_Search;

public class Find_Smallest_letter_greater_than_target {
    public static void main(String[] args) {

        char[] arr = {'c', 'f', 'j'};
        char target = 'c';

        System.out.println(lowest_letter(arr, target));

    }

    static char lowest_letter(char[] characters, char targetValue) {

        int start = 0;
        int end = characters.length - 1;


        while (start <= end) {
            int mid = start + (end - start) / 2;

            if(targetValue<characters[mid]){
                end =mid-1;
            }
            else{
                start=mid+1;
            }

        }
        return characters[start%characters.length];


    }
}


