package Conditional_Loops;
import java.util.Scanner;
public class HCF {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        System.out.println("Enter first number : ");
        int a=in.nextInt();
        System.out.println("Enter second number : ");
        int b=in.nextInt();

        int factor1=0;
        int factor2=0;
        int hcf=0;
        for(int i=1;i<=a;i++){
            if(a%i==0){
                factor1=i;
            }
        }

        for(int i=1;i<=b;i++){
            if(b%i==0){
                factor2=i;
                if(a%factor2==0){
                    hcf=factor2;

                }

            }
        }
        System.out.print("Hcf of these two numbers is : "+hcf);


    }
}
