public class PetrolCar extends Car {
    // Benzinbil. Denne klasse nedarver fra Bil og har desuden attributterne oktantal og kmPrL

    private double octaneRating;
    private double kmPrLiter;

    public PetrolCar(String registrationNumber, String brand, String model, int year, int numDoors,
                     double octaneRating, double kmPrLiter) {
        super(registrationNumber, brand, model, year, numDoors);
        this.octaneRating = octaneRating;
        this.kmPrLiter = kmPrLiter;
    }

    @Override
    public double calculateEcoTax() {
        /*
        * For en Benzinbil er afgiften afhængig af kmPrL. Hvis den er mellem 20 og 50 er den 330kr,
        * mellem 15 og 20 er den 1050 kr, mellem 10 og 15 er den 2340kr,
        * mellem 5 og 10 er den 5500kr, og under 5 er den 10470kr.
        * */
        return Util.stdEcoTax(kmPrLiter);
    }
    
    public String toString() {
        return String.format("" +
                "%s" +
                "Octane rating:\t\t\t%.2f\n" +
                "km/l:\t\t\t\t\t%.2f", super.toString(), octaneRating, kmPrLiter);
    }

    public double getOctaneRating() {
        return octaneRating;
    }

    public void setOctaneRating(double octaneRating) {
        this.octaneRating = octaneRating;
    }

    public double getKmPrLiter() {
        return kmPrLiter;
    }

    public void setKmPrLiter(double kmPrLiter) {
        this.kmPrLiter = kmPrLiter;
    }
}
