package Homeworks.HW3.Task4;

public class Steamer  extends Device{
    public Steamer(String name, String description) {
        super(name, description);
    }

    @Override
    public void sound() {
        System.out.println("Пароход гудит");
    }

}
