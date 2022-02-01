package Homeworks.HW3.Task2;

public class Tiger extends Animal{

    public Tiger(String fullName, int age) {
        super(fullName, age);
    }

    @Override
    public void move() {
        System.out.println("Tiger " + fullName + "  is running");
    }
}
