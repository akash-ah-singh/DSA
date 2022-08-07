package Conditional_Loops;
import java.util.Scanner;
public class ClaculateCGPA {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        System.out.println("Enter all Subject marks : ");

        int sum=0;
        int count=0;
        int average=0;

        while(true){
            int marks=in.nextInt();
            if(marks!=0){
                count++;
                sum=sum+marks;

            }
            else{
                average=sum/count;
                System.out.println("The CGPA of above marks is : "+ average/9.5f);
                break;
            }

        }


    }
}




