package Homeworks.HW3.Task5;

public class Ukulele extends MusicalInstrument {

    public Ukulele(String model, int price, String bodyMaterial) {
        super(model, price, bodyMaterial);
    }

    @Override
    public void sound() {
        System.out.println("Укулеле играет");
    }}
