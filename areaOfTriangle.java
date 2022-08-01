package Conditional_Loops;
import java.util.Scanner;
public class areaOfTriangle {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter base to find area of triangle :");
        float base=input.nextFloat();

        System.out.print("Enter height form base to find area of triangle :");
        float height=input.nextFloat();



        float Area=(base*height)/2;
        System.out.println("area of triangle is : "+Area);

    }

}
