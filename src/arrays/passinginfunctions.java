package arrays;

import java.util.Arrays;

public class passinginfunctions {
    public static void main(String[] args) {
        int [] n = {1, 2, 3, 4 ,5};
        System.out.println(Arrays.toString(n));
        change(n);
        System.out.println(Arrays.toString(n));
    }
    static void change(int[] n){
        n[0] = 17;
    }

}
