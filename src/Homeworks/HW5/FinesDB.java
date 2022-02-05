package Homeworks.HW5;

import java.util.ArrayList;
import java.util.HashMap;

public class FinesDB {
    private ArrayList<Person> people;

    public FinesDB() {
        people = new ArrayList<>();
    }

    public boolean addFine(int idPerson, HashMap<String, Float> fine) {
        Person person = people.stream()
                .filter(p -> p.getId() == idPerson)
                .findFirst()
                .orElse(null);

        if(person == null) {
            return false; // call 'addPerson'
        }
        else {
            person.addFine(fine);
            return true;
        }
    }

    public void addPerson(String name, String city, HashMap<String, Float> fine) {
        people.add(new Person(name, city, fine));
    }


    public void showAll() {
        people.forEach(System.out::println);
    }

    public void showByFine(String fineDescription) {
        people.stream().filter(person ->
            person.getFineDescriptions().contains(fineDescription)
        ).forEach(System.out::println);
    }

    public void showByCity(String city) {
        people.stream().filter(person ->
                person.getCity() == city)
                .forEach(System.out::println);
    }

    public void removeFine(int id, String fineDecription) {
        Person person = people.stream().filter(p -> p.getId() == id)
                .findFirst().orElse(null);

        person.removeFine(fineDecription);
    }


}
