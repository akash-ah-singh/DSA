package Conditional_Loops;
import java.util.Scanner;
public class volumeOfSphere {
    public static void main(String[] args) {

        float pi=3.141592f;
        Scanner input=new Scanner(System.in);
        System.out.print("enter base area to find volume of sphere :");
        float radius=input.nextFloat();


        float volume = 1.3333f*pi*(radius*radius*radius);
        System.out.println("The volume of sphere is :"+volume);






    }
}
