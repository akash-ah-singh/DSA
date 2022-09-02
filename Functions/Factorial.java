package Functions;
import java.util.Scanner;
public class Factorial {

    static void factorial(int n){
        int mul=1;
        if(n==0 || n==1){
            System.out.println("Factorial is 1");
        }
        else{
            for(int i=1;i<=n;i++){
                mul=mul*i;
            }
            System.out.println("factorial is : "+mul);
        }
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter your number : ");
        int fact=in.nextInt();

        factorial(fact);

    }
}
