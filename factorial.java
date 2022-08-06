package Conditional_Loops;
import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        System.out.println("Enter your number to print Factorial of that number :");
        int num1=in.nextInt();

        int fact=1;
        for(int i=1;i<=num1;i++){
            fact=fact*i;
        }
        System.out.println(fact);


                 // OR


//        int i=1;
//        int fact=1;
//        while(i<=num1){
//            fact=fact*i;
//            i++;
//        }
//        System.out.println(fact);

    }
}
