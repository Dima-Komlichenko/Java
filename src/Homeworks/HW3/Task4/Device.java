package Homeworks.HW3.Task4;

public abstract class Device {
    protected String name;
    protected String description;

    public Device(String name, String description) {
        this.name = name;
        this.description = description;
    }


    public abstract void sound();

    public final void show() {
        System.out.println(name);
    }

    public final void desc(){
        System.out.println(description);
    }
}
