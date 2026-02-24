package Basics;

import java.util.Scanner;

public class countingoccurance {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    int n = 12345;

    int count = 0;
    while ( n > 0) {
        int rem = n % 10;
        if(rem == 5) {
            count++;
        }
        n = n / 10;

    }
        System.out.println(count);
    }
}
