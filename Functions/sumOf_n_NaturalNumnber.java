package Functions;

import java.util.Scanner;

public class sumOf_n_NaturalNumnber {

    static void sum(int n){
        int Sum=0;
        for(int i=1;i<=n;i++){
            Sum+=i;
        }
        System.out.println("Sum of all numbers is : "+Sum);

    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter your number : ");
        int num=in.nextInt();

        sum(num);
    }
}
