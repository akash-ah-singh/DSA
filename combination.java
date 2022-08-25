package Conditional_Loops;

import java.util.Scanner;

public class combination {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter total number of things : ");
        int n = in.nextInt();
        System.out.println("Enter object : ");
        int r = in.nextInt();

        int fact = 1;
        int fact1 = 1;
        int fact2=1;
        int permuatation = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;

        }
        for (int i = 1; i <= n - r; i++) {
            fact1 = fact1 * i;

        }
        for (int i = 1; i <= r; i++) {
            fact2 = fact2 * i;

        }
        permuatation = fact / (fact1*fact2);
        System.out.println(permuatation);
    }
}
