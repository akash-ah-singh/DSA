package Conditional_Loops;
import java.util.Scanner;
public class totalSurfaceAreaOfCube {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.print("enter side to find totalSurfaceAreaOfCube :");
        float side=input.nextFloat();

        float totalSurfaceArea=6*(side*side);
        System.out.println("The totalSurfaceAreaOfCube is :"+totalSurfaceArea);

        
    }
}
