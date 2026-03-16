package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class multiDinputandoutput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[][] arr = new int[2][2];
        System.out.println(arr.length);//no of rows

        //input

        for(int r=0;r < arr.length;r++){
            for(int c=0;c < arr[r].length;c++){
                arr[r][c] = in.nextInt();//should not use in.nextInt() twice
            }
        }
        for(int r=0;r < arr.length;r++){
//                                              System.out.println(Arrays.toString(arr[r]));

//            for(int c=0;c < arr[r].length;c++){
//
//                System.out.print(arr[r][c] + " ");
//            }
//            System.out.println();
        }
        for(int[] a : arr){
            System.out.println(Arrays.toString(a));
        }
    }
}
