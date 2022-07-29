package if_else;
import java.util.Scanner;
public class Simple_intrest {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter principle : ");
        float principle=input.nextFloat();
        System.out.print("Enter rate : ");
        float rate=input.nextFloat();
        System.out.print("Enter time : ");
        float time=input.nextFloat();


        float simpleIntrest=(principle*rate*time)/100;
        System.out.println("The simple intrest is : "+ simpleIntrest);





    }
}
