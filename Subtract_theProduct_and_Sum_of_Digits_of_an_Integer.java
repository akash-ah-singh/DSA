package Conditional_Loops;
import java.util.Scanner;
public class Subtract_theProduct_and_Sum_of_Digits_of_an_Integer {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        System.out.print("Enter any number :");
        int num1=in.nextInt();

        int product=1;
        int sum=0;
        while(num1>0){
            product=product*(num1%10);
            sum=sum+(num1%10);
            num1=num1/10;

        }
        System.out.println(product-sum);

    }
}
