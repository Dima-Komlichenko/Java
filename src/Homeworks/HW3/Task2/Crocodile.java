package Homeworks.HW3.Task2;

public class Crocodile extends Animal{
    public Crocodile(String fullName, int age) {
        super(fullName, age);
    }

    @Override
    public void move() {
        System.out.println("Crocodile " + fullName + " is swimming");
    }
}
