package Functions;

import java.util.Scanner;

public class Marks_Grade {

    static void grade(int n){

        if(n<=40){
            System.out.println("Fail");
        }
        else if(n>=41 && n<=50){
            System.out.println("Grade == DD");
        }
        else if(n>=51 && n<=60){
            System.out.println("Grade == CD");
        }
        else if(n>=61 && n<=70){
            System.out.println("Grade == BC");
        }
        else if(n>=71 && n<=80){
            System.out.println("Grade == BB");
        }
        else if(n>=81 && n<=90){
            System.out.println("Grade == AB");
        }
        else if(n>=91 && n<=100){
            System.out.println("Grade == AA");
        }
        else {
            System.out.println("Enter valid marks ");
        }

    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter your marks out of 100 : ");
        int marks=in.nextInt();

        grade(marks);
    }
}
