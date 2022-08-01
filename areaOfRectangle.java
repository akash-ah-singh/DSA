package Conditional_Loops;
import java.util.Scanner;
public class areaOfRectangle {
    public static void main(String[] args) {


        Scanner input=new Scanner(System.in);
        System.out.println("Enter length :");
        float length=input.nextFloat();

        System.out.println("Enter width :");
        float width=input.nextFloat();


        float Area=length*width;
        System.out.println("area of rectangle is : "+ Area);

    }
}
