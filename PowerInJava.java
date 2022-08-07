package Conditional_Loops;

import java.util.Scanner;
import java.lang.Math;

public class PowerInJava {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        System.out.println("Enter number : ");
        int num=in.nextInt();
        System.out.println("Enter power : ");
        int power=in.nextInt();


        double power_of_num= Math.pow(num,power);

        System.out.println("power of above number is : "+power_of_num);


    }

}
