package if_else;
import java.util.Scanner;
public class greeting_Message {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter any name: ");
        String name=input.nextLine();
//        String name=input.next();

        System.out.println("Hi " + name + " welcome to DSA course");

    }
}
