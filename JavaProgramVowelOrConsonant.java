package Conditional_Loops;
import java.util.Scanner;
public class JavaProgramVowelOrConsonant {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        System.out.println("Enter any name");
        String str=in.nextLine();

        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
                count++;
            }
            else{
                count=count+0;
            }

        }
        System.out.println("total vowel in entered string are = "+count);


    }
}
