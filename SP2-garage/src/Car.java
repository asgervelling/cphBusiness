public abstract class Car {
    // Bil. En bil har attributterne regNr, mærke, model, årgang, antalDøre. Klassen er abstrakt
    private final String registrationNumber;
    private final String brand;
    private final String model;
    private final int year;
    private final int numDoors;

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
}
