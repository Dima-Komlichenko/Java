package Homeworks.HW3.Task4;

public class Microwave extends Device{

    public Microwave(String name, String description) {
        super(name, description);
    }

    @Override
    public void sound() {
        System.out.println("Микроволновка гудит");
    }
}
