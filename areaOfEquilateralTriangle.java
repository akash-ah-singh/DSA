package Conditional_Loops;
import java.util.Scanner;
public class areaOfEquilateralTriangle {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Enter Side to find area of Equilateral triangle");
        float side=input.nextFloat();

        float Area=(1.73f * (side * side))/4;
        System.out.println(Area);

        
    }
}
