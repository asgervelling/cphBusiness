package dogkennel;

import java.util.Arrays;

public class Dog {

    private String name;
    private Owner owner;
    private boolean isHungry;

    private Dog[] offSpring;

    public Dog(String name, int numOffSpring) {
        this.name = name;
        this.isHungry = true;

        offSpring = new Dog[numOffSpring];
        for (int i = 0; i < numOffSpring; i++) {
            offSpring[i] = new Dog(String.format("offSpring %d", i), 0);
        }
    }

    @Override
    public String toString() {
        return "\nDogKennel.Dog{" +
                "\nname='" + name + '\'' +
                ",\nowner=" + owner +
                ",\nisHungry=" + isHungry +
                ",\noffSpring=" + Integer.toString(offSpring.length) +
                '}';
    }

    public String getName() {
        return this.name;
    }

    public Owner getOwner() {
        return this.owner;
    }

    public void setOwner(Owner o) {
        this.owner = o;
    }

    public void setOffSpring(int num) {
        if (num > offSpring.length) {
            addOffSpring(num);
        } else {
            // removeOffSpring();
        }
    }

    public void addOffSpring(int num) {
        System.out.println("Length: " + offSpring.length);
        if (num <= 0) {
            return;
        }
        int start = getOffSpringIndex();
        int end = offSpring.length + num;
        offSpring = Arrays.copyOf(offSpring, end);
        for (int i = start; i < end; i++) {
            System.out.println(i);
        }
        System.out.println("Start: " + start);
        System.out.println("End: " + end);
    }

    public int getOffSpringIndex() {
        for (int i = 0; i < offSpring.length; i++) {
            if (offSpring[i] == null) {
                return i;
            }
            else {
                System.out.println(offSpring[i]);
            }
        }
        return 0;
    }

    public void feedDog() {
        if (!this.isHungry) {
            System.out.println("I am not hungry");
            return;
        }
        isHungry = false;
    }

    public void printOffSpring() {
        for (Dog dog : offSpring) {
            System.out.println(dog);
        }
    }
}
