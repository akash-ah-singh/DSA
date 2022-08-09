package Conditional_Loops;
import java.util.Scanner;
public class Reverse_A_String {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        System.out.println("Enter any String : ");
        String str=in.nextLine();

        String reverse_String="";
        for(int i=str.length()-1;i>=0;i--){
            reverse_String=reverse_String+str.charAt(i);

        }
        System.out.println(reverse_String);


    }
}
