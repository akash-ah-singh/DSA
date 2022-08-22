package if_else;
import java.util.Scanner;
public class Alphabate_case_check {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter any Word/Character : ");
        char ch =input.next().trim().charAt(0);


        
        if (ch>='a' && ch<='z'){
            System.out.println("Lower Case");
        }
        else{
            System.out.println("Upper Case");
        }
    }
}


