package Conditional_Loops;
import java.util.Scanner;
import java.lang.Math;
public class CompoundIntrest {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        System.out.print("Enter your principle amount : ");
        int principle=in.nextInt();
        System.out.print("Enter annual Interest rate : ");
        double interest=in.nextInt();
        System.out.print("Enter time in years : ");
        int time=in.nextInt();

        double CI=principle*(Math.pow(1+(interest/100),time));
        double CompoundInterest=CI-principle;
        System.out.println(CompoundInterest);











    }
}
