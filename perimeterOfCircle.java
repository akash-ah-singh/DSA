package Conditional_Loops;
import java.util.Scanner;
public class perimeterOfCircle {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.print("enter radius to find perimeter of circle :");
        float radius=input.nextFloat();

        float pi=3.142f;

        float Perimeter=2*pi*radius;

        System.out.println("the perimeter of circle is :"+Perimeter);





    }
}
