package if_else;
import java.util.Scanner;
public class Ruppe_to_Usd {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter dollor : ");
        float dollor=input.nextFloat();
        

        float ruppe=dollor*79.43f;
        System.out.println(dollor + " dollor is equal to "+ ruppe + " ruppe");
    }
}
