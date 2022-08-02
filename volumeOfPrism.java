package Conditional_Loops;
import java.util.Scanner;
public class volumeOfPrism {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.print("enter base area to find volume of prism :");
        float base=input.nextFloat();

        System.out.print("enter side to find volume of prism :");
        float height=input.nextFloat();

        float volume = (base*height);
        System.out.println("The volume of prism is :"+volume);


    }
}

