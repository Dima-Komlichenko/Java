package Homeworks.HW3.Task2;

public abstract class Animal {

    protected String fullName;
    protected int age;

    public Animal(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }


    public abstract void move();
}
