package functions;

import java.util.Scanner;

public class problem_01 {
    public static void main(String[] args) {
        sum(); //function call

    }
        static void sum() {
            Scanner in = new Scanner(System.in);
            System.out.println("enter number 1:");
            int num1 = in.nextInt();
            System.out.println("enter number 2:");
            int num2 = in.nextInt();
            System.out.println("enter number 3:");
            int num3 = in.nextInt();
            int sum = num1 +num2 +num3;
            System.out.println("the sum = " + sum);
        }
}
