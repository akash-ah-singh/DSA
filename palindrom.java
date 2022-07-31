package if_else;
import java.util.Scanner;
public class palindrom {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.print("enter any thing :");
        String Anything=input.nextLine();

        String reverse="";
        for(int i=Anything.length()-1;i>=0;i--){
            reverse=reverse+Anything.charAt(i);
        }
        if(Anything.equals(reverse)){
            System.out.println("palindrom");
        }
        else{
            System.out.println("not palindrom");
        }

    }
}
