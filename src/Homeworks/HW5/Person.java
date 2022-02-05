package Homeworks.HW5;

import java.util.ArrayList;
import java.util.HashMap;

public class Person {
    private int id;
    private String name;
    private String city;
    private HashMap<String, Float> fines;
    private static int lastId;

    public Person(String name, String city, HashMap<String, Float> fine) {
        id = ++lastId;
        this.name = name;
        this.city = city;
        fines.putAll(fine);
    }

    public int getId() {
        return id;
    }

    public void addFine(HashMap<String, Float> fine) {
        fines.putAll(fine);
    }

    public ArrayList<String> getFineDescriptions() {
        return (ArrayList<String>)fines.keySet();
    }

    public String getCity() {
        return city;
    }

    public void removeFine(String fineDescription) {
        fines.remove(fineDescription);
    }


    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", fines=" + fines +
                '}';
    }
}
