package Conditional_Loops;
import java.util.Scanner;
public class perimeterOfSquare {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.print("enter side to find perimeter of square :");
        float side=input.nextFloat();

        float Perimeter = 4*(side);
        System.out.println("The perimeter of square is :"+Perimeter);

    }
}
