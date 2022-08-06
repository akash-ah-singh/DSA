package Conditional_Loops;
import java.util.Scanner;
public class Average_Of_n_Numbers {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        System.out.println("enter your numbers :");


        int sum=0;
        int count=0;
        float avg=0;
        while(true){
            int num=in.nextInt();
            if(num!=0){
                count++;
                sum=sum+num;
            }
            else{
                avg=(float)sum/count;
                System.out.println("average of all numbers is :"+ avg );
                break;
            }
        }

    }
}
