package Conditional_Loops;
import java.util.Scanner;
public class factorsOfThatNumber {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        System.out.println("enter your number :");
        int num1=in.nextInt();

        int factor;
        for(int i=1;i<=num1;i++){
            if(num1%i==0){
                factor=i;
                System.out.print(factor+" ");
            }

        }











    }
}
