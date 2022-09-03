package Functions;

import java.util.Scanner;

public class palindrome {

    static void Palindrome(int n){
        int original=n;
        int temp=0;
        int palin=0;
        while(n>0){
            temp=n%10;
            palin=(palin*10)+temp;
            n=n/10;
        }

//        System.out.println("palindrome of entered number is : "+palin);

        if(original==palin){
            System.out.println("Entered number is palindrome ");
        }
        else{
            System.out.println("Entered number is not a palindrome ");
        }
    }

    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        System.out.println("Enter your number : ");
        int num=in.nextInt();


        Palindrome(num);
    }
}
