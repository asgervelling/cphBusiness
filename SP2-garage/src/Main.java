public class Main {
    public static void main(String[] args) {
        /*
        * Skriv en main-metode der instantierer et Garage-objekt
        * og et antal bil-objekter af de 3 forskellige subtyper af Bil.
        * Tilføj bilerne til garagen. Skriv alle bilerne ud,
        * og kald også beregnGrønAfgiftForBilpark-metoden og skriv resultatet ud.
        * */
        Garage garage = new Garage("My garage");
        garage.addCar(new PetrolCar("MD 82 743", "Opel", "Astra", 1993,
                5, 43.2, 16.2));
        garage.addCar(new DieselCar("LS 72 832", "Nissan", "Dieselburner", 2007,
                3, false, 8));
        garage.addCar(new ElectricCar("IH 88 828", "Tesla", "Model S", 2016,
                5, 88.2, 300.0, 3.2));

        System.out.println(garage);
    }
}
