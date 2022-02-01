package Homeworks.HW3.Task4;

public class Kettle  extends Device{

    public Kettle(String name, String description) {
        super(name, description);
    }

    @Override
    public void sound() {
        System.out.println("Чайник свистит");
    }


}
