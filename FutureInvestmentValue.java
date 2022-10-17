package Conditional_Loops;
import java.util.Scanner;
import java.lang.Math;
public class FutureInvestmentValue {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        System.out.println("Enter present value of your investment : ");
        int PV=in.nextInt();
        System.out.println("Enter Intrest rate : ");
        double rate=in.nextDouble();
        System.out.println("Enter time in year: ");
        int time=in.nextInt();

        double FV=PV*Math.pow(1+rate/100 , time);
        System.out.println("Future value will be : "+FV);


    }
}
