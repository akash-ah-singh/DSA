package Functions;

import java.util.Scanner;

public class sumOfTwoNumbers {

    static void Sum(int num1,int num2){
        int sum=num1+num2;
        System.out.println("Sum of above two number is : "+sum);
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter first number : ");
        int num1=in.nextInt();
        System.out.println("Enter second number : ");
        int num2=in.nextInt();


        Sum(num1,num2);

    }
}
