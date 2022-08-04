package Conditional_Loops;
import java.util.Scanner;
public class sumOfAllNumbers {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter your number :");

        int sum=0;
        while(true){
            int num1=in.nextInt();
            if(num1!=0){
                sum+=num1;
            }
            else{
                System.out.println("The Sum of all numbers is :"+sum);
                break;
            }
        }





    }
}
