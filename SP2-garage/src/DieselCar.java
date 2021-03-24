public class DieselCar extends Car {
    // Dieselbil. Denne klasse nedarver fra Bil og har desuden attributterne harPartikelfilter og kmPrL.

    private final boolean hasParticulateFilter;
    private final double kmPrLiter;

    public DieselCar(String registrationNumber, String brand, String model, int year, int numDoors,
                     boolean hasParticulateFilter, double kmPrLiter) {
        super(registrationNumber, brand, model, year, numDoors);
        this.hasParticulateFilter = hasParticulateFilter;
        this.kmPrLiter = kmPrLiter;
    }

    @Override
    public double calculateEcoTax() {
        /*
        * For en Dieselbil er der samme afgift som for benzinbilen,
        * plus en udligningsafgift, som også afhængig af kmPrL.
        * Hvis den er mellem 20 og 50 er udligningsafgiften 130kr,
        * mellem 15 og 20 er den 1390 kr, mellem 10 og 15 er den 1850kr,
        * mellem 5 og 10 er den 2770kr, og under 5 er den 15260kr.
        * Der er desuden en partikeludledningsafgift på 1000 kr
        * hvis bilen ikke har partikelfilter monteret.
        * */
        double baseFee = Util.stdEcoTax(kmPrLiter);

        double[][] cvRanges = {
                { 20.0, 50.0 },
                { 15.0, 20.0 },
                { 10.0, 15.0 },
                { 5.0, 10.0, },
                { 0.0, 5.0 }
        };
        double[] cvCharges = { 130.0, 1390.0, 1850.0, 2770.0, 15260.0 };
        double countervailingCharge = Util.fee(kmPrLiter, cvRanges, cvCharges);
        double particleEmissionFee = (hasParticulateFilter ? 0.0 : 1000.0);

        return baseFee + countervailingCharge + particleEmissionFee;
    }

    public String toString() {
        return String.format("" +
                "%s" +
                "Has particulate filter:\t%s\n" +
                "km/l:\t\t\t\t\t%.2f", super.toString(), (hasParticulateFilter ? "Yes" : "No"), kmPrLiter);
    }
}
