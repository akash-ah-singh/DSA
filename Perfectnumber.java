package Conditional_Loops;
import java.util.Scanner;
public class Perfectnumber {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        System.out.print("Enter your number : ");
        int num=in.nextInt();

        int factor=0;
        for(int i=1;i<num;i++){
            if(num%i==0){
                factor=factor+i;
            }
        }
        if(factor==num){
            System.out.println("Given number is Perfect number");
        }
        else{
            System.out.println("Given number is not a Perfect number");
        }



    }
}
