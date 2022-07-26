package if_else;
import java.util.Scanner;
public class reverse_number {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter any number : ");
        String num=input.next();
//        int num=input.nextInt();

        int p=num.length()-1;
        for(int i=p;i<=p;i--){
            if(i<0){
                break;
            }
            System.out.print(Integer.parseInt(String.valueOf(num.charAt(i))));

        }


//                 OR


//        int ans =0;
//        while(num>0){
//            int rem=num%10;
//            num=num/10;
//            ans=ans*10+rem;
//        }
//        System.out.println(ans);
//



    }
}
