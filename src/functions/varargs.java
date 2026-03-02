package functions;

import java.util.Arrays;

public class varargs {
    public static void main(String[] args) {
    //    next(10,2,3,4,5,6,7,8,9);
        multi(1,2,3,4,5,6,7);
    }
    //mix arguments

    static void multi(int a,int b,int ...v){
        System.out.println();
    }
    static void next(int ...v){
        System.out.println(Arrays.toString(v));
    }

}
