package Conditional_Loops;
import java.util.Scanner;
import java.lang.Math;
public class DepreciationOfValue {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        System.out.print("Enter your principle amount : ");
        int principle=in.nextInt();
        System.out.print("Enter depreciation value : ");
        double depreciation=in.nextInt();
        System.out.print("Enter time in months : ");
        int time=in.nextInt();

        double depreciatedValue=principle*(Math.pow(1-(depreciation/100),time));
        System.out.println("The depreciated Value is : "+depreciatedValue);


    }
}
