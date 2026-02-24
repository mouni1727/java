package functions;

import java.util.Scanner;

public class parameterstring {
    public static void main(String[] args) {
       // String message = greeting("mouni");
       // System.out.println(message);

        Scanner in = new Scanner(System.in);
        System.out.println("enter your name:");
        String name = in.next();
         String message = greeting(name);
         System.out.println(message);

    }
        static String greeting(String name){
            String message = "hello " + name;
            return message;
        }

}
