package switchstatements;

import java.util.Scanner;

public class program1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        String fruit = in.next();

//        switch (fruit) {
//            case "mango" -> System.out.println("king of fruits");
//            case "apple" -> System.out.println("a red fruit");
//            case "kiwi" -> System.out.println("round fruit");
//            default -> System.out.println("invalid choice");
//        }


            int day = in.nextInt();

//        switch (day) {
//            case 1 -> System.out.println("monday");
//            case 2 -> System.out.println("tuesday");
//            case 3 -> System.out.println("wednesday");
//            case 4 -> System.out.println("thursday");
//            case 5 -> System.out.println("friday");
//            case 6 -> System.out.println("saturday");
//            case 7 -> System.out.println("sunday");

//        }
        switch (day) {

            case 1 :
            case 2 :
            case 3 :
            case 4 :
            case 5 :
                System.out.println("weekdays");
                break;
            case 6 :
            case 7 :
                System.out.println("weekend");
                break;

        }



    }
}
