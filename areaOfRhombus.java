package Conditional_Loops;
import java.util.Scanner;
public class areaOfRhombus {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.print("Enter V_diagonal to find area of rhombus :");
        float V_diagonal=input.nextFloat();

        System.out.print("Enter H_diagonal to find area of rhombus :");
        float H_diagonal=input.nextFloat();


        float Area=(V_diagonal*H_diagonal)/2;
        System.out.println("area of rhombus is : "+Area);

    }
}
