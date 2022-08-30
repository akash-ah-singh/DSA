package Functions;

import java.util.Scanner;

public class productOfTwoNumber {
    static int Product(int num1,int num2){
        int product=num1*num2;
        return product;

    }

    
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter first number : ");
        int num1=in.nextInt();
        System.out.println("Enter second number : ");
        int num2=in.nextInt();


        System.out.println("Product of above two number is : " +Product(num1,num2));

    }
}


