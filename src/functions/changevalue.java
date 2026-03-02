package functions;

import java.util.Arrays;

public class changevalue {
    public static void main(String[] args) {

        //   String name="mouni";
        //   greet(name);
        int arr[] = {1, 2, 3, 4, 5};
        changevalue(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void changevalue(int [] nums){
        nums[0] = 85;
    }
    //  static void greet(String naam) {
    //      System.out.println(naam);
    // }



}

