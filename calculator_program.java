package if_else;
import java.util.Scanner;
public class calculator_program {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        while(true){
            System.out.print("Enter your operator: ");
            char op=input.next().trim().charAt(0);

            if(op=='+' || op=='-' || op=='*' || op=='/' || op=='%'){

                System.out.println("Enter first Number: ");
                int num1=input.nextInt();
                System.out.println("Enter second Number: ");
                int num2= input.nextInt();

                if(op=='+'){
                    System.out.println(num1+num2);
                }
                if(op=='-') {
                    System.out.println(num1 - num2);
                }
                if(op=='*'){
                    System.out.println(num1*num2);
                }
                if(op=='/') {
                    if (num2 != 0) {
                        System.out.println(num1 / num2);
                    }
                }
                if(op=='%'){
                    System.out.println(num1%num2);
                }

            }
            else if(op=='X' || op=='x'){
                System.out.println("program terminated !!! ");
                break;
            }
            else{
                System.out.println("Invalid Operator !!! ");
            }

        }

    }
}
