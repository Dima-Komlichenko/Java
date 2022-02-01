package Homeworks.HW3.Task4;

public class Automobile  extends Device{
    public Automobile(String name, String description) {
        super(name, description);
    }

    @Override
    public void sound() {
        System.out.println("Машина гудит");
    }

}
