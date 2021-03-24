import java.util.ArrayList;

public class Garage {
    /*
    * Der skal være en klasse der hedder Garage,
    * som har en ArrayList der kan indeholde biler.
    * Garageklassen skal have et navn, samt en metode til at tilføje biler til bilparken.
    * Den skal override toString, sådan at den skriver alle de biler ud der holder i garagen.
    * Den skal også have en metode der hedder beregnGrønAfgiftForBilpark()
    * der beregner den samlede grønne afgift for alle bilerne i garagen.
    * */

    private ArrayList<Car> cars;
    private String name;

    public Garage(String name) {
        this.name = name;
        this.cars = new ArrayList<Car>();
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public double calculateEcoTaxForGarage() {
        double sum = 0;
        for (Car c : cars) {
            sum += c.calculateEcoTax();
        }
        return sum;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder("Cars in " + name + ":\n");
        for (Car c : cars) {
            s.append(c).append("\n\n");
        }
        s.append(String.format("Total eco tax:\t\t\t%.2f kr.", calculateEcoTaxForGarage()));
        return s.toString();
    }
}
