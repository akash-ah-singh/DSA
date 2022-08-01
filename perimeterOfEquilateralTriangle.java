package Conditional_Loops;
import java.util.Scanner;
public class perimeterOfEquilateralTriangle {
    public static void main(String[] args) {


        Scanner input=new Scanner(System.in);
        System.out.print("enter side to find perimeter of Equilateral triangle :");
        float side=input.nextFloat();


        float Perimeter=3*side;
        System.out.println("The Perimeter of Equilateral triangle is :"+Perimeter);


    }
}
