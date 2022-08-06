package Conditional_Loops;
import java.util.Scanner;
import java.lang.Math;
public class DistanceBetweenTwoPoints {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter x1 :");
        int x1=in.nextInt();
        System.out.println("Enter x2 :");
        int x2=in.nextInt();
        System.out.println("Enter y1 :");
        int y1=in.nextInt();
        System.out.println("Enter y2 :");
        int y2=in.nextInt();


        double Distance=Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
        System.out.println("Distance b/w two points are : " +Distance);



    }
}
