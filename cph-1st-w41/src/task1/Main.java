package task1;

public class Main {
    public static void main(String[] args) {
        Driver asger = new Driver("Asger", 24);
        Car asgersCar = new Car("Opel", "Astra", 1998, "5-door hatchback");

        asgersCar.setDriver(asger);
        System.out.println(asgersCar.toString());
        System.out.println(asger.toString());

        Car peugeot2008 = new Car("Peugeot", "2008", 2013, "5-door SUV");
        peugeot2008.setDriver(asger);
        System.out.println(asgersCar.toString());
        System.out.println(asger.toString());
    }
}
