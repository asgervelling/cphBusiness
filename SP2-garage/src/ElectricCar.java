public class ElectricCar extends Car {
    // Elbil. Denne klasse nedarver fra Bil og har desuden attributterne batterikapacitetKWh, maxKm og whPrKm.

    private final double batteryCapacityKWh;
    private final double maxKm;
    private final double whPerKm;

    public ElectricCar(String registrationNumber, String brand, String model, int year, int numDoors,
                       double batteryCapacityKWh, double maxKm, double whPerKm) {
        super(registrationNumber, brand, model, year, numDoors);
        this.batteryCapacityKWh = batteryCapacityKWh;
        this.maxKm = maxKm;
        this.whPerKm = whPerKm;
    }

    @Override
    public double calculateEcoTax() {
        /*
         * For en Elbil gælder de samme regler som for benzinbilen,
         * blot skal man først omregne whPrKm tilkmPrL.
         * Det udregnes således: 100 / (whPrKm / 91,25).
         * */
        double kmPrLiter = 100f / (whPerKm / 91.25f);
        return Util.stdEcoTax(kmPrLiter);
    }

    public String toString() {
        return String.format("" +
                "%s" +
                "Battery capacity:\t\t%.2f kWh\n" +
                "Max km:\t\t\t\t\t%.2f\n" +
                "wH/km:\t\t\t\t\t%s", super.toString(), batteryCapacityKWh, maxKm, whPerKm);
    }
}
