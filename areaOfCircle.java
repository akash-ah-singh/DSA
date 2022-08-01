package Conditional_Loops;
import java.util.Scanner;
public class areaOfCircle {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.print("Enter radius to find area of circle :");
        float radius=input.nextFloat();

        float pi=3.142f;

        float Area=pi*(radius*radius);
        System.out.println("area of circle is : "+ Area);








    }
}
