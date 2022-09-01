package Functions;

import java.util.Scanner;
public class primeNumber {

   static void Prime(int n){
       int temp=0;
       if(n==0||n==1){
           System.out.println("Entered number is not a prime number");
       }
       else{
           for(int i=2;i<n;i++) {
               if(n%i==0){
                   System.out.println("Entered number is not a prime number");
                   temp=1;
                   break;
               }
           }
           if(temp==0){
               System.out.println("Entered number is prime number");
           }
       }
   }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter your number : ");
        int num=in.nextInt();

        Prime(num);

    }
}
