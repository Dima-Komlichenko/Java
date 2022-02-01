package Homeworks.HW3.Task6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Program {

    public static void main(String[] args) {

        Array arr = new Array();
        Random rand = new Random();
        int size = 10;
        for (int i = 0; i < size; i++) {
            arr.array.add(rand.nextInt(10));
        }
        arr.array.forEach(System.out::print);

        System.out.println(arr.max());
        System.out.println(arr.min());
        System.out.println(arr.avg());

        arr.sortAsc();
        arr.array.forEach(System.out::print);
        System.out.println();
        arr.sortDesc();
        arr.array.forEach(System.out::print);
    }
}
