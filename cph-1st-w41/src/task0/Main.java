package task0;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /**
         * Each exercise is seperated by an empty line
         */

        // System.out.println(smallestMaxVal(3, 2, -1));

        // printEvenNumbers(28);

        // System.out.println(sumDigits(32145));

        // reverseVertical("Hej med dig");

        // Scanner scanner = new Scanner(System.in);
        // processName(scanner);

        // System.out.println(repeat("Hej"));

        Scanner scanner = new Scanner(System.in);
        shortestName(scanner, 4);

        // randomNumbers();

        // maxMin();

        // printMultiple(5);

        // int[] intArr = {6, 2, 9, 1, 4};
        // System.out.println(max(intArr));

        /*
        int[] aTTest0a = {1, 2, 3, 4, 5};
        int[] aTTest0b = {2, 3, 4, 5, 6};
        int[] aTTest1 = {1, 2, 3, 4, 5};
        int[] aTTest2 = {1, 2, 3, 4, 6};
        int[] aTTestError = {1, 2, 3};
        System.out.println(allLess(aTTest0a, aTTest0b)); // Should return true
        System.out.println(allLess(aTTest0a, aTTest1)); // Should return false
        System.out.println(allLess(aTTest0a, aTTest2)); // Should return false
        System.out.println(allLess(aTTest0a, aTTestError)); // Should return false and print error msg
        */
    }

    public static int min(int a, int b, int c) {
        /* Skriv en metode der hedder min som tager tre integers som parametre og returnerer den mindste af de tre værdier.
         * For eksempel vil et kald til min (3, -2, 7) returnere -2,
         * og et kald til min(19, 27, 6) returnere 6.
         * Brug Math.min i din løsning.
         * */
        int tempMin = Math.min(a, b);
        return Math.min(tempMin, c);
    }

    public static void printEvenNumbers(int maxNum) {
        /* Skriv en metode der hedder printEvenNumbers som tager et maximum nummer som argument
           og udskriver hvert lige tal fra 2 og op til dette maximum, inklusiv, og omkranset af curly braces. */
        for (int i = 0; i <= maxNum; i++) {
            if (i % 2 == 0) {
                System.out.format("{%d} ", i);
            }
        }
    }

    public static int smallestMaxVal(int a, int b, int c) {
        /* Skriv en metode der hedder smallestAbsVal der tager tre ints som parametre og returnerer den mindste af de tres absolutte værdier.
           For eksempel vil et kald til smallestAbsVal(1, 9, -11) returnere 1,
           og et kald til smallestAbsVal(-8, 2, 12) returnere 2. */
        return min(Math.abs(a), Math.abs(b), Math.abs(c));
    }

    public static int sumDigits(int num) {
        /* Skriv en metode der hedder sumDigits som returnerer summen af den absolutte  værdi af en integers cifre.
           For eksempel vil et kald til sumDigits(931) returnere 13 og et kald til sumDigits(-99) returnere 18. */
        System.out.println("hi");
        num = Math.abs(num);
        int total = 0;
        while (num > 0) {
            total += num % 10;
            num = num / 10;
        }
        return total;
    }

    public static void reverseVertical(String word) {
        /* Skriv en metode der hedder reverseVertical som tager en String som parameter
           og udskriver hvert bogstav på en separat linje, i omvendt rækkefølge */
        for (int i = word.length() - 1; i >= 0 ; i--) {
            System.out.println(word.charAt(i));
        }
    }

    public static void processName(Scanner scanner) {
        /* Skriv en metode som hedder processName som tager en Scanner som parameter
           og prompter brugeren til at skrive sit fulde navn
           og som derefter udskriver navnet med store bogstaver. */
        System.out.print("Please write your name: ");
        String name = scanner.nextLine();
        System.out.println("Your name in all caps: " + name.toUpperCase());
    }

    public static String repeat(String input) {
        /* Skriv en metode der hedder repeat som tager en String som parameter, beregner dens længde
           og returnerer en String der er concatenated længdens gange.
           For eksempel vil kaldet repeat(”Hej”) returnere ”HejHejHej”.
           Hvis inputtet er en tom streng skal metoden også returnere en tom streng. */
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            result.append(input);

        }
        return result.toString();
    }

    public static void shortestName(Scanner scanner, int n) {
        /* Skriv en metode der hedder shortestName som tager en Scanner samt en int n som parametre,
           og prompter brugeren for n navne, for derefter at udskrive det korteste navn
           (det der indeholder færrest bogstaver), for eksempel således:
           Navn #1? Kaj
           Navn #2? Andrea
           Navn #3? Povl
           Navn #4? Keld
           Kaj er det korteste navn. */
        String shortestName = "SurelyThisIsNotTheShortestNameAnyoneCouldThinkOf";
        int i = 0;
        while (i < n) {
            System.out.format("Please write name %d/%d: ", i+1, n);
            String name = scanner.nextLine();
            if (name.length() < shortestName.length()) {
                shortestName = name;
            }
            i++;
        }
        System.out.format("%s is the shortest name", shortestName);
    }

    public static void randomNumbers() {
        /*
        * Skriv en metode kaldet randomNumbers som indeholder et do/while loop
        * der gentagne gange udskriver tilfældige tal mellem 0 og 1000 indtil et nummer over 900 udskrives.
        * Der skal mindst skrives én linje, selv om det første nummer er over 900. Her er et eksempel:
            Random number: 235
            Random number: 15
            Random number: 810
            Random number: 147
            Random number: 915
        * */
        double randNum = Math.random() * 1000.0;
        do {
            System.out.println(randNum);
            randNum = Math.random() * 1000.0;
        } while (randNum < 900);
        System.out.println("\t\t" + randNum + " is bigger than 900");
    }

    public static void maxMin() {
        /*  Skriv en metode maxMin med et såkaldt sentinel loop
            som gentagne gange prompter brugeren til at taste et tal,
            og når tallet -1 (sentinel) bliver tastet viser maximum og minimum af de tal brugeren indtastede.
            Her er et eksempel:

            Skriv et tal (eller -1 for at afslutte): 5
            Skriv et tal (eller -1 for at afslutte): 2
            Skriv et tal (eller -1 for at afslutte): 17
            Skriv et tal (eller -1 for at afslutte): 8
            Skriv et tal (eller -1 for at afslutte): -1
            Maximum var 17
            Minimum var 2
            */

        Scanner scanner = null;
        String promptMsg = "Skriv et tal (eller -1 for at afslutte): ";
        try {
            scanner = new Scanner(System.in);
            int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
            while (scanner.hasNextInt()) {
                int nextInt = scanner.nextInt();
                if (nextInt == -1)  {
                    System.out.format("Maximum var %d\n" +
                                      "Minimum var %d\n\n", max, min);
                    System.out.println("Quitting the program.\n");
                    // Exit with no errors
                    System.exit(0);
                }
                System.out.println(nextInt);
                max = Math.max(nextInt, max);
                min = Math.min(nextInt, min);
                System.out.format("(%d, %d)\n", max, min);
            }
        } catch (NullPointerException e) {
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }

    public static void printMultiple(int n) {
        /*  Skriv en metode kalde printMultiple der tager en integer som parameter
            og bruger et såkaldt fencepost loop til at udskrive de første 10 gange af tallet,
            separeret med ordet ”og”. For eksempel vil et kald til metoden med tallet 5 give følgende:

            5 og 10 og 15 og 20 og 25 og 30 og 35 og 40 og 45 og 50 */
        for (int i = 1; i <= 10; i++) {
            int result = n * i;
            if (i == 10) {
                // End of print sentence
                System.out.format("%d.", result);
                return;
            }
            System.out.format("%d og ", result);
        }
    }

    public static int max(int[] values) {
        /*  Skriv en metode der hedder max og som tager et array af integers som parameter
            og returnerer den største værdi i arrayet.
            Du kan gå ud fra at arrayet indeholder mindst et element. */
        int max = Integer.MIN_VALUE;
        for (int v : values) {
            max = Math.max(v, max);
        }
        return max;
    }

    public static boolean allLess(int[] arr0, int[] arr1) {
        /*  Skriv en metode kaldet allLess der tager to arrays som parametre
            og returnerer true hvis hvert element i det første array
            er mindre end elementet på samme index i det andet array.
            Metoden returnerer false hvis arraysne ikke er lige lange. */
        if (arr0.length != arr1.length) {
            System.out.println("Array lengths must be equal.");
            return false;
        }
        for (int i = 0; i < arr0.length; i++) {
            if (arr0[i] >= arr1[i]) {
                return false;
            }
        }
        return true;
    }
}
