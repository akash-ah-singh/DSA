package Conditional_Loops;
import java.util.Scanner;
public class DiscountOfProduct {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        System.out.print("Enter price of product :");
        float price= in.nextInt();
        System.out.print("Enter discount in percent :");
        float discount_want=in.nextInt();



        float Discount=price*(discount_want/100);
        float Discounted_price=price-Discount;
        System.out.println("Discount on product is :"+Discount);
        System.out.println("product price after discount :"+Discounted_price);



    }
}
