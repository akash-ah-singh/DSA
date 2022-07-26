package if_else;
import java.util.Scanner;
public class Counting_occurence {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter any number : ");
        String p=input.next();
//        int p=input.nextInt();
        System.out.print("Enter occuernce number : ");
        int q=input.nextInt();

        int count = 0;
        for(int i=0; i<p.length();i++){
            if(q==Integer.parseInt(String.valueOf(p.charAt(i)))){
                count++;
            }
        }
        System.out.println("Occurence of "+ q + " found " + count + " times in the above number");



//                OR



//        int count=0;
//        while(p>0) {
//            if (q == p % 10) {
//                count++;
//            }
//            p=p/10;
//        }
//        System.out.println("Occurence of "+ q + " found " + count + " times in the above number");

    }
}
