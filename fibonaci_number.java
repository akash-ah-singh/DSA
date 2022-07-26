package if_else;

import java.util.Scanner;
public class fibonaci_number {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter any index number to get that fibonaci number at that Index :  ");
        int n=input.nextInt();

        int p=0;
        int q=1;
        int count=2;

        while(count<=n){
            int temp=q;
            q=q+p;
            p=temp;
            count++;

        }
        System.out.println(q);


    }

}
