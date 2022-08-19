package Conditional_Loops;
import java.util.Scanner;
public class leapyear {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        System.out.print("Enter your year : ");
        int year=in.nextInt();

        if((year%400==0) || ((year%4==0) && (year%100!=0))){
            System.out.println("entered year is leap year");
        }

        else{
            System.out.println("entered year is not a leap year");
        }

    }
}

