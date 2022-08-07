package Conditional_Loops;
import java.util.Scanner;
public class BattingAverage {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        System.out.println("Enter total run by a player : ");
        int total_run=in.nextInt();
        System.out.println("Enter total no when he/she get out : ");
        int total_out=in.nextInt();


        double average=(double)total_run/total_out;
        System.out.println("total average of a player : "+average);

    }
}
