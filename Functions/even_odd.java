package Functions;

import java.util.Scanner;

public class even_odd {

    static void Even_Odd(int num1){
        if(num1%2==0){
            System.out.println("Entered Number is Even number");
        }
        else {
            System.out.println("Entered Number is Odd number");
        }
    }


    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter your number : ");
        int num=in.nextInt();

        Even_Odd(num);


    }
}
