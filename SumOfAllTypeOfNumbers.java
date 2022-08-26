package Conditional_Loops;
import java.util.*;
public class SumOfAllTypeOfNumbers {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter your all type of numbers : ");


        int evenSum=0;
        int oddSum=0;
        int negativeNumber=0;

        while(true){
            int allType=in.nextInt();

            if(allType == 0) {
                break;
            }
            else if(allType < 0){
                negativeNumber+=allType;
            }

            else if(allType%2==0){
                evenSum+=allType;
            }
            else{
                oddSum+=allType;
            }

        }
        System.out.println("Odd numbers of sum from given number is : "+oddSum);
        System.out.println("Even numbers of sum from given number is : "+evenSum);
        System.out.println("negative numbers of sum from given number is : "+negativeNumber);




    }
}
