package functions;

import java.util.Scanner;

public class problem_03 {
    public static void main(String[] args) {
         int ans = sumM();
        System.out.println(ans);
    }
    static int sumM(){
        Scanner in = new Scanner(System.in);
        System.out.println("enter number 1:");
        int num1 = in.nextInt();
        System.out.println("enter number 2:");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        return sum;

    }
}
