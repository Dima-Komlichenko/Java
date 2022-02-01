package Homeworks.HW3.Task1;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        Pilot pilot = new Pilot("Ivan", 30, "first pilot", 30000);
        Builder builder = new Builder("Nikolay", 25, "main builder", 25000);
        Sailor sailor = new Sailor("Petya", 27, "captain", 35000);

        ArrayList<Human> humans = new ArrayList<Human>();
        humans.add(pilot);
        humans.add(builder);
        humans.add(sailor);

        Human human = humans.get(1);


    }
}
