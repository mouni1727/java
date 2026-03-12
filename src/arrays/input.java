package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //arrays of primitives
        int [] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

    //    System.out.println(arr[2]);

    //    for(int i=0; i < arr.length;i++){
        //    System.out.println(i);
    //      arr[i] = in.nextInt();
    // }

    //    System.out.println(Arrays.toString(arr));

    //    for(int i=0; i < arr.length;i++) {
    //        System.out.println(arr[i] + " ");

    //    }
//        for(int n : arr) {
//            System.out.println(n + " ");
//
//        }

        //arrays of objects
        String[] str = new String[5];
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));
    }
}
