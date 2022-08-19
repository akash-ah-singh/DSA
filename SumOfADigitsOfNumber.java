package Conditional_Loops;
import java.util.Scanner;
public class SumOfADigitsOfNumber {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        System.out.print("Enter your number : ");
        int num=in.nextInt();

        int sum=0;

        while(num>0){
            sum=sum+num%10;
            num=num/10;

        }
        System.out.println("The sum of all digit's of a number is : "+sum);



    }
}
