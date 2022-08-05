package Conditional_Loops;

public class scope {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        
        {
            int c=30;
            a=100;
            System.out.println(a);
            System.out.println(c);
        }
        int c=300;
        System.out.println(c);
        System.out.println(a);





    }
}
