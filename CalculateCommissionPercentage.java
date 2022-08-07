package Conditional_Loops;
import java.util.Scanner;
public class CalculateCommissionPercentage {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        System.out.println("Enter sale price : ");
        float sale_price=in.nextInt();
        System.out.println("Enter commission in percentage : ");
        float commission=in.nextInt();

        float commission_amount=sale_price*(commission/100);
        System.out.println("commission amount is : "+commission_amount);


    }
}
