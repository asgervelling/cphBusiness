public class ElectricCar extends Car {
    // Elbil. Denne klasse nedarver fra Bil og har desuden attributterne batterikapacitetKWh, maxKm og whPrKm.

    private double batteryCapacityKWh;
    private double maxKm;
    private double whPerKm;

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

    public double getBatteryCapacityKWh() {
        return batteryCapacityKWh;
    }

    public void setBatteryCapacityKWh(double batteryCapacityKWh) {
        this.batteryCapacityKWh = batteryCapacityKWh;
    }

    public double getMaxKm() {
        return maxKm;
    }

    public void setMaxKm(double maxKm) {
        this.maxKm = maxKm;
    }

    public double getWhPerKm() {
        return whPerKm;
    }

    public void setWhPerKm(double whPerKm) {
        this.whPerKm = whPerKm;
    }
}
