package Conditional_Loops;
import java.util.Scanner;
public class areaOfParallelogram {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.print("Enter base to find area of Parallelogram :");
        float base=input.nextFloat();

        System.out.print("Enter height form base to find area of Parallelogram :");
        float height=input.nextFloat();



        float Area=base*height;
        System.out.println("area of Parallelogram is : "+Area);

    }
}
