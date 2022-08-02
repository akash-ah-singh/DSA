package Conditional_Loops;
import java.util.Scanner;
public class volumeOfCone {
    public static void main(String[] args) {

        float pi=3.142f;

        Scanner input=new Scanner(System.in);
        System.out.print("enter radius to find volume of cone :");
        float radius=input.nextFloat();

        System.out.print("enter height to find volume of cone :");
        float height=input.nextFloat();

        float volume = pi*(radius*radius)*(height/3);
        System.out.println("The volume of cone is :"+volume);


    }
}




