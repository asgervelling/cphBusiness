package task1;

public class Car {
    private String make, model, bodyStyle;
    private int year;
    private Driver driver;

    public Car(String make, String model, int year, String bodyStyle) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.bodyStyle = bodyStyle;
    }

    public Driver getDriver() {
        return this.driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public String toString() {
        return "Make: " + make + ". Model: " + model + " (" + year + "), BodyStyle: " + bodyStyle;
    }
}
