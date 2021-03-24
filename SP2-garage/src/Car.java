public abstract class Car {
    // Bil. En bil har attributterne regNr, mærke, model, årgang, antalDøre. Klassen er abstrakt
    private String registrationNumber;
    private String brand;
    private String model;
    private int year;
    private int numDoors;

    public Car(String registrationNumber, String brand, String model, int year, int numDoors) {
        this.registrationNumber = registrationNumber;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.numDoors = numDoors;
    }

    public abstract double calculateEcoTax();

    public String toString() {
        return String.format("" +
                "%s %s %d:\n" +
                "Registration Number:\t%s\n" +
                "Number of doors:\t\t%d\n",
                brand, model, year, registrationNumber, numDoors);
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getNumDoors() {
        return numDoors;
    }

    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }
}
