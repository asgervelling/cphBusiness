package vat;

import java.util.Locale;
import java.util.Scanner;

public class Model {

    public double VAT(double number) {
        final int PRCVAT = 25;
        return number / 100 * PRCVAT;
    }

    public double getPrice() {
        Scanner myScan = new Scanner(System.in);
        myScan.useLocale(Locale.GERMANY);
        System.out.println("Indtast varens pris: ");
        return myScan.nextDouble();
    }
}
