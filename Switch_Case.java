package if_else;
import java.util.Scanner;
public class Switch_Case {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
//        System.out.print("Enter Day : ");
//        int Day=input.nextInt();

        while(true) {
            System.out.print("Enter fruit name: ");
            String fruit=input.next();


        switch (fruit) {
            case "Mango":
                System.out.println("King of fruits");
                break;

            case "Apple":
                System.out.println("Kashmiri apple ");
                break;

            case "orange":
                System.out.println("Favroite fruit");
                break;


            case "Grapes":
                System.out.println("Small fruit");
                break;


            default:
                System.out.println("Enter valid fruit name !!! ");


        }

    }



//                                OR




//        while(true) {
//
//            System.out.print("Enter fruit name: ");
//            String fruit=input.next();
//
//        switch (fruit) {
//                case "Mango" -> System.out.println("King of fruits");
//                case "Apple" -> System.out.println("Kashmiri apple ");
//                case "orange" -> System.out.println("Favroite fruit");
//                case "Grapes" -> System.out.println("Small fruit");
//                default -> System.out.println("Enter valid fruit name !!! ");
//
//            }
//
//        }





//        switch (Day) {
//                case 1 -> System.out.println("Monday");
//                case 2 -> System.out.println("tuesday");
//                case 3 -> System.out.println("wednesday");
//                case 4 -> System.out.println("thrusday");
//                case 5 -> System.out.println("friday");
//                case 6 -> System.out.println("saturday");
//                case 7 -> System.out.println("sunday");
//                default -> System.out.println("Enter valid Day !!! ");
//
//            }


    }
}
