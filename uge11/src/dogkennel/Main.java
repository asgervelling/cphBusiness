package dogkennel;

public class Main {
    public static void main(String[] args) {

        Dog motherDog = new Dog("motherDog", 3);
        motherDog.setOwner(new Owner("Peter"));

        System.out.println("hunden " + motherDog.getName() + " er ejet af " + motherDog.getOwner());

        motherDog.setOffSpring(5);

        System.out.println(motherDog);

    }
}
