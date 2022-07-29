package if_else;
import java.util.Scanner;
public class Calculate_value {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter First number : ");
        int num1=input.nextInt();
        System.out.print("Enter Second number : ");
        int num2=input.nextInt();
        System.out.print("Enter Operator : ");
        char Operator= input.next().trim().charAt(0);


        if(Operator=='+'){
            System.out.println(num1 + num2);
        }
        else if(Operator=='-'){
            System.out.println(num1 - num2);
        }
        else if(Operator=='*'){
            System.out.println(num1 * num2);
        }
        else if(Operator=='/') {
            if (num2 != 0) {
                System.out.println(num1 / num2);
            }
            else{
                System.out.println("enter valid second number ");
            }
        }
        else{
            System.out.println("Enter valid operator !!! ");

        }






    }
}
