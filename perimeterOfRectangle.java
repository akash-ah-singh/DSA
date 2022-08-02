package Conditional_Loops;
import java.util.Scanner;
public class perimeterOfRectangle {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.print("enter length to find perimeter of Rectangle :");
        float length=input.nextFloat();

        System.out.print("enter width to find perimeter of Rectangle :");
        float width=input.nextFloat();

        float Perimeter = 2*(length+width);
        System.out.println("The perimeter of Rectangle is :"+Perimeter);

    }
}


