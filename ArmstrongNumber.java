package Conditional_Loops;
import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        System.out.println("Enter any number : ");
        int num=in.nextInt();

        int original=num;
        int sum=0;

        while(num>0){
            int rem=num%10;
            sum=sum+rem*rem*rem;
            num=num/10;
        }
        

        if(sum==original){
            System.out.println("armstrong number");
        }
        else{
            System.out.println("not armstrong number");
        }



    }
}
