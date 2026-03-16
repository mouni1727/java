package arrays;

import java.util.ArrayList;

import java.util.Scanner;

public class arraylist {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //arraylist

        ArrayList<Integer> list = new ArrayList<>(10);
//        list.add(10);
//        list.add(20);
//        list.add(30);
//        list.add(70);

//        System.out.println(list.contains(17));
//        System.out.println(list);
//        list.set(0,17);
//
//        list.remove(1);
//        System.out.println(list);

//        input

        for(int i=0;i < 10;i++){
            list.add(in.nextInt());
        }
        for(int i=0;i < 10;i++){
            System.out.println(list.get(i));//pass index here,list[index] doesn't work here.
        }
//        System.out.println(list);

    }

}
