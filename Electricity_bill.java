package Conditional_Loops;
import java.util.Scanner;
public class Electricity_bill {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        System.out.println("consumes load in kilowatt/day :");
        float load= in.nextFloat();
        System.out.println("operation day of electricity :");
        float day= in.nextFloat();
        System.out.println("per unit rate is :");
        float rate= in.nextFloat();


        float consumed_unit=(load*day);

        float total_cost=consumed_unit*rate;

        System.out.println("total_cost in rupee is = "+total_cost);


    }
}
