package Conditional_Loops;
import java.util.Scanner;
public class volumeOfPyramid {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.print("enter length to find volume of pyramid :");
        float length=input.nextFloat();

        System.out.print("enter width to find volume of pyramid :");
        float width=input.nextFloat();


        System.out.print("enter height to find volume of pyramid :");
        float height=input.nextFloat();

        float volume = (length*width*height)/3;
        System.out.println("The volume of pyramid is :"+volume);

    }
}
