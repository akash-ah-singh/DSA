package Conditional_Loops;
import java.util.Scanner;
public class perimeterOfParallelogram {
    public static void main(String[] args) {


        Scanner input=new Scanner(System.in);
        System.out.print("enter base to find perimeter of parallelogram :");
        float base=input.nextFloat();

        System.out.print("enter side to find perimeter of parallelogram :");
        float side=input.nextFloat();


        float Perimeter = 2*(base+side);
        System.out.println("The perimeter of parallelogram is :"+Perimeter);

    }
}
