public class Util {

    public static boolean inRange(double x, double min, double max) {
        // x is in range [min, max]
        return (x >= min && x <= max);
    }

    public static double fee(double basis, double[][] ranges, double[] amounts) {
        for (int i = 0; i < amounts.length; i++) {
            if (inRange(basis, ranges[i][0], ranges[i][1])) {
                return amounts[i];
            }
        }
        return -1.0;
    }

    public static double stdEcoTax(double kmPrLiter) {
        double[][] ranges = {
                { 20.0, 50.0 },
                { 15.0, 20.0 },
                { 10.0, 15.0 },
                { 5.0, 10.0 },
                { 0.0, 5.0 }
        };
        double[] amounts = { 330.0, 1050.0, 2340.0, 5500.0, 10470.0 };
        return fee(kmPrLiter, ranges, amounts);
    }
}
