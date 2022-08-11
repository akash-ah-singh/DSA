package if_else;
import java.util.Scanner;
public class palindrom {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

    // for String and number.....but our number is also a String

//        System.out.print("enter any thing :");
//        String Anything=input.nextLine();
//
//        String reverse="";
//        for(int i=Anything.length()-1;i>=0;i--){
//            reverse=reverse+Anything.charAt(i);
//        }
//        if(Anything.equals(reverse)){
//            System.out.println("palindrom");
//        }
//        else{
//            System.out.println("not palindrom");
//        }


    // for numbers

        System.out.println("Enter any number : ");
        int num= input.nextInt();
        int original=num;
        int  palindrom=0;
        int reverse=0;

        while(num>0){
            reverse=num%10;
            palindrom=(palindrom*10)+reverse;
            num=num/10;

        }
        if(original==palindrom){
            System.out.println("palindrom");
        }
        else{
            System.out.println("not a palindrom");
        }



    }
}


