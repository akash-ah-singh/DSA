package Functions;

import java.util.Scanner;

public class elgibleForVote {


    static void age(int num1){
        if(num1>=18){
            System.out.println("He/She is eligible for Vote");
        }
        else{
            System.out.println("He/She is not eligible for Vote");

        }
    }

    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        System.out.println("Enter your age  : ");
        int num=in.nextInt();

        age(num);



    }
}
