package vat;

public class View {

    public void show(double result) {
        String MSG = "MOMS";
        String CURRENCY = "Kr";
        System.out.printf("Du betaler %.2f%s i %s%n", result, CURRENCY, MSG.toLowerCase());
    }
}
