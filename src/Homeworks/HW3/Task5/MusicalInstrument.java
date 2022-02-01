package Homeworks.HW3.Task5;

public abstract class MusicalInstrument {

    protected String model;
    protected String description;
    protected String history;
    protected int price;
    protected String bodyMaterial;

    public MusicalInstrument(String model, int price, String bodyMaterial) {
        this.model = model;
        this.price = price;
        this.bodyMaterial = bodyMaterial;
    }

    public abstract void sound();

    public void show() {
        System.out.println(model);
    }
    public void desc() {
        System.out.println(description);
    }

    public void history() {
        System.out.println(history);
    }
}
