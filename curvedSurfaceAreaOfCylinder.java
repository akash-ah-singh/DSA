package Conditional_Loops;
import java.util.Scanner;
public class curvedSurfaceAreaOfCylinder {
    public static void main(String[] args) {

        float pi=3.142f;
        Scanner input=new Scanner(System.in);
        System.out.print("enter radius to find curvedSurfaceAreaOfCylinder :");
        float radius=input.nextFloat();

        System.out.print("enter base area to find curvedSurfaceAreaOfCylinder :");
        float height=input.nextFloat();

        float SurfaceArea = 2*pi*(radius*height);
        System.out.println("The curvedSurfaceAreaOfCylinder is :"+SurfaceArea);


    }
}
