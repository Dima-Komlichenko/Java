package Homeworks.HW3.Task1;

public class Builder extends Human {

    private String position;
    private int salary;

    public Builder(String fullName, int age, String position, int salary) {
        super(fullName, age);
        this.position = position;
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public int getSalary() {
        return salary;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public void work() {
        System.out.println("Builder " + fullName + " is building");
    }
}
