package src.ex6;

public class Main {
/*
 *
 * Hvis du kompilerer programmet får du 7 fejl.
 * Kan du fixe programmet så det kan køre og
 * outputtet bliver:
 * "7 is the smallest!"
 *
 * 
 */

    public static void main(String[] args) {
        int a = 7, b = 42;
        int smaller = minimum(a,b);
        if (smaller == a) {
            System.out.println(a + " is the smallest!");
        }
    }
    public static int minimum(int a, int b) {
        int smaller = 0;
        if (a < b) {
            smaller = a;
        } else if (a >= b) {
            smaller = b;
        }
        return smaller;
    }
}

