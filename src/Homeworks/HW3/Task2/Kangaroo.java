package Homeworks.HW3.Task2;

public class Kangaroo extends Animal{
    public Kangaroo(String fullName, int age) {
        super(fullName, age);
    }

    @Override
    public void move() {
        System.out.println("Kangaroo " + fullName + " is jumping");
    }
}
