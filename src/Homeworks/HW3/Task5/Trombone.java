package Homeworks.HW3.Task5;

public class Trombone extends MusicalInstrument {
    public Trombone(String model, int price, String bodyMaterial) {
        super(model, price, bodyMaterial);
    }

    @Override
    public void sound() {
        System.out.println("Тромбон играет");
    }
}
