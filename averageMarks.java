package Conditional_Loops;
import java.util.Scanner;
public class averageMarks {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        System.out.println("Enter all subject marks : ");

        float sum=0;
        float count=0;
        float avg=0;

        while(true){
            float marks=in.nextFloat();
            if(marks!=0){
                count++;
                sum=sum+marks;
                avg=sum/count;

            }
            else{
                System.out.println("average of all subject marks are : "+avg);
                break;

            }

        }

    }
}
