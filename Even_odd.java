package if_else;
import java.util.Scanner;
public class Even_odd {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter any number: ");
        int number=input.nextInt();


        if (number%2==0){
            System.out.println("Even number ");
        }
        else{
            System.out.println("odd number ");
        }

        
    }
}
