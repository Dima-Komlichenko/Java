package Homeworks.HW4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Array<T> {

    private ArrayList<T> array;

    public Array() {
        array = new ArrayList<T>();
    }

    public Array(ArrayList<T> array) {
        this.array = array;
    }

    public void add(T value) {
        array.add(value);
    }

    public void fillRandom(int count) {

        array.clear();
        Random rand = new Random();
        for (int i = 0; i < count; i++) {
            //array.add(rand.nextInt());
        }

    }

    public void show() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.size(); i++) {
            sb.append(array.get(i));
        }
        System.out.println(sb);
    }

    public void max() {
        T max = array.get(0);
        for (int i = 1; i < array.size(); i++) {
            //if(array.get(i) > max)
        }
    }

    //@Override
    //public int compareTo(T o) {
        //return 0;
    //}

    //public int compare(T x, T y) {
        //return (x < y) ? -1 : ((x == y) ? 0 : 1);
    //}
}
