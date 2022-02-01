package Homeworks.HW3.Task5;

public class Violin extends MusicalInstrument{

    public Violin(String model, int price, String bodyMaterial) {
        super(model, price, bodyMaterial);
    }

    @Override
    public void sound() {
        System.out.println("Скрипка играет");
    }
}
