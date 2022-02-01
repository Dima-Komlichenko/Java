package Homeworks.HW3.Task6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Array implements IMath, ISort{

    public ArrayList<Integer> array;

    public Array() {
        array = new ArrayList<Integer>();
    }

    public Array(ArrayList<Integer> array) {
        this.array = array;
    }


    @Override
    public int max() {
        int max = array.get(0);
        for (int i = 1; i < array.size(); i++) {
            if(array.get(i) > max) max = array.get(i);
        }
        return max;
    }

    @Override
    public int min() {
        int max = array.get(0);
        for (int i = 1; i < array.size(); i++) {
            if(array.get(i) < max) max = array.get(i);
        }
        return max;
    }

    @Override
    public float avg() {
        float avg = 0;
        for (int i = 0; i < array.size(); i++) {
            avg += array.get(i);
        }
        return avg / array.size();
    }


    @Override
    public void sortAsc() {
        Collections.sort(array);
    }

    @Override
    public void sortDesc() {
        Collections.sort(array, Collections.reverseOrder());
    }
}
